import "./Course.css";
import cover from "../images/cover.jpg";

const Course = (props) => {
  return (
    <div>
      <div className="card course-item">
        <div className="course-item__image">
          <img src={cover} alt="logo" />
        </div>
        <div className="course-item__description">
          <h1>{props.title}</h1>
          <h2>{props.courseDesc}</h2>
          <h3>
            By {props.firstName} {props.lastName}
          </h3>
          <h4>
            {props.duration} total hours | {props.noOfLec} lectures |{" "}
            {props.levelStr}
          </h4>
          <div className="course-item__price">₹ {props.price}</div>
        </div>
      </div>
    </div>
  );
};

export default Course;
