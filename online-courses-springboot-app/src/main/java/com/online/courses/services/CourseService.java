package com.online.courses.services;

import java.util.List;
import java.util.Optional;

import com.online.courses.dto.CourseFormBean;
import com.online.courses.models.CourseMst;

public interface CourseService {
	
	List<CourseMst> getCourses();
	
	Optional<CourseMst> getCourse(int courseId);
	
	CourseMst saveCourse(CourseFormBean courseFormBean);

}
