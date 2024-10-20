import { Outlet } from "react-router-dom";
import AdminHeader from "../../components/admin/AdminHeader";
// import classes from "./RootLayout.module.css";

function AdminRootLayout() {
  return (
    <>
      <AdminHeader />
      {/* <main className={classes.content}> */}
      <main>
        <Outlet />
      </main>
    </>
  );
}

export default AdminRootLayout;
