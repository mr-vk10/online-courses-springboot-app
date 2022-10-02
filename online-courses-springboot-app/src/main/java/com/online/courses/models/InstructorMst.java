package com.online.courses.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

//annotate the class as an entity and map to db table
@Entity
@Table(name = "INSTRUCTOR_MST")
public class InstructorMst {

	// define the fields
	// annotate the fields with db columns

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "INSTRUCTOR_MST_ID")
	private Long instructorMstId;

	@Column(name = "FIRST_NAME")
	private String firstName;

	@Column(name = "LAST_NAME")
	private String lastName;

	@Column(name = "EMAIL")
	private String email;

	// setup mapping to InstructorDetail entity
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "INSTRUCTOR_DTL_ID")
	private InstructorDtl instructorDtl;

	// create constructors

	public InstructorMst() {

	}

	public InstructorMst(String firstName, String lastName, String email, InstructorDtl instructorDtl) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.instructorDtl = instructorDtl;
	}

	// generate getters and setter methods

	public Long getInstructorMstId() {
		return instructorMstId;
	}

	public void setInstructorMstId(Long instructorMstId) {
		this.instructorMstId = instructorMstId;
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

	public InstructorDtl getInstructorDtl() {
		return instructorDtl;
	}

	public void setInstructorDtl(InstructorDtl instructorDtl) {
		this.instructorDtl = instructorDtl;
	}
	
	// generate toString method

	@Override
	public String toString() {
		return "InstructorMst [instructorMstId=" + instructorMstId + ", firstName=" + firstName + ", lastName="
				+ lastName + ", email=" + email + ", instructorDtl=" + instructorDtl + "]";
	}
}
