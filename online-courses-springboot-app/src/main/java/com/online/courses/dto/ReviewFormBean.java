package com.online.courses.dto;

import java.util.List;
import java.util.Optional;

import javax.persistence.Column;

import com.online.courses.models.CourseMst;
import com.online.courses.models.ReviewMst;

public class ReviewFormBean {
	
	private Long reviewMstId; 
	private String comment;
	
	private Long studentMstId;
	private String firstName;
	private String lastName;
	private String email;
	
	private Optional<CourseMst> courseMst;
	private List<ReviewMst> reviewMst;
	
	public Optional<CourseMst> getCourse() {
		return courseMst;
	}
	public void setCourse(Optional<CourseMst> courseMst) {
		this.courseMst = courseMst;
	}
	public List<ReviewMst> getReviewMst() {
		return reviewMst;
	}
	public void setReview(List<ReviewMst> reviewMst) {
		this.reviewMst = reviewMst;
	}
		
	public Long getReviewMstId() {
		return reviewMstId;
	}
	public void setReviewMstId(Long reviewMstId) {
		this.reviewMstId = reviewMstId;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public Long getStudentMstId() {
		return studentMstId;
	}
	public void setStudentMstId(Long studentMstId) {
		this.studentMstId = studentMstId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Optional<CourseMst> getCourseMst() {
		return courseMst;
	}
	public void setCourseMst(Optional<CourseMst> courseMst) {
		this.courseMst = courseMst;
	}
	public void setReviewMst(List<ReviewMst> reviewMst) {
		this.reviewMst = reviewMst;
	}
	
	@Override
	public String toString() {
		return "ReviewFormBean [courseMst=" + courseMst + ", reviewMst=" + reviewMst + "]";
	}

}
