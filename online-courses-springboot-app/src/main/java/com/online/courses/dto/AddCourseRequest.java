package com.online.courses.dto;

import com.online.courses.models.CourseDtl;
import com.online.courses.models.InstructorDtl;

public class AddCourseRequest {
    
    private CourseDtl courseDtl;
    
    private InstructorDtl instructorDtl;
    
    private boolean newInstructorFlag;

    public AddCourseRequest() {
        super();
    }

    public AddCourseRequest(CourseDtl courseDtl, InstructorDtl instructorDtl, boolean newInstructorFlag) {
        super();
        this.courseDtl = courseDtl;
        this.instructorDtl = instructorDtl;
        this.newInstructorFlag = newInstructorFlag;
    }

    public CourseDtl getCourseDtl() {
        return courseDtl;
    }

    public void setCourseDtl(CourseDtl courseDtl) {
        this.courseDtl = courseDtl;
    }

    public InstructorDtl getInstructorDtl() {
        return instructorDtl;
    }

    public void setInstructorDtl(InstructorDtl instructorDtl) {
        this.instructorDtl = instructorDtl;
    }

    public boolean isNewInstructorFlag() {
        return newInstructorFlag;
    }

    public void setNewInstructorFlag(boolean newInstructorFlag) {
        this.newInstructorFlag = newInstructorFlag;
    }

    @Override
    public String toString() {
        return "AddCourseRequest [courseDtl=" + courseDtl + ", instructorDtl=" + instructorDtl + ", newInstructorFlag="
                + newInstructorFlag + "]";
    }
    
}
