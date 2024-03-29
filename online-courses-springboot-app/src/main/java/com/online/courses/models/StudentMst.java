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

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="STUDENT_MST")
public class StudentMst {
	
    @Id
    @GeneratedValue
	@Column(name = "STUDENT_MST_ID")
	private Long studentMstId;

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
	
	@Column(name = "ACTIVE_FLAG")
    private Long activeFlag;
	
	public StudentMst() {
		
	}

	public StudentMst(String firstName, String lastName, String email, Long activeFlag) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.activeFlag = activeFlag;
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

	public List<CourseMst> getCourseMstLst() {
		return courseMstLst;
	}

	public void setCourseMstLst(List<CourseMst> courseMstLst) {
		this.courseMstLst = courseMstLst;
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
        return "StudentMst [studentMstId=" + studentMstId + ", firstName=" + firstName + ", lastName=" + lastName
                + ", email=" + email + ", courseMstLst=" + courseMstLst + ", activeFlag=" + activeFlag + "]";
    }	
}
