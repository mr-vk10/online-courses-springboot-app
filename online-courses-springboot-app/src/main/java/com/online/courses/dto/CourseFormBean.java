package com.online.courses.dto;

import com.online.courses.models.CourseMst;
import com.online.courses.models.ReviewMst;

public class CourseFormBean {
	
	private CourseMst courseMst;
	private ReviewMst reviewMst;

	public CourseFormBean() {
		
	}

	public CourseFormBean(CourseMst courseMst, ReviewMst reviewMst) {
		this.courseMst = courseMst;
		this.reviewMst = reviewMst;
	}

	public CourseMst getCourseMst() {
		return courseMst;
	}

	public void setCourseMst(CourseMst courseMst) {
		this.courseMst = courseMst;
	}

	public ReviewMst getReviewMst() {
		return reviewMst;
	}

	public void setReviewMst(ReviewMst reviewMst) {
		this.reviewMst = reviewMst;
	}

}
