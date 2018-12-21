package com.accp.spring;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages= {"com.accp.spring.zml.mapper,com.accp.spring.zsy.mapper"})
public class ClasscloudApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClasscloudApplication.class, args);
	}

}

