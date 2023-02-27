package com.online.courses.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="COURSE_DTL")
public class CourseDtl {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="COURSE_DTL_ID")
    private Long courseDtlId;
    
    @Column(name = "COURSE_MST_ID")
    private Long courseMstId;
    
    @Column(name = "TITLE")
    private String title;
    
    @Column(name = "COURSE_DESC")
    private String courseDesc;
    
    @Column(name = "DURATION")
    private Long duration;
    
    @Column(name = "NO_OF_LEC")
    private Long noOfLec;
    
    @Column(name = "LEVEL")
    private Long level;
    
    @Column(name = "PRICE")
    private Long price;
    
    @Column(name = "ACTIVE_FLAG")
    private Long activeFlag;

    public Long getCourseDtlId() {
        return courseDtlId;
    }

    public void setCourseDtlId(Long courseDtlId) {
        this.courseDtlId = courseDtlId;
    }

    public Long getCourseMstId() {
        return courseMstId;
    }

    public void setCourseMstId(Long courseMstId) {
        this.courseMstId = courseMstId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCourseDesc() {
        return courseDesc;
    }

    public void setCourseDesc(String courseDesc) {
        this.courseDesc = courseDesc;
    }

    public Long getDuration() {
        return duration;
    }

    public void setDuration(Long duration) {
        this.duration = duration;
    }

    public Long getNoOfLec() {
        return noOfLec;
    }

    public void setNoOfLec(Long noOfLec) {
        this.noOfLec = noOfLec;
    }

    public Long getLevel() {
        return level;
    }

    public void setLevel(Long level) {
        this.level = level;
    }
    
    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Long getActiveFlag() {
        return activeFlag;
    }

    public void setActiveFlag(Long activeFlag) {
        this.activeFlag = activeFlag;
    }

    @Override
    public String toString() {
        return "CourseDtl [courseDtlId=" + courseDtlId + ", courseMstId=" + courseMstId + ", title=" + title
                + ", courseDesc=" + courseDesc + ", duration=" + duration + ", noOfLec=" + noOfLec + ", level=" + level
                + ", price=" + price + ", activeFlag=" + activeFlag + "]";
    }    
        
}
