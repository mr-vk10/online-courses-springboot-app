package com.online.courses.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.online.courses.dto.CourseErrorResponse;
import com.online.courses.exceptions.CourseNotFoundException;

@ControllerAdvice
public class CourseExceptionHandler {

    
    // add Exception handling code here
    @ExceptionHandler
    public ResponseEntity<CourseErrorResponse> handleException(CourseNotFoundException exc){
        
        // create a CourseErrorResponse
        CourseErrorResponse error = new CourseErrorResponse();
        
        error.setStatus(HttpStatus.NOT_FOUND.value());
        error.setMessage(exc.getMessage());
        error.setTimeStamp(System.currentTimeMillis());
        
        // return ResponseEntity
        return new ResponseEntity<>(error,HttpStatus.NOT_FOUND);        
    }
    
    // add another exception handler ... to catch any exception (catch all)
    @ExceptionHandler
    public ResponseEntity<CourseErrorResponse> handleException(Exception exc){
        
        // create a CourseErrorResponse
        CourseErrorResponse error = new CourseErrorResponse();
        
        error.setStatus(HttpStatus.BAD_REQUEST.value());
        error.setMessage(exc.getMessage());
        error.setTimeStamp(System.currentTimeMillis());
        
        // return ResponseEntity
        return new ResponseEntity<>(error,HttpStatus.BAD_REQUEST);        
    }
}
