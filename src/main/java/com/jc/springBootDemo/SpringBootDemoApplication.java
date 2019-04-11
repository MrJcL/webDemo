package com.jc.springBootDemo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import tk.mybatis.spring.annotation.MapperScan;//注意是tk

@SpringBootApplication
//改变自动扫描的包
@ComponentScan(basePackages = {"com.jc"})
@MapperScan({"com.jc.dao", "com.jc.mapper.sec.org"}) //扫描包下的mapper,对应dao(或者mapper)的包路径
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoApplication.class, args);
	}
}
