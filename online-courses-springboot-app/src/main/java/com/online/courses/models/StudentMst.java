package com.online.courses.models;

import java.util.List;

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
@Table(name="STUDENT_MST")
public class StudentMst {
	
    @Id
	@GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
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
}
