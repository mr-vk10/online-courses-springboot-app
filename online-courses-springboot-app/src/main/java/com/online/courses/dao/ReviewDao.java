package com.online.courses.dao;

import java.util.List;

import com.online.courses.dto.ReviewFormBean;

public interface ReviewDao {
	public List<ReviewFormBean> fetchStudentReviews (int studentId) throws Exception;
}
