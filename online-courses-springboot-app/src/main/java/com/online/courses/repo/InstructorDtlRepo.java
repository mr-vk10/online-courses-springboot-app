package com.online.courses.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.online.courses.models.InstructorDtl;

@Repository
public interface InstructorDtlRepo extends JpaRepository<InstructorDtl, Long> {

}
