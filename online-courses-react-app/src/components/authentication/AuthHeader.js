import { NavLink } from "react-router-dom";

import classes from "./AuthHeader.module.css";
// import Logo from "../logo/Logo";

function AuthHeader() {
  return (
    <>
      <header className={classes.header}>
        <div className={classes.logo}>
          <img src="logo.png" alt="ONLINE COURSES LOGO" />
          {/* <Logo /> */}
        </div>
        <nav>
          <ul className={classes.list}>
            <li>
              <NavLink
                className={(navData) =>
                  navData.isActive ? classes.active : "none"
                }
                to="/login"
              >
                LogIn
              </NavLink>
            </li>

            <li>
              <NavLink
                className={(navData) =>
                  navData.isActive ? classes.active : "none"
                }
                to="/signUp"
              >
                Sign Up
              </NavLink>
            </li>
          </ul>
        </nav>
      </header>
    </>
  );
}

export default AuthHeader;
