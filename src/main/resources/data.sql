
INSERT INTO instructor_detail (id, youtube_channel, hobby) VALUES
  (1, 'jackWizYt', 'gaming'),
  (2, 'bobDBuildYt', 'programming');
  
  
INSERT INTO instructor (id, first_name, last_name, email, instructor_detail_id) VALUES
  (1, 'jack','darby', 'jack.darby@gmail.com',1),
  (2, 'bob','pascal', 'bob.pascal@gmail.com',2);
  

INSERT INTO course (id, title, instructor_id) VALUES
  (1, 'jacks gaming tutorial', 1),
  (2, 'jacks programming tutorial', 1),
  (3, 'bobs guitar tutorial', 2),
  (4, 'bobs programming tutorial', 2);
  
INSERT INTO review (id, comment, course_id) VALUES
  (1, 'jacks gaming tutorial is good', 1),
  (2, 'jacks gaming tutorial is ok', 1),
  (3, 'jacks programming tutorial is good', 2),
  (4, 'jacks programming tutorial is ok', 2),
  (5, 'bobs guitar tutorial is good', 3),
  (6, 'bobs guitar tutorial is ok', 3),
  (7, 'bobs programming tutorial is good', 4),
  (8, 'bobs programming tutorial is ok', 4);
  
INSERT INTO student (id, first_name, last_name, email) VALUES
  (1, 'jhon','doe', 'jhon.doe@gmail.com'),
  (2, 'mary','public', 'mary.public@gmail.com');
  
INSERT INTO course_student (course_id, student_id) VALUES
  (1, 1),
  (2, 2),
  (3, 1),
  (4, 2);