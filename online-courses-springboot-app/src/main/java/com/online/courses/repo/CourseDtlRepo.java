package com.online.courses.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.online.courses.models.CourseDtl;

public interface CourseDtlRepo extends JpaRepository<CourseDtl, Long> {

}
