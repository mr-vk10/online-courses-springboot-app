import { useLoaderData } from "react-router-dom";
import Course from "../components/Course";

const Courses = () => {
  const data = useLoaderData();

  return (
    <section>
      <h1>All Courses</h1>
      {data.map((course) => (
        <Course
          key={course.courseDtlId}
          title={course.title}
          courseDesc={course.courseDesc}
          duration={course.duration}
          noOfLec={course.noOfLec}
          levelStr={course.levelStr}
          price={course.price}
          instructorDtlId={course.instructorDtlId}
          instructorMstId={course.instructorMstId}
          firstName={course.firstName}
          lastName={course.lastName}
        />
      ))}
    </section>
  );
};

export default Courses;
