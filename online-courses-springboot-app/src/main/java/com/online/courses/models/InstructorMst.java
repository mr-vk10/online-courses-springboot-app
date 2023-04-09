package com.online.courses.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

//annotate the class as an entity and map to db table
@Entity
@Table(name = "INSTRUCTOR_MST")
public class InstructorMst {

	// define the fields
	// annotate the fields with db columns

    @Id
    @GeneratedValue
	@Column(name = "INSTRUCTOR_MST_ID")
	private Long instructorMstId;

	// setup mapping to InstructorDetail entity
	/*
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "INSTRUCTOR_DTL_ID")
	private InstructorDtl instructorDtl;
	*/
	
	@Column(name = "ACTIVE_FLAG")
    private Long activeFlag;

	// create constructors

	public InstructorMst() {

	}

	public InstructorMst(Long activeFlag) {
		super();
		this.activeFlag = activeFlag;
	}

	// generate getters and setter methods

	public Long getInstructorMstId() {
		return instructorMstId;
	}

	public void setInstructorMstId(Long instructorMstId) {
		this.instructorMstId = instructorMstId;
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
        return "InstructorMst [instructorMstId=" + instructorMstId + ", activeFlag=" + activeFlag + "]";
    }
	
}
