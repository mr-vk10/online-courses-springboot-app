import { NavLink } from "react-router-dom";

import classes from "./AdminSidebar.module.css";

function AdminSidebar() {
  return (
    <>
      <aside>
        <ul className={classes.list}>
          <li>
            <NavLink
              to="/seller"
              className={({ isActive }) =>
                isActive ? classes.active : undefined
              }
              end
            >
              HOME
            </NavLink>
          </li>
          <li>
            <NavLink
              to="/seller/worklist/pending"
              className={({ isActive }) =>
                isActive ? classes.active : undefined
              }
            >
              REQUEST WORKLIST
            </NavLink>
          </li>
          <li>
            <NavLink
              to="/seller/worklist/accept"
              className={({ isActive }) =>
                isActive ? classes.active : undefined
              }
            >
              ACCEPTED WORKLIST
            </NavLink>
          </li>
          <li>
            <NavLink
              to="/seller/worklist/dispatch"
              className={({ isActive }) =>
                isActive ? classes.active : undefined
              }
            >
              DISPATCHED WORKLIST
            </NavLink>
          </li>
          <li>
            <NavLink
              to="/seller/worklist/reject"
              className={({ isActive }) =>
                isActive ? classes.active : undefined
              }
            >
              REJECTED WORKLIST
            </NavLink>
          </li>
          <li>
            <NavLink
              to="/seller/report"
              className={({ isActive }) =>
                isActive ? classes.active : undefined
              }
            >
              MY REPORT
            </NavLink>
          </li>
          <li>
            <NavLink
              to="/seller/dashboard"
              className={({ isActive }) =>
                isActive ? classes.active : undefined
              }
            >
              DASHBOARD
            </NavLink>
          </li>
          <li>
            <NavLink
              to="/seller/getPendingPenalty"
              className={({ isActive }) =>
                isActive ? classes.active : undefined
              }
            >
              MY PENALTY
            </NavLink>
          </li>
        </ul>
      </aside>
    </>
  );
}

export default AdminSidebar;
