import { useLoaderData } from "react-router-dom";

const Courses = () => {
  function fetchCoursesHandler() {}

  const data = useLoaderData();

  return (
    <section>
      <h1>All Courses</h1>
    </section>
  );
};

export default Courses;
