package com.jc.common;

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

    @Pointcut("execution(public * com.jc.controller..*.*(..))")
    public void logPointCut(){
    }

    @Before("logPointCut()")
    public void doBefore(){
        logger.info("【doBefore】");
    }
}
