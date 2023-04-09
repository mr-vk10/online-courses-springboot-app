package com.online.courses.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CourseUtils {
    
    public static boolean validateInstructorEmail(String email) {
        
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);
        if (matcher.matches()) {
          return true;
        } else {
           return false;
        }
    }

}
