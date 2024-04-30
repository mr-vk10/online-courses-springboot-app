import { Form, NavLink } from "react-router-dom";
import classes from "./AuthPage.module.css";

export default function SignUpPage() {
  return (
    <div className={classes.wrapper}>
      <div className={classes.container}>
        <h2>Sign Up</h2>
        <Form method="post">
          <input
            type="text"
            placeholder="First Name"
            id="firstName"
            name="firstName"
            required
          />
          <input
            type="text"
            placeholder="Last Name"
            id="lastName"
            name="lastName"
            required
          />
          <input type="text" name="username" placeholder="Username" required />
          <input
            type="password"
            id="password"
            name="password"
            placeholder="Password"
            required
          />
          <input
            type="password"
            id="confirmPassword"
            name="confirmPassword"
            placeholder="Confirm Password"
            required
          />
          <input type="submit" value="Sign Up" />
        </Form>
        <div className={classes.signupLink}>
          Already have an account? <NavLink to="/login">Login</NavLink>
        </div>
      </div>
    </div>
  );
}
