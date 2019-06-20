package com.jc.controller;

import com.jc.common.Result;
import com.jc.iservice.sec.HelloService;
import com.jc.service.sec.org.SecOrgService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @program: springBootDemo
 * @Date: 2018/12/4 14:32
 * @Author: LiJc
 * @Description:
 */
@RestController //等同于同时加上了@Controller和@ResponseBody
//@Controller
public class HelloController {
    private final static Logger logger = LoggerFactory.getLogger(SecOrgService.class);

    //访问 /hello或者/hi任何一个地址，都会返回一样的结果
    @RequestMapping(value = {"/hello","/hi"},method = RequestMethod.GET)
    public Result say(){
        return Result.ok("hello world !!!");
    }

    @GetMapping("/demo1")
    public String demo1(String name){
        return "demo1";
    }

    /**
     * 如需要在@RestController跳转页面，需以ModelAndView方式
     * @return
     */
    @GetMapping("/demo")
    public ModelAndView demo(ModelMap modelMap){
        modelMap.addAttribute("name","leejc");
        ModelAndView mv = new ModelAndView("demo");
        return mv;
    }

    @GetMapping("/test1")
    public Result test1(){
        int i = 1/0;
        return Result.ok();
    }

    @Autowired
    private HelloService helloService;
    @GetMapping("/test2")
    public  Result test2(String id){
        logger.info("======id:{}",id);
        helloService.t(id);
        return Result.ok();
    }

//    @GetMapping("/demo2")
//    public ModelAndView demo2(){
//        ModelAndView mv = new ModelAndView("testHtml");
//        return mv;
//    }

//    @GetMapping("/testJsp")
//    public String uploadView(){
//        System.out.println("==================testJsp");
//        return "jsp/testJsp";
//    }
//
//    @GetMapping("/testHtml")
//    public String index1(){
//        System.out.println("==================testHtml");
//        return "html/testHtml";
//    }

    @Autowired
    private StringRedisTemplate stringRedisTemplate;
    @GetMapping("/redisTest1")
    public Result redisTest1(){
        this.stringRedisTemplate.opsForValue().set("name", "老王");
        return Result.ok(this.stringRedisTemplate.opsForValue().get("name"));
    }
}
