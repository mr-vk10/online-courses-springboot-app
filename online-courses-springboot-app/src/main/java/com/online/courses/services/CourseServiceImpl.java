package com.online.courses.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.online.courses.dao.CourseDao;
import com.online.courses.dto.CourseFormBean;
import com.online.courses.dto.CoursesDetailFormBean;
import com.online.courses.exceptions.CourseNotFoundException;
import com.online.courses.models.CourseMst;
import com.online.courses.repo.CourseDtlRepo;
import com.online.courses.repo.CourseMstRepo;

@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseMstRepo courseMstRepo;
	
	@Autowired
	private CourseDtlRepo courseDtlRepo;
	
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
	    
	    CoursesDetailFormBean coursesDetailFormBean = new CoursesDetailFormBean();
        return courseDao.getCourses(coursesDetailFormBean); 
    }

	@Override
	public CoursesDetailFormBean getCourse(long courseId) throws Exception{
		
	    /* 
	    Optional<CourseMst> courseMst = courseMstRepo.findById(courseId);
	    if(!courseMst.isPresent()) {
	        throw new CourseNotFoundException("Course with courseId: "+courseId+" not found.");
	    }
	    */
	    
	    // BeanUtils.copyProperties(course, course);
	    
	    CoursesDetailFormBean coursesDetailFormBean = new CoursesDetailFormBean();
        coursesDetailFormBean.setCourseMstId(courseId);
	    List<CoursesDetailFormBean> courses = null;
        try {
            courses = courseDao.getCourses(coursesDetailFormBean);
            if(courses==null || courses.isEmpty()) {
                throw new CourseNotFoundException("Course with courseId: "+courseId+" not found.");
            }
        } catch (Exception e) {
            throw e;
        }
	    
		return courses.get(0);
	}

	@Override
	public CourseMst saveCourse(CourseFormBean courseFormBean) {
		return courseMstRepo.save(courseFormBean.getCourseMst());	
	}

}
