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
@Table(name="REVIEW_MST")
public class ReviewMst {
	
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="REVIEW_MST_ID")
	private Long reviewMstId; 
	
	@Column(name="COMMENT")
	private String comment;
	
	@Column(name="COURSE_MST_ID")
	private Long courseMstId;
	
	@Column(name="STUDENT_MST_ID")
	private Long studentMstId;
	
	@Column(name = "ACTIVE_FLAG")
    private Long activeFlag;
	
	// As there is uni directional relationship between a review and course i.e.
	// we cannot fetch a course from its review
	// so we do not define a field for it here

}
