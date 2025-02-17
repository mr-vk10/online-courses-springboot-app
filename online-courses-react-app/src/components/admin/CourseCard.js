import classes from "./CourseCard.module.css";
import cover from "../../images/cover.jpg";

const CourseCard = ({ course }) => {
  return (
    <div className={classes.courseCard}>
      <div className={classes.courseImage}>
        {/* Replace with an image tag if you have actual images */}
        <img src={cover} alt={course.title} />
      </div>
      <div className={classes.courseInfo}>
        <h3>{course.title}</h3>
        <p>
          {course.firstName} {course.lastName}
        </p>
        <p>{course.duration} total hours</p>
        <p>{course.noOfLec} lectures</p>
        <p>{course.levelStr}</p>
        {/* <p>{course.progress} complete</p> 
        <div className={classes.rating}>
          {"★".repeat(course.rating).padEnd(5, "☆")}
          <span>Leave a rating</span>
        </div>*/}
      </div>
    </div>
  );
};

export default CourseCard;
