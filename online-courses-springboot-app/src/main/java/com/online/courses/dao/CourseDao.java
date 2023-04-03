package com.online.courses.dao;

import java.util.List;

import com.online.courses.dto.CoursesDetailFormBean;

public interface CourseDao {
    
    List<CoursesDetailFormBean> getCourses(CoursesDetailFormBean coursesDetailFormBean) throws Exception;

}
