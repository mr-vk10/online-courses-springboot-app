package com.online.courses.dto;

import java.util.List;
import java.util.Optional;

import com.online.courses.models.CourseMst;
import com.online.courses.models.ReviewMst;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ReviewFormBean {
	
	private Long reviewMstId; 
	private String comment;
	
	private Long studentMstId;
	private String firstName;
	private String lastName;
	private String email;
	
	private Optional<CourseMst> courseMst;
	private List<ReviewMst> reviewMst;

}
