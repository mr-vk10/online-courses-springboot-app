package com.online.courses.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.online.courses.dto.CourseFormBean;
import com.online.courses.models.Course;
import com.online.courses.repo.CourseRepo;

@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseRepo courseRepo;
	
	@Override
	public List<Course> getCourses() {
		return courseRepo.findAll();	
	}

	@Override
	public Optional<Course> getCourse(int courseId) {
		
		return courseRepo.findById(courseId);
	}

	@Override
	public Course saveCourse(CourseFormBean courseFormBean) {
		return courseRepo.save(courseFormBean.getCourse());
		
	}
	
	

}
