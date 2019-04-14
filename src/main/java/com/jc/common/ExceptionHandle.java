package com.jc.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @program: webDemo
 * @Date: 2019/4/9 22:15
 * @Author: JcLi
 * @Description:    全局捕获异常
 */
@ControllerAdvice
public class ExceptionHandle {

    private final static Logger logger = LoggerFactory.getLogger(ExceptionHandle.class);

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result defaultErrorHandle(Exception e){
        logger.error("【系统异常】{}",e);
        return Result.errorMsg(e.getMessage());
    }
}
