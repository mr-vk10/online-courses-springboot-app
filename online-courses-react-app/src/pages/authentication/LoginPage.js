import { Form, NavLink } from "react-router-dom";
import classes from "./AuthPage.module.css";

export default function LoginPage() {
  return (
    <div className={classes.wrapper}>
      <div className={classes.container}>
        <h2>Login</h2>
        <Form method="post">
          <input type="text" name="username" placeholder="Username" required />
          <input
            type="password"
            name="password"
            placeholder="Password"
            required
          />
          <input type="submit" value="Login" />
        </Form>
        <div className={classes.signupLink}>
          Don't have an account? <NavLink to="/signUp">Sign Up</NavLink>
        </div>
      </div>
    </div>
  );
}
