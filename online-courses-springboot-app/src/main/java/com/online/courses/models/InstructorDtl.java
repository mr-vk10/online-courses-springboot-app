package com.online.courses.models;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

//annotate the class as an entity and map to db table
@Entity
@Table(name = "INSTRUCTOR_DTL")
public class InstructorDtl {

	// define the fields
	// annotate the fields with db columns

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "INSTRUCTOR_DTL_ID")
	private Long instructorDtlId;

	@Column(name = "YOUTUBE_CHANNEL")
	private String youtubeChannel;

	@Column(name = "HOBBY")
	private String hobby;

	// create constructors

	public InstructorDtl() {

	}

	public InstructorDtl(String youtubeChannel, String hobby) {
		this.youtubeChannel = youtubeChannel;
		this.hobby = hobby;
	}

	// generate getters and setter methods

	public Long getInstructorDtlId() {
		return instructorDtlId;
	}

	public void setInstructorDtlId(Long instructorDtlId) {
		this.instructorDtlId = instructorDtlId;
	}
	
	public String getYoutubeChannel() {
		return youtubeChannel;
	}

	public void setYoutubeChannel(String youtubeChannel) {
		this.youtubeChannel = youtubeChannel;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	// generate toString method

	@Override
	public String toString() {
		return "InstructorDetail [instructorDtlId=" + instructorDtlId + ", youtubeChannel=" + youtubeChannel + ", hobby=" + hobby + "]";
	}

}
