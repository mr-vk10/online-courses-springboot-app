 package com.online.courses.controller;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.online.courses.dto.AddCourseRequest;
import com.online.courses.dto.CourseFormBean;
import com.online.courses.dto.CoursesDetailFormBean;
import com.online.courses.dto.ReviewFormBean;
import com.online.courses.models.ReviewMst;
import com.online.courses.services.CourseService;
import com.online.courses.services.ReviewService;


@RestController
// @RequestMapping("/api") // add api as base	
public class MyRestController {

	@Autowired
	private CourseService courseService;
	
	@Autowired
	private ReviewService reviewService;
	
	@GetMapping("/")
	public String sayHello() {
		return "Hello world time on server is: "+LocalDateTime.now();
	}
	
	/*
	@GetMapping("/courses")
	public List<CourseMst> getCourses() {
		return courseService.getCourses();
	}
	*/
	
	@GetMapping("/courses")
    public List<CoursesDetailFormBean> getCourses() throws Exception{
        return courseService.getCourses();
    }
	
	@GetMapping("/courses/{courseId}")
	public CoursesDetailFormBean getCourse(@PathVariable long courseId) throws Exception{
		return courseService.getCourse(courseId);
	}
	
	@PostMapping("/courses")
	public AddCourseRequest addNewCourse(@RequestBody AddCourseRequest addCourseRequest) {
		return courseService.addNewCourse(addCourseRequest);
	}
	
	@PostMapping("/review")
	public ReviewMst postReview(@RequestBody CourseFormBean courseFormBean) {
		return reviewService.addCourseReview(courseFormBean);
	}
	
	@GetMapping("/review/course/{courseId}")
	public ReviewFormBean getCourseReviews(@PathVariable long courseId) {
		return reviewService.getCourseReviews(courseId);
	}
	
	@GetMapping("/review/student/{studentId}")
	public List<ReviewFormBean> getStudentReviews(@PathVariable long studentId) throws Exception{
		System.out.println("Here");
		return reviewService.fetchStudentReviews(studentId);
	}

}
