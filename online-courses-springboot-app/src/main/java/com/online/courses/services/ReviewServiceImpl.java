package com.online.courses.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.online.courses.dao.ReviewDao;
import com.online.courses.dto.CourseFormBean;
import com.online.courses.dto.ReviewFormBean;
import com.online.courses.models.ReviewMst;
import com.online.courses.repo.CourseMstRepo;
import com.online.courses.repo.ReviewMstRepo;

@Service
public class ReviewServiceImpl implements ReviewService {

	@Autowired
	private ReviewMstRepo reviewMstRepo;
	
	@Autowired
	private CourseMstRepo courseMstRepo;
	
	@Autowired
	private ReviewDao reviewDao;
	
	@Override
	public ReviewMst addCourseReview(CourseFormBean courseFormBean) {
		return reviewMstRepo.save(courseFormBean.getReviewMst());
	}

	@Override
	public ReviewFormBean getCourseReviews(long courseId) {
		
		ReviewFormBean reviews = new ReviewFormBean();
		reviews.setReview(reviewMstRepo.findByCourseMstId(courseId));
		reviews.setCourse(courseMstRepo.findById(courseId));
		return reviews;
	}

	@Override
	public List<ReviewFormBean> fetchStudentReviews(long studentId) throws Exception {
		
		return reviewDao.fetchStudentReviews(studentId);
	}
	
	

}
