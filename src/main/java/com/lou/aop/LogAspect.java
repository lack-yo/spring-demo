package com.lou.aop;

import org.apache.log4j.PropertyConfigurator;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Administrator on 2017/2/8.
 */
@Aspect
@Component
public class LogAspect {
    private static final Logger logger = LoggerFactory.getLogger(LogAspect.class);

    @Pointcut("@annotation(Log)")
    public void pointcut() {}


    @Before("pointcut()")
    public void setLog(JoinPoint pjp){
        PropertyConfigurator.configure(PropertyConfigurator.class.getResourceAsStream("/log4j.properties"));
        Object[] args = pjp.getArgs();
        HttpServletRequest request = (HttpServletRequest) args[0];
        logger.info(request.getRequestURI());
        logger.debug("log debug");
    }
}
