package com.online.courses.dto;

import com.online.courses.models.Course;
import com.online.courses.models.Review;

public class CourseFormBean {
	
	private Course course;
	private Review review;

	public CourseFormBean() {
		
	}

	public CourseFormBean(Course course, Review review) {
		this.course = course;
		this.review = review;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public Review getReview() {
		return review;
	}

	public void setReview(Review review) {
		this.review = review;
	}

}
