package com.online.courses.services;

import java.math.BigInteger;
import java.util.List;

import com.online.courses.dto.AddCourseRequest;
import com.online.courses.dto.CourseMstDto;
import com.online.courses.dto.CoursesDetailFormBean;
import com.online.courses.models.CourseMst;

public interface CourseService {
	
    // List<CourseMst> getCourses();

	// CoursesDetailFormBean getCourses(int pageNo, int pageSize) throws Exception;

	List<CourseMstDto> getCourses(int pageNo, int pageSize) throws Exception;

	CoursesDetailFormBean getCourse(long courseId) throws Exception;
	
	AddCourseRequest addNewCourse(AddCourseRequest addCourseRequest);

}
