import { Outlet } from "react-router-dom";
import MainHeader from "../components/MainHeader";
// import classes from "./RootLayout.module.css";

function RootLayout() {
  return (
    <>
      <MainHeader />
      {/* <main className={classes.content}> */}
      <main>
        <Outlet />
      </main>
    </>
  );
}

export default RootLayout;
