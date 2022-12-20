package com.online.courses.services;

import java.util.List;

import com.online.courses.dto.CourseFormBean;
import com.online.courses.dto.ReviewFormBean;
import com.online.courses.models.ReviewMst;

public interface ReviewService {
	
	ReviewMst addCourseReview(CourseFormBean courseFormBean);
	
	ReviewFormBean getCourseReviews(long courseId);
	
	List<ReviewFormBean> fetchStudentReviews(long studentId) throws Exception;

}
