package com.online.courses.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.online.courses.models.Course;

@Repository
public interface CourseRepo extends JpaRepository<Course, Integer> {

}
