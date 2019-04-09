package com.jc.springBootDemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//改变自动扫描的包
@ComponentScan(basePackages = {"com.jc"})
@MapperScan("com.jc.dao") //扫描包下的mapper,对应dao(或者mapper)的包路径
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoApplication.class, args);
	}
}
