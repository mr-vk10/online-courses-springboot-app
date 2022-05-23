package com.online.courses.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.online.courses.models.Instructor;

@Repository
public interface InstructorRepo extends JpaRepository<Instructor, Integer> {

}
