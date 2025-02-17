package com.online.courses.dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CourseDtlDto {

    private Long courseDtlId;
    private Long courseMstId;
    private String title;
    private String courseDesc;
    private Long duration;
    private Long noOfLec;
    private Long level;
    private Long price;
    private Long activeFlag;

}
