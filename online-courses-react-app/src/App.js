import { createBrowserRouter, RouterProvider } from "react-router-dom";

import Courses from "./pages/Courses";
import AddCourses from "./pages/AddCourses";
import RootLayout from "./pages/RootLayout";

const router = createBrowserRouter([
  {
    path: "/",
    element: <RootLayout />,
    children: [
      {
        path: "/all-courses",
        element: <Courses />,
        loader: async () => {
          const response = await fetch("http://localhost:8000/courses");

          if (!response.ok) {
            //
          } else {
            const resData = await response.json();
            console.log(resData);
            return resData;
          }
        },
      },
      { path: "/add-courses", element: <AddCourses /> },
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
