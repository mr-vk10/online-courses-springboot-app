import { NavLink } from "react-router-dom";
import classes from "./AdminHeader.module.css";

const AdminHeader = () => {
  const logOutUser = () => {
    alert("User Logged Out");
  };

  return (
    <>
      <header className={classes.header}>
        <div className={classes.logo}>
          <img src="logo.png" alt="MED NEAR ME LOGO" />
          {/* <Logo /> */}
        </div>
        <div className={classes.logout}>
          <button onClick={logOutUser}>Logout</button>
        </div>
      </header>
    </>
  );
};

export default AdminHeader;
