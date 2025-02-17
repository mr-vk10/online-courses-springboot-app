package com.online.courses.dto;

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
public class CourseFormBean {
	
	private CourseMst courseMst;
	private ReviewMst reviewMst;

}
