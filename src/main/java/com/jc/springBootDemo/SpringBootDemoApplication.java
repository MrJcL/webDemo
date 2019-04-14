package com.jc.springBootDemo;


import com.jc.util.MyMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
//改变自动扫描的包
@ComponentScan(basePackages = {"com.jc"}, excludeFilters = { @ComponentScan.Filter(type= FilterType.ASSIGNABLE_TYPE, value= MyMapper.class)})
@MapperScan({"com.jc.dao", "com.jc.mapper.sec.org"}) //扫描包下的mapper,对应dao(或者mapper)的包路径
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoApplication.class, args);
	}
}
