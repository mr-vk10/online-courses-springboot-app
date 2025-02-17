
INSERT INTO db_user.INSTRUCTOR_MST(INSTRUCTOR_MST_ID, ACTIVE_FLAG) VALUES
  (1, 1),
  (2, 1);

INSERT INTO db_user.INSTRUCTOR_DTL(INSTRUCTOR_DTL_ID, INSTRUCTOR_MST_ID, FIRST_NAME, LAST_NAME, EMAIL, YOUTUBE_CHANNEL, HOBBY, ACTIVE_FLAG) VALUES
  (1, 1, 'jack','darby', 'jack.darby@gmail.com', 'jackWizYt', 'gaming', 1),
  (2, 2, 'bob','pascal', 'bob.pascal@gmail.com', 'bobDBuildYt', 'programming', 1);
  
INSERT INTO db_user.COURSE_MST(COURSE_MST_ID, INSTRUCTOR_MST_ID, ACTIVE_FLAG) VALUES
  (1, 1, 1),
  (2, 1, 1),
  (3, 2, 1),
  (4, 2, 1),
  (5, 1, 1),
  (6, 1, 1),
  (7, 2, 1),
  (8, 2, 1),
  (9, 1, 1),
  (10, 1, 1),
  (11, 2, 1),
  (12, 2, 1),
  (13, 1, 1),
  (14, 1, 1),
  (15, 2, 1),
  (16, 2, 1),
  (17, 1, 1),
  (18, 1, 1),
  (19, 2, 1),
  (20, 2, 1),
  (21, 1, 1),
  (22, 1, 1),
  (23, 2, 1),
  (24, 2, 1),
  (25, 1, 1),
  (26, 1, 1),
  (27, 2, 1),
  (28, 2, 1),
  (29, 1, 1);
  
 
