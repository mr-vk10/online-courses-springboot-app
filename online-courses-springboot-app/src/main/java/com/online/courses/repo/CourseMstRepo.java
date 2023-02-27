package com.online.courses.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.online.courses.dto.CoursesDetailFormBean;
import com.online.courses.models.CourseMst;
@Repository
public interface CourseMstRepo extends JpaRepository<CourseMst, Long> {

    @Query(value = "SELECT "
            + "courseDtl.COURSE_DTL_ID as courseDtlId, "
            + "courseDtl.TITLE as title, "
            + "courseDtl.COURSE_DESC as courseDesc, "
            + "courseDtl.DURATION as duration, "
            + "courseDtl.NO_OF_LEC as noOfLec, "
            + "courseDtl.LEVEL as level, "
            + "courseDtl.PRICE as price, "
            + "instructorDtl.INSTRUCTOR_DTL_ID as instructorDtlId, "
            + "instructorDtl.INSTRUCTOR_MST_ID as instructorMstId, "
            + "instructorDtl.FIRST_NAME as firstName, "
            + "instructorDtl.LAST_NAME as lastName "
            + "FROM COURSE_MST courseMst "
            + "join COURSE_DTL courseDtl on courseDtl.COURSE_MST_ID = courseMst.COURSE_MST_ID "
            + "join INSTRUCTOR_MST instructorMst on instructorMst.INSTRUCTOR_MST_ID = courseMst.INSTRUCTOR_MST_ID "
            + "join INSTRUCTOR_DTL instructorDtl on instructorDtl.INSTRUCTOR_MST_ID = instructorMst.INSTRUCTOR_MST_ID "
            + "where "
            + "courseMst.ACTIVE_FLAG = ?1 "
            + "AND courseDtl.ACTIVE_FLAG = ?1 "
            + "AND instructorMst.ACTIVE_FLAG = ?1 "
            + "AND instructorDtl.ACTIVE_FLAG = ?1 ", nativeQuery = true)
    List<CoursesDetailFormBean> getCourses(int activeFlag);
}
