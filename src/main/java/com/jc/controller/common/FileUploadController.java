package com.jc.controller.common;

import com.jc.service.common.FileUploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @program: springBootDemo
 * @Date: 2018/12/12 18:01
 * @Author: LiJc
 * @Description:
 */
@Controller //等同于同时加上了@Controller和@ResponseBody
@RequestMapping(value = "/upload")
public class FileUploadController {

    @Autowired
    private FileUploadService fileUploadService;

    @GetMapping("/index")
    public String index(){
        return "upload";
    }

    @PostMapping("/execute")
    @ResponseBody
    public String execute(HttpServletRequest request){
        return this.fileUploadService.upload(request);
    }
}
