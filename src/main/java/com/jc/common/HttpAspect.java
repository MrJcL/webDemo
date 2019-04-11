package com.jc.common;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @program: webDemo
 * @Date: 2019/4/9 23:36
 * @Author: JcLi
 * @Description:
 */
@Aspect
@Component
public class HttpAspect {

    private final static Logger logger = LoggerFactory.getLogger(HttpAspect.class);

    @Pointcut("execution(public * com.jc..*..*.*(..))")
    public void logPointCut(){
    }

    @Before("logPointCut()")
    public void doBefore(JoinPoint joinPoint){
        //RequestContextHolder.getRequestAttributes();仅在controller层可以获取
//        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
//        HttpServletRequest httpServletRequest = attributes.getRequest();
//
//        logger.info("url={}", httpServletRequest.getRequestURL());
//        logger.info("method={}", httpServletRequest.getMethod());
//        logger.info("ip={}", httpServletRequest.getRemoteAddr());

        logger.info("class_method={}", joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName());
//        logger.info("args={}", joinPoint.getArgs());
    }
}
