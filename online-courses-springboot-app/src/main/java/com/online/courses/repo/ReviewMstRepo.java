package com.online.courses.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.online.courses.models.ReviewMst;

@Repository
public interface ReviewMstRepo extends JpaRepository<ReviewMst, Long> {
	
	List<ReviewMst> findByCourseMstId(Long courseMstId);

}
