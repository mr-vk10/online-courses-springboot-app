import { Await, useLoaderData } from "react-router-dom";
import CourseCard from "../../components/admin/CourseCard";
import classes from "./CourseList.module.css";
import { Suspense, useEffect, useState } from "react";
import Pagination from "../../components/pagination/Pagination";

const CourseList = () => {
  const courses = useLoaderData();

  // const [courses, setCourses] = useState([]);
  const [currentPage, setCurrentPage] = useState(1);
  const itemsPerPage = 12;

  // Load courses whenever currentPage changes
  // useEffect(() => {
  //   const fetchCourses = async () => {
  //     const data = await loadCourseList(currentPage, itemsPerPage);
  //     setCourses(data);
  //   };

  //   fetchCourses();
  // }, [currentPage]);

  return (
    <>
      <Suspense>
        <Await resolve={courses}>
          {(course) => [
            course !== undefined ? (
              <>
                <div className={classes.courseList}>
                  {courses.map((course) => (
                    <CourseCard key={course.courseDtlId} course={course} />
                  ))}
                </div>

                <Pagination
                  totalItems={42}
                  itemsPerPage={itemsPerPage}
                  currentPage={currentPage}
                  onPageChange={setCurrentPage}
                />
              </>
            ) : null,
          ]}
        </Await>
      </Suspense>
    </>
  );
};

export default CourseList;

export async function loadCourseList({ params }) {
  let pageNo = "";
  if (params) pageNo = params.pageNo;

  let url = "http://localhost:8000/courses";

  if (params) url += `?pageNo=${pageNo}`;

  const response = await fetch(url);

  if (!response.ok) {
    //
  } else {
    const resData = await response.json();
    console.log(resData);
    return resData;
  }
}
