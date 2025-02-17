import { Outlet } from "react-router-dom";
import AdminHeader from "../../components/admin/AdminHeader";
import AdminSidebar from "../../components/admin/AdminSidebar";
import classes from "./AdminRootLayout.module.css";

function AdminRootLayout() {
  return (
    <>
      <AdminHeader />
      {/* <main className={classes.content}> */}
      <div className={classes.container}>
        <AdminSidebar />
        <div className={classes.main}>
          <Outlet />
        </div>
      </div>
    </>
  );
}

export default AdminRootLayout;
