package com.online.courses.services;

import com.online.courses.dto.CourseFormBean;
import com.online.courses.dto.ReviewFormBean;
import com.online.courses.models.Review;

public interface ReviewService {
	
	Review addCourseReview(CourseFormBean courseFormBean);
	
	ReviewFormBean getCourseReviews(int courseId);

}
