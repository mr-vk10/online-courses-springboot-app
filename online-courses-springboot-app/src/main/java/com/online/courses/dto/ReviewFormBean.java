package com.online.courses.dto;

import java.util.List;
import java.util.Optional;

import com.online.courses.models.Course;
import com.online.courses.models.Review;

public class ReviewFormBean {
	
	private Optional<Course> course;
	private List<Review> review;
	
	public Optional<Course> getCourse() {
		return course;
	}
	public void setCourse(Optional<Course> course) {
		this.course = course;
	}
	public List<Review> getReview() {
		return review;
	}
	public void setReview(List<Review> review) {
		this.review = review;
	}
	@Override
	public String toString() {
		return "ReviewFormBean [course=" + course + ", review=" + review + "]";
	}

}
