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
import javax.persistence.Table;

@Entity
@Table(name="STUDENT_MST")
public class StudentMst {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "STUDENT_MST_ID")
	private int studentMstId;

	@Column(name = "FIRST_NAME")
	private String firstName;

	@Column(name = "LAST_NAME")
	private String lastName;

	@Column(name = "EMAIL")
	private String email;
	
	// for @ManyToMany mapping we use @JoinTable in both Entities
	@ManyToMany(cascade= {CascadeType.PERSIST,CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
	@JoinTable(name="course_student",
		joinColumns = @JoinColumn(name="student_id")	,
		inverseJoinColumns = @JoinColumn(name="course_id")
	)
	private List<CourseMst> courseMstLst;
	
	public StudentMst() {
		
	}

	public StudentMst(String firstName, String lastName, String email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}

	
	public int getStudentMstId() {
		return studentMstId;
	}

	public void setStudentMstId(int studentMstId) {
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

	public List<CourseMst> getCourseMstLst() {
		return courseMstLst;
	}

	public void setCourseMstLst(List<CourseMst> courseMstLst) {
		this.courseMstLst = courseMstLst;
	}

	@Override
	public String toString() {
		return "Student [studentMstId=" + studentMstId + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + "]";
	}
	
}
