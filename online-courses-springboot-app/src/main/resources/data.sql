
INSERT INTO INSTRUCTOR_MST(INSTRUCTOR_MST_ID, ACTIVE_FLAG) VALUES
  (1, 1),
  (2, 1);

INSERT INTO INSTRUCTOR_DTL(INSTRUCTOR_DTL_ID, INSTRUCTOR_MST_ID, FIRST_NAME, LAST_NAME, EMAIL, YOUTUBE_CHANNEL, HOBBY, ACTIVE_FLAG) VALUES
  (1, 1, 'jack','darby', 'jack.darby@gmail.com', 'jackWizYt', 'gaming', 1),
  (2, 2, 'bob','pascal', 'bob.pascal@gmail.com', 'bobDBuildYt', 'programming', 1);
  
INSERT INTO COURSE_MST(COURSE_MST_ID, INSTRUCTOR_MST_ID, ACTIVE_FLAG) VALUES
  (1, 1, 1),
  (2, 1, 1),
  (3, 2, 1),
  (4, 2, 1);
 
-- LEVEL: 1 - Beginner, 2 - Intermediate, 3 - All Level  
INSERT INTO COURSE_DTL(COURSE_DTL_ID, COURSE_MST_ID, TITLE, COURSE_DESC, DURATION, NO_OF_LEC, LEVEL, PRICE, ACTIVE_FLAG) VALUES
  (1, 1, 'React Native - The Practical Guide', 'Use React Native and your React knowledge to build native iOS and Android Apps - incl. Push Notifications, Hooks, Redux', 28.5, 289, 3, 450, 1),
  (2, 2, 'Spring & Hibernate for Beginners', 'Spring 5: Learn Spring 5 Core, AOP, Spring MVC, Spring Security, Spring REST, Spring Boot 2, Thymeleaf, JPA & Hibernate', 42.5, 569, 2, 550, 1),
  (3, 3, 'Vue - The Complete Guide', 'Vue.js is an awesome JavaScript Framework for building Frontend Applications! <strong>VueJS</strong> mixes the Best of Angular + React!', 32, 330, 1, 650, 1),
  (4, 4, 'Node.js, Express, MongoDB & More: The Complete Bootcamp 2023', 'Master Node by building a real-world RESTful API and web app (with authentication, <strong>Node.js</strong> security, payments & more)', 42, 229, 3, 750, 1);
  
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
 