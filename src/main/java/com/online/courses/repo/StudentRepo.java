package com.online.courses.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.online.courses.models.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {

}
