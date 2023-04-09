package com.online.courses.services;

import java.util.List;

import com.online.courses.dto.AddCourseRequest;
import com.online.courses.dto.CoursesDetailFormBean;
import com.online.courses.models.CourseMst;

public interface CourseService {
	
    // List<CourseMst> getCourses();
    
	List<CoursesDetailFormBean> getCourses() throws Exception;
	
	CoursesDetailFormBean getCourse(long courseId) throws Exception;
	
	AddCourseRequest addNewCourse(AddCourseRequest addCourseRequest);

}