-- LEVEL: 1 - Beginner, 2 - Intermediate, 3 - All Level  
INSERT INTO db_user.COURSE_DTL(COURSE_DTL_ID, COURSE_MST_ID, TITLE, COURSE_DESC, DURATION, NO_OF_LEC, LEVEL, PRICE, ACTIVE_FLAG) VALUES
  (1, 1, 'React Native - The Practical Guide', 'Use React Native and your React knowledge to build native iOS and Android Apps - incl. Push Notifications, Hooks, Redux', 28.5, 289, 3, 450, 1),
  (2, 2, 'Spring & Hibernate for Beginners', 'Spring 5: Learn Spring 5 Core, AOP, Spring MVC, Spring Security, Spring REST, Spring Boot 2, Thymeleaf, JPA & Hibernate', 42.5, 569, 2, 550, 1),
  (3, 3, 'Vue - The Complete Guide', 'Vue.js is an awesome JavaScript Framework for building Frontend Applications! <strong>VueJS</strong> mixes the Best of Angular + React!', 32, 330, 1, 650, 1),
  (4, 4, 'Node.js, Express, MongoDB & More: The Complete Bootcamp 2023', 'Master Node by building a real-world RESTful API and web app (with authentication, <strong>Node.js</strong> security, payments & more)', 42, 229, 3, 750, 1),
  (5, 5, 'JavaScript Essentials 2023', 'Master JavaScript with the most complete course available.', 25, 180, 1, 400, 1),
  (6, 6, 'Advanced React & Redux', 'Master React and Redux for building dynamic applications.', 30, 300, 2, 500, 1),
  (7, 7, 'Angular - The Complete Guide', 'Master Angular for building front-end applications.', 35, 350, 2, 600, 1),
  (8, 8, 'Java Programming Masterclass', 'Comprehensive Java course for complete beginners and professionals.', 50, 450, 3, 700, 1),
  (9, 9, 'Python for Data Science', 'Learn Python and use it for data science projects and applications.', 28, 210, 1, 450, 1),
  (10, 10, 'Django & Python for Beginners', 'Master Django and Python for web development.', 38, 400, 2, 550, 1),
  (11, 11, 'Machine Learning with Python', 'Complete machine learning course for Python developers.', 45, 300, 3, 800, 1),
  (12, 12, 'The Complete MySQL Developer Course', 'Learn MySQL from basics to advanced.', 20, 170, 1, 350, 1),
  (13, 13, 'Full Stack Web Development', 'Become a full-stack web developer with HTML, CSS, JS, and more.', 60, 600, 3, 1000, 1),
  (14, 14, 'Ruby on Rails for Beginners', 'Learn Ruby on Rails and build web applications.', 22, 200, 1, 450, 1),
  (15, 15, 'ASP.NET Core Web API Development', 'Build Web APIs with ASP.NET Core and C#.', 34, 250, 2, 600, 1),
  (16, 16, 'PHP for Absolute Beginners', 'Start coding in PHP with this beginner course.', 15, 120, 1, 300, 1),
  (17, 17, 'Android App Development with Kotlin', 'Learn Android development using Kotlin.', 40, 400, 2, 700, 1),
  (18, 18, 'iOS App Development with Swift', 'Master Swift and iOS development.', 37, 310, 2, 750, 1),
  (19, 19, 'Data Structures and Algorithms', 'Learn DSA in JavaScript for interviews.', 42, 400, 3, 850, 1),
  (20, 20, 'Blockchain Development for Beginners', 'A complete beginners guide to blockchain development.', 25, 180, 1, 500, 1),
  (21, 21, 'React for Web and Native Apps', 'Learn to build web and native apps with React.', 36, 310, 2, 600, 1),
  (22, 22, 'Flutter & Dart for Mobile Development', 'Develop mobile applications with Flutter & Dart.', 45, 340, 2, 700, 1),
  (23, 23, 'HTML & CSS for Beginners', 'Learn to build web pages using HTML & CSS.', 10, 80, 1, 200, 1),
  (24, 24, 'Java for Complete Beginners', 'Master the basics of Java programming.', 20, 170, 1, 400, 1),
  (25, 25, 'The Complete WordPress Course', 'Build websites using WordPress from scratch.', 15, 120, 1, 350, 1),
  (26, 26, 'Docker and Kubernetes', 'Learn Docker & Kubernetes for deployment.', 28, 200, 2, 600, 1),
  (27, 27, 'C++ for Beginners', 'Learn the fundamentals of C++ programming.', 20, 150, 1, 350, 1),
  (28, 28, 'The Complete Salesforce Course', 'Learn Salesforce for managing CRM.', 30, 250, 2, 550, 1),
  (29, 29, 'Cybersecurity for Beginners', 'Learn the fundamentals of cybersecurity.', 24, 180, 1, 500, 1),
  (30, 5, 'DevOps Mastery with Jenkins', 'Learn to automate your software development pipeline.', 35, 290, 2, 600, 1),
  (31, 6, 'Networking Essentials', 'Learn the fundamentals of networking.', 15, 120, 1, 300, 1),
  (32, 7, 'Advanced JavaScript Techniques', 'Take your JavaScript skills to the next level.', 28, 210, 2, 500, 1),
  (33, 8, 'UI/UX Design for Beginners', 'Learn the fundamentals of UI/UX design.', 20, 170, 1, 400, 1),
  (34, 9, 'Git & GitHub Mastery', 'Master version control with Git & GitHub.', 12, 100, 1, 250, 1),
  (35, 10, 'Artificial Intelligence Essentials', 'Introduction to AI concepts and applications.', 40, 320, 2, 750, 1),
  (36, 11, 'Java Web Development', 'Build web applications with Java.', 30, 250, 2, 550, 1),
  (37, 12, 'Ethical Hacking for Beginners', 'Learn ethical hacking techniques.', 22, 180, 1, 500, 1),
  (38, 13, 'Cloud Computing with AWS', 'Master cloud computing using AWS.', 35, 280, 2, 700, 1),
  (39, 14, 'SQL for Data Analysis', 'Learn SQL for effective data analysis.', 15, 120, 1, 300, 1),
  (40, 15, 'Responsive Web Design', 'Learn to build responsive websites.', 18, 150, 1, 350, 1);

INSERT INTO db_user.REVIEW_MST(REVIEW_MST_ID, COMMENT, COURSE_MST_ID, STUDENT_MST_ID, ACTIVE_FLAG) VALUES
  (1, 'jacks gaming tutorial is good', 1, 1, 1),
  (2, 'jacks gaming tutorial is ok', 1, 2, 1),
  (3, 'jacks programming tutorial is good', 2, 1, 1),
  (4, 'jacks programming tutorial is ok', 2, 2, 1),
  (5, 'bobs guitar tutorial is good', 3, 1, 1),
  (6, 'bobs guitar tutorial is ok', 3, 2, 1),
  (7, 'bobs programming tutorial is good', 4, 1, 1),
  (8, 'bobs programming tutorial is ok', 4, 2, 1);
  
INSERT INTO db_user.STUDENT_MST(STUDENT_MST_ID, FIRST_NAME, LAST_NAME, EMAIL, ACTIVE_FLAG) VALUES
  (1, 'jhon','doe', 'jhon.doe@gmail.com', 1),
  (2, 'mary','public', 'mary.public@gmail.com', 1);
 
/*  
INSERT INTO COURSE_STUDENT(COURSE_MST_ID, STUDENT_MST_ID) VALUES
  (1, 1),
  (2, 2),
  (3, 1),
  (4, 2);
*/  
 