package com.online.courses.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.online.courses.dao.CourseDao;
import com.online.courses.dto.CourseFormBean;
import com.online.courses.dto.CoursesDetailFormBean;
import com.online.courses.models.CourseMst;
import com.online.courses.repo.CourseMstRepo;

@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseMstRepo courseMstRepo;
	
	@Autowired
    private CourseDao courseDao;
	/*
	@Override
	public List<CourseMst> getCourses() {
		return courseMstRepo.findAll();	
	}
	*/
	
	@Override
    public List<CoursesDetailFormBean> getCourses() throws Exception {
        return courseDao.getCourses(); 
    }

	@Override
	public Optional<CourseMst> getCourse(long courseId) {
		
		return courseMstRepo.findById(courseId);
	}

	@Override
	public CourseMst saveCourse(CourseFormBean courseFormBean) {
		return courseMstRepo.save(courseFormBean.getCourseMst());	
	}

}
