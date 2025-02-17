import { createBrowserRouter, RouterProvider } from "react-router-dom";

import Courses from "./pages/Courses";
import AddCourses from "./pages/AddCourses";
import AdminRootLayout from "./pages/admin/AdminRootLayout";
import LoginPage from "./pages/authentication/LoginPage";
import SignUpPage from "./pages/authentication/SignUpPage";
import AuthRootLayout from "./pages/authentication/AuthRootLayout";
import CourseList, { loadCourseList } from "./pages/admin/CourseList";

const router = createBrowserRouter([
  {
    path: "/",
    element: <AuthRootLayout />,
    children: [
      { path: "/login", element: <LoginPage /> },
      { path: "/signUp", element: <SignUpPage /> },
    ],
  },
  {
    path: "/admin",
    element: <AdminRootLayout />,
    children: [
      {
        path: "all-courses",
        children: [
          {
            index: true,
            element: <CourseList />,
          },
          {
            path: ":pageNo",
            element: <CourseList />,
            loader: loadCourseList,
          },
        ],
      },
      { path: "add-courses", element: <AddCourses /> },
    ],
  },
]);

function App() {
  return (
    <div>
      <main>
        <RouterProvider router={router} />
      </main>
    </div>
  );
}

export default App;
