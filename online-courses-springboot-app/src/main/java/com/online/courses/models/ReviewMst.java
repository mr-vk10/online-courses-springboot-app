package com.online.courses.models;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="REVIEW_MST")
public class ReviewMst {
	
    @Id
    @GeneratedValue
	@Column(name="REVIEW_MST_ID")
	private Long reviewMstId; 
	
	@Column(name="COMMENT")
	private String comment;
	
	@Column(name="COURSE_MST_ID")
	private Long courseMstId;
	
	@Column(name="STUDENT_MST_ID")
	private Long studentMstId;
	
	@Column(name = "ACTIVE_FLAG")
    private Long activeFlag;
	
	// As there is uni directional relationship between a review and course i.e.
	// we cannot fetch a course from its review
	// so we do not define a field for it here
		
	public ReviewMst() {
		
	}

	public ReviewMst(String comment, Long courseMstId, Long studentMstId, Long activeFlag) {
		this.comment = comment;
		this.courseMstId = courseMstId;
		this.studentMstId = studentMstId;
		this.activeFlag = activeFlag;
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

	public Long getCourseMstId() {
		return courseMstId;
	}

	public void setCourseMstId(Long courseMstId) {
		this.courseMstId = courseMstId;
	}

	public Long getStudentMstId() {
		return studentMstId;
	}

	public void setStudentMstId(Long studentMstId) {
		this.studentMstId = studentMstId;
	}
	
	public Long getActiveFlag() {
        return activeFlag;
    }

    public void setActiveFlag(Long activeFlag) {
        this.activeFlag = activeFlag;
    }

    // generate toString method
    
    @Override
    public String toString() {
        return "ReviewMst [reviewMstId=" + reviewMstId + ", comment=" + comment + ", courseMstId=" + courseMstId
                + ", studentMstId=" + studentMstId + ", activeFlag=" + activeFlag + "]";
    }	
}
