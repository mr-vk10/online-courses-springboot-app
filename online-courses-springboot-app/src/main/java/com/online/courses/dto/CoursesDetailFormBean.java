package com.online.courses.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigInteger;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CoursesDetailFormBean {

    private Long courseDtlId;
    
    private Long courseMstId;
    
    private String title;
    
    private String courseDesc;

    private Long duration;

    private Long noOfLec;

    private Long level;
    
    private String levelStr;
    
    private Long price;
    
    private Long instructorDtlId;
    
    private Long instructorMstId;

    private String firstName;

    private String lastName;

    private String email;

    private String youtubeChannel;

    private String hobby;
    
    private BigInteger pageNo; 
    
    private BigInteger pageSize;
    
    private List<CoursesDetailFormBean> coursesDetailList;

    private int totalCourses;
}
