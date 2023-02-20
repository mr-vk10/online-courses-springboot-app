const Courses = () => {
  function fetchCoursesHandler() {
    fetch("http://localhost:8000/courses")
      .then((res) => {
        return res.json();
      })
      .then((data) => {
        console.log(data);
      });
  }

  return (
    <section>
      <h1>All Courses</h1>
    </section>
  );
};

export default Courses;
