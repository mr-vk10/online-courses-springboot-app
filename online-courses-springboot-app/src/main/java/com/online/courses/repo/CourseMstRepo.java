package com.online.courses.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.online.courses.models.CourseMst;

@Repository
public interface CourseMstRepo extends JpaRepository<CourseMst, Long> {

}
