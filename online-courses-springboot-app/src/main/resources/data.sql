 
INSERT INTO INSTRUCTOR_DTL(INSTRUCTOR_DTL_ID, YOUTUBE_CHANNEL, HOBBY, ACTIVE_FLAG) VALUES
  (1, 'jackWizYt', 'gaming', 1),
  (2, 'bobDBuildYt', 'programming', 1);

INSERT INTO INSTRUCTOR_MST(INSTRUCTOR_MST_ID, FIRST_NAME, LAST_NAME, EMAIL, INSTRUCTOR_DTL_ID, ACTIVE_FLAG) VALUES
  (1, 'jack','darby', 'jack.darby@gmail.com', 1, 1),
  (2, 'bob','pascal', 'bob.pascal@gmail.com', 2, 1);
  
  
INSERT INTO COURSE_MST(COURSE_MST_ID, TITLE, INSTRUCTOR_MST_ID, ACTIVE_FLAG) VALUES
  (1, 'jacks gaming tutorial', 1, 1),
  (2, 'jacks programming tutorial', 1, 1),
  (3, 'bobs guitar tutorial', 2, 1),
  (4, 'bobs programming tutorial', 2, 1);
  
INSERT INTO REVIEW_MST(REVIEW_MST_ID, COMMENT, COURSE_MST_ID, STUDENT_MST_ID, ACTIVE_FLAG) VALUES
  (1, 'jacks gaming tutorial is good', 1, 1, 1),
  (2, 'jacks gaming tutorial is ok', 1, 2, 1),
  (3, 'jacks programming tutorial is good', 2, 1, 1),
  (4, 'jacks programming tutorial is ok', 2, 2, 1),
  (5, 'bobs guitar tutorial is good', 3, 1, 1),
  (6, 'bobs guitar tutorial is ok', 3, 2, 1),
  (7, 'bobs programming tutorial is good', 4, 1, 1),
  (8, 'bobs programming tutorial is ok', 4, 2, 1);
  
INSERT INTO STUDENT_MST(STUDENT_MST_ID, FIRST_NAME, LAST_NAME, EMAIL, ACTIVE_FLAG) VALUES
  (1, 'jhon','doe', 'jhon.doe@gmail.com', 1),
  (2, 'mary','public', 'mary.public@gmail.com', 1);
 
/*  
INSERT INTO COURSE_STUDENT(COURSE_MST_ID, STUDENT_MST_ID) VALUES
  (1, 1),
  (2, 2),
  (3, 1),
  (4, 2);
*/  
 