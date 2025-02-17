package com.online.courses.dto;

import com.online.courses.models.CourseDtl;
import com.online.courses.models.InstructorDtl;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AddCourseRequest {
    
    private CourseDtl courseDtl;
    
    private InstructorDtl instructorDtl;
    
    private boolean newInstructorFlag;
    
}
