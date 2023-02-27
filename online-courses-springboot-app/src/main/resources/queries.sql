SELECT  
reviewMst.REVIEW_MST_ID as reviewMstId, 
reviewMst.COMMENT as comment, 
studentMst.STUDENT_MST_ID as studentMstId, 
studentMst.EMAIL as email, 
studentMst.FIRST_NAME as firstName, 
studentMst.LAST_NAME as lastName 
FROM REVIEW_MST reviewMst 
join STUDENT_MST StudentMst on studentMst.STUDENT_MST_ID = reviewMst.STUDENT_MST_ID 
where  studentMst.STUDENT_MST_ID =:studentMstId


SELECT  
courseDtl.COURSE_DTL_ID as courseDtlId, 
courseDtl.TITLE as title, 
courseDtl.COURSE_DESC as courseDesc, 
courseDtl.DURATION as duration, 
courseDtl.NO_OF_LEC as noOfLec, 
courseDtl.LEVEL as level,
case when courseDtl.LEVEL = 1 then 'Beginner' when courseDtl.LEVEL = 2 then 'Intermediate' when courseDtl.LEVEL = 3 then 'All Level' end as levelStr,
courseDtl.PRICE as price,
instructorDtl.INSTRUCTOR_DTL_ID as instructorDtlId,
instructorDtl.INSTRUCTOR_MST_ID as instructorMstId,
instructorDtl.FIRST_NAME as firstName,
instructorDtl.LAST_NAME as lastName
FROM COURSE_MST courseMst 
join COURSE_DTL courseDtl on courseDtl.COURSE_MST_ID = courseMst.COURSE_MST_ID
join INSTRUCTOR_MST instructorMst on instructorMst.INSTRUCTOR_MST_ID = courseMst.INSTRUCTOR_MST_ID
join INSTRUCTOR_DTL instructorDtl on instructorDtl.INSTRUCTOR_MST_ID = instructorMst.INSTRUCTOR_MST_ID
where
courseMst.ACTIVE_FLAG = 1
AND courseDtl.ACTIVE_FLAG = 1
AND instructorMst.ACTIVE_FLAG = 1
AND instructorDtl.ACTIVE_FLAG = 1