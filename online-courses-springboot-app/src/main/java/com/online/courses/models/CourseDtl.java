package com.online.courses.models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
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


        
}
