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

@Entity
@Table(name="COURSE_MST")
public class CourseMst {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="COURSE_MST_ID")
	Long courseMstId;
	
	@Column(name="TITLE")
	String title;
	
	// Here we are not applying Cascade DELETE. i.e. if you deleted a course, donot delete the instructor
	@ManyToOne(cascade= {CascadeType.PERSIST,CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
	@JoinColumn(name="INSTRUCTOR_MST_ID")
	InstructorMst instructorMst;
		
	public CourseMst() {
		
	}

	public CourseMst(String title, InstructorMst instructorMst) {
		this.title = title;
		this.instructorMst = instructorMst;
	}

	public Long getCourseMstId() {
		return courseMstId;
	}

	public void setCourseMstId(Long courseMstId) {
		this.courseMstId = courseMstId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public InstructorMst getInstructorMst() {
		return instructorMst;
	}

	public void setInstructorMst(InstructorMst instructorMst) {
		this.instructorMst = instructorMst;
	}

	@Override
	public String toString() {
		return "CourseMst [courseMstId=" + courseMstId + ", title=" + title + ", instructorMst=" + instructorMst + "]";
	}
	
}
