package com.online.courses.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    // setup logger
    private final Logger logger = LoggerFactory.getLogger(getClass().getName());
    
    // setup pointcut declarations
    
    @Pointcut("execution(* com.online.courses.controller.*.*(..))")
    private void logControllerPackage() {}
    
    @Pointcut("execution(* com.online.courses.services.*.*(..))")
    private void logServicesPackage() {}
    
    @Pointcut("execution(* com.online.courses.dao.*.*(..))")
    private void logDaoPackage() {}
    
    // combine pointcut declarations

    @Pointcut("logControllerPackage() || logServicesPackage() || logDaoPackage()")
    private void logPackages() {}
    
    // add @Around advice
    @Around("logPackages()")
    public Object logData(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        
        Object result = null;
        
        // get the method name we are calling
        String methodName = proceedingJoinPoint.getSignature().toShortString();
        
        try {
            
            // display the method that we are calling
            logger.info(" ====>> "+methodName+" ====>> Starts."); 
            
            // get the arguments
            Object[] args = proceedingJoinPoint.getArgs();
             
            // loop thru and display args
            for(Object tempArg : args) {
                logger.info(" \t====>> "+methodName+" ====>> argument: "+tempArg);    
            }
            
            // executing the target method using "proceeding joint point"
            result = proceedingJoinPoint.proceed();
            
            // display the data returned
            logger.info(" \t====>> "+methodName+" ====>> Result: "+result);              
            
            logger.info(" ====>> "+methodName+" ====>> Ends.");
            
        }catch(Exception e) {
            
            // log exception
            logger.error(" ====>> "+methodName+" ====>> Error: "+e); 

            // rethrow the exception
            throw e;
            
        }
        
        return result;
    }
}
