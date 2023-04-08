package com.online.courses.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="COURSE_MST")
public class CourseMst {
	
	@Id
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name="uuid2", strategy = "org.hibernate.id.UUIDGenerator")
	@Column(name="COURSE_MST_ID")
	private Long courseMstId;
	
	// Here we are not applying Cascade DELETE. i.e. if you deleted a course, donot delete the instructor
	@ManyToOne(cascade= {CascadeType.PERSIST,CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
	@JoinColumn(name="INSTRUCTOR_MST_ID")
	InstructorMst instructorMst;
	
	@Column(name = "ACTIVE_FLAG")
	private Long activeFlag;
		
	public CourseMst() {
		
	}

	public CourseMst(InstructorMst instructorMst, Long activeFlag) {
		this.instructorMst = instructorMst;
		this.activeFlag = activeFlag;
	}

	public Long getCourseMstId() {
		return courseMstId;
	}

	public void setCourseMstId(Long courseMstId) {
		this.courseMstId = courseMstId;
	}

	public InstructorMst getInstructorMst() {
		return instructorMst;
	}

	public void setInstructorMst(InstructorMst instructorMst) {
		this.instructorMst = instructorMst;
	}
	
	public Long getActiveFlag() {
        return activeFlag;
    }

    public void setActiveFlag(Long activeFlag) {
        this.activeFlag = activeFlag;
    }

    @Override
    public String toString() {
        return "CourseMst [courseMstId=" + courseMstId + ", instructorMst=" + instructorMst
                + ", activeFlag=" + activeFlag + "]";
    }
	
}
