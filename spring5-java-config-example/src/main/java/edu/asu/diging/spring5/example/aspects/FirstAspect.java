package edu.asu.diging.spring5.example.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class FirstAspect {
    
    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Before("within(edu.asu.diging.spring5.example..*)")
    public void always(JoinPoint jp) throws Throwable {
        logger.info("Always " + jp.getSignature());
    }
}
