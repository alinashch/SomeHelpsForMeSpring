package spingBoot.springAOP.Change_params;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Logger;

@Aspect
public class LoginAspect {
    private Logger logger= Logger.getLogger(LoginAspect.class.getName());
    @Around("execution(* spingBoot.springAOP.Change_params.*.*(..))")
    public Object log(ProceedingJoinPoint proceedingJoinPoint) throws  Throwable{
        String methodName=proceedingJoinPoint.getSignature().getName();
        Object [] arguments=proceedingJoinPoint.getArgs();


        logger.info("method"+ methodName+ "argv "+ Arrays.asList(arguments));
        Object returnMethod=proceedingJoinPoint.proceed();
        logger.info("returnMethod "+ returnMethod);
        return  returnMethod;
    }

    public Logger getLogger() {
        return logger;
    }

    public void setLogger(Logger logger) {
        this.logger = logger;
    }
}
