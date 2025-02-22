package com.online.courses.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CourseErrorResponse {
    
    private int status;
    
    private String message;
    
    private long timeStamp;

}
