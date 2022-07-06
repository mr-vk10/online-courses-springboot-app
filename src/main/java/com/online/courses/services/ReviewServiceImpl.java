package com.online.courses.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.online.courses.dto.CourseFormBean;
import com.online.courses.dto.ReviewFormBean;
import com.online.courses.models.Review;
import com.online.courses.repo.CourseRepo;
import com.online.courses.repo.ReviewRepo;

@Service
public class ReviewServiceImpl implements ReviewService {

	@Autowired
	private ReviewRepo reviewRepo;
	
	@Autowired
	private CourseRepo courseRepo;
	
	@Override
	public Review addCourseReview(CourseFormBean courseFormBean) {
		return reviewRepo.save(courseFormBean.getReview());
	}

	@Override
	public ReviewFormBean getCourseReviews(int courseId) {
		
		ReviewFormBean reviews = new ReviewFormBean();
		reviews.setReview(reviewRepo.findByCourseId(String.valueOf(courseId)));
		reviews.setCourse(courseRepo.findById(courseId));
		return reviews;
	}

}
