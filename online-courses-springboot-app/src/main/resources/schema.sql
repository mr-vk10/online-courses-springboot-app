CREATE TABLE instructor_detail (
  id int(11) NOT NULL AUTO_INCREMENT,
  youtube_channel varchar(128) DEFAULT NULL,
  hobby varchar(45) DEFAULT NULL
);


CREATE TABLE instructor (
  id int(11) NOT NULL AUTO_INCREMENT,
  first_name varchar(45) DEFAULT NULL,
  last_name varchar(45) DEFAULT NULL,
  email varchar(45) DEFAULT NULL,
  instructor_detail_id int(11) DEFAULT NULL
);

CREATE TABLE course (
  id int(11) NOT NULL AUTO_INCREMENT,
  title varchar(128) DEFAULT NULL,
  instructor_id int(11) DEFAULT NULL
);

CREATE TABLE review (
  id int(11) NOT NULL AUTO_INCREMENT,
  comment varchar(256) DEFAULT NULL,
  course_id int(11) DEFAULT NULL
);

CREATE TABLE student (
  id int(11) NOT NULL AUTO_INCREMENT,
  first_name varchar(45) DEFAULT NULL,
  last_name varchar(45) DEFAULT NULL,
  email varchar(45) DEFAULT NULL
);


-- join table
CREATE TABLE course_student(
  course_id int(11) NOT NULL,
  student_id int(11) NOT NULL
);