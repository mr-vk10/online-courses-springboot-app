package com.online.courses.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.online.courses.models.StudentMst;

@Repository
public interface StudentMstRepo extends JpaRepository<StudentMst, Long> {

}
