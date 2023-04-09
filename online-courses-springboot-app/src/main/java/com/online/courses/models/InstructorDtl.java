package com.online.courses.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

//annotate the class as an entity and map to db table
@Entity
@Table(name = "INSTRUCTOR_DTL")
public class InstructorDtl {

	// define the fields
	// annotate the fields with db columns

    @Id
    @GeneratedValue
	@Column(name = "INSTRUCTOR_DTL_ID")
	private Long instructorDtlId;
	
	@Column(name = "INSTRUCTOR_MST_ID")
    private Long instructorMstId;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "EMAIL")
    private String email;
	
	@Column(name = "YOUTUBE_CHANNEL")
	private String youtubeChannel;

	@Column(name = "HOBBY")
	private String hobby;
	
	@Column(name = "ACTIVE_FLAG")
    private Long activeFlag;

	// create constructors

	public InstructorDtl() {

	}

	public InstructorDtl(String youtubeChannel, String hobby, Long activeFlag) {
		this.youtubeChannel = youtubeChannel;
		this.hobby = hobby;
		this.activeFlag = activeFlag;
	}

	// generate getters and setter methods

	public Long getInstructorDtlId() {
		return instructorDtlId;
	}

	public void setInstructorDtlId(Long instructorDtlId) {
		this.instructorDtlId = instructorDtlId;
	}
		
	public Long getInstructorMstId() {
        return instructorMstId;
    }

    public void setInstructorMstId(Long instructorMstId) {
        this.instructorMstId = instructorMstId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
	
	public Long getActiveFlag() {
        return activeFlag;
    }

    public void setActiveFlag(Long activeFlag) {
        this.activeFlag = activeFlag;
    }

    // generate toString method
    @Override
    public String toString() {
        return "InstructorDtl [instructorDtlId=" + instructorDtlId + ", instructorMstId=" + instructorMstId
                + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", youtubeChannel="
                + youtubeChannel + ", hobby=" + hobby + ", activeFlag=" + activeFlag + "]";
    }   

}
