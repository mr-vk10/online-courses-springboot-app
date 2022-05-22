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
@Table(name="course")
public class Course {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	int id;
	
	@Column(name="title")
	String title;
	
	// Here we are not applying Cascade DELETE. i.e. if you deleted a course, donot delete the instructor
	@ManyToOne(cascade= {CascadeType.PERSIST,CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
	@JoinColumn(name="instructor_id")
	Instructor instructor;
	
	// As this is unidirectional OneToMany mapping, the name in JoinColumn refers to the column in review table
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="course_id")
	private List<Review> review;
	
	// for @ManyToMany mapping we use @JoinTable in both Entities
	@ManyToMany(cascade= {CascadeType.PERSIST,CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
	@JoinTable(name="course_student",
		joinColumns = @JoinColumn(name="course_id")	,
		inverseJoinColumns = @JoinColumn(name="student_id")
	)
	private List<Student> students;
	
	public Course() {
		
	}

	public Course(String title, Instructor instructor) {
		this.title = title;
		this.instructor = instructor;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Instructor getInstructor() {
		return instructor;
	}

	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}
	
	public List<Review> getReview() {
		return review;
	}

	public void setReview(List<Review> review) {
		this.review = review;
	}
	
	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", title=" + title + ", instructor=" + instructor + "]";
	}
	
}
