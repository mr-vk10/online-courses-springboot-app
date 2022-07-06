package com.online.courses.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.online.courses.models.Review;

@Repository
public interface ReviewRepo extends JpaRepository<Review, Integer> {
	
	List<Review> findByCourseId(String courseId);

}
