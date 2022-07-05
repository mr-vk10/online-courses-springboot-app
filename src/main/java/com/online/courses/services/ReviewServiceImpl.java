package com.online.courses.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.online.courses.dto.CourseFormBean;
import com.online.courses.models.Review;
import com.online.courses.repo.ReviewRepo;

@Service
public class ReviewServiceImpl implements ReviewService {

	@Autowired
	private ReviewRepo reviewRepo;
	
	@Override
	public Review addCourseReview(CourseFormBean courseFormBean) {
		return reviewRepo.save(courseFormBean.getReview());
	}

	@Override
	public List<Review> getCourseReviews(int courseId) {
		// TODO Auto-generated method stub
		return null;
	}

}
