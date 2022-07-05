package com.online.courses.services;

import java.util.List;

import com.online.courses.dto.CourseFormBean;
import com.online.courses.models.Review;

public interface ReviewService {
	
	Review addCourseReview(CourseFormBean courseFormBean);
	
	List<Review> getCourseReviews(int courseId);

}
