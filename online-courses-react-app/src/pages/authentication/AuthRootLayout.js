import { Outlet } from "react-router-dom";

import AuthHeader from "../../components/authentication/AuthHeader";

function AuthRootLayout() {
  return (
    <>
      <AuthHeader />
      <Outlet />
    </>
  );
}

export default AuthRootLayout;
