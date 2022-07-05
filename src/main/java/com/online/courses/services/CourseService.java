package com.online.courses.services;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.RequestBody;

import com.online.courses.dto.CourseFormBean;
import com.online.courses.models.Course;
import com.online.courses.repo.CourseRepo;

public interface CourseService {
	
	List<Course> getCourses();
	
	Optional<Course> getCourse(int courseId);
	
	Course saveCourse(CourseFormBean courseFormBean);

}
