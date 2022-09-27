package com.online.courses.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.online.courses.models.InstructorMst;

@Repository
public interface InstructorMstRepo extends JpaRepository<InstructorMst, Integer> {

}
