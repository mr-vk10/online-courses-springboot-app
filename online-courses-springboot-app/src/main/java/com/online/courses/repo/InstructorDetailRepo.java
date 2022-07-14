package com.online.courses.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.online.courses.models.InstructorDetail;

@Repository
public interface InstructorDetailRepo extends JpaRepository<InstructorDetail, Integer> {

}
