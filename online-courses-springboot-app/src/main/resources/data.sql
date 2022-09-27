 
INSERT INTO INSTRUCTOR_DTL(INSTRUCTOR_DTL_ID, YOUTUBE_CHANNEL, HOBBY) VALUES
  (1, 'jackWizYt', 'gaming'),
  (2, 'bobDBuildYt', 'programming');

INSERT INTO INSTRUCTOR_MST(INSTRUCTOR_MST_ID, FIRST_NAME, LAST_NAME, EMAIL, INSTRUCTOR_DTL_ID) VALUES
  (1, 'jack','darby', 'jack.darby@gmail.com',1),
  (2, 'bob','pascal', 'bob.pascal@gmail.com',2);
  
  
INSERT INTO COURSE_MST(COURSE_MST_ID, TITLE, INSTRUCTOR_MST_ID) VALUES
  (1, 'jacks gaming tutorial', 1),
  (2, 'jacks programming tutorial', 1),
  (3, 'bobs guitar tutorial', 2),
  (4, 'bobs programming tutorial', 2);
  
INSERT INTO REVIEW_MST(REVIEW_MST_ID, COMMENT, COURSE_MST_ID, STUDENT_MST_ID) VALUES
  (1, 'jacks gaming tutorial is good', 1, 1),
  (2, 'jacks gaming tutorial is ok', 1, 2),
  (3, 'jacks programming tutorial is good', 2, 1),
  (4, 'jacks programming tutorial is ok', 2, 2),
  (5, 'bobs guitar tutorial is good', 3, 1),
  (6, 'bobs guitar tutorial is ok', 3, 2),
  (7, 'bobs programming tutorial is good', 4, 1),
  (8, 'bobs programming tutorial is ok', 4, 2);
  
INSERT INTO STUDENT_MST(STUDENT_MST_ID, FIRST_NAME, LAST_NAME, EMAIL) VALUES
  (1, 'jhon','doe', 'jhon.doe@gmail.com'),
  (2, 'mary','public', 'mary.public@gmail.com');
 
/*  
INSERT INTO COURSE_STUDENT(COURSE_MST_ID, STUDENT_MST_ID) VALUES
  (1, 1),
  (2, 2),
  (3, 1),
  (4, 2);
*/  
 