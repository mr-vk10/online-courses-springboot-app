package com.online.courses.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="COURSE_MST")
public class CourseMst {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="COURSE_MST_ID")
	private Long courseMstId;
	
	// Here we are not applying Cascade DELETE. i.e. if you deleted a course, donot delete the instructor
	/*
	@ManyToOne(cascade= {CascadeType.PERSIST,CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
	@JoinColumn(name="INSTRUCTOR_MST_ID")
	InstructorMst instructorMst;
	*/
	@Column(name="INSTRUCTOR_MST_ID")
	private Long instructorMstId;
	
	@Column(name = "ACTIVE_FLAG")
	private Long activeFlag;

}
