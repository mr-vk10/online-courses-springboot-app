package com.online.courses.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "INSTRUCTOR_DTL")
public class InstructorDtl {

	// define the fields
	// annotate the fields with db columns

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

}
