package com.online.courses.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CourseMstDto {

    private Long courseMstId;
    private Long instructorMstId;
    private Long activeFlag;
}
