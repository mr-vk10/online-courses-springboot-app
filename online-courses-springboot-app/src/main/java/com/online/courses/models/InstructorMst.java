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
@Table(name = "INSTRUCTOR_MST")
public class InstructorMst {

	// define the fields
	// annotate the fields with db columns

    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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
	
}
