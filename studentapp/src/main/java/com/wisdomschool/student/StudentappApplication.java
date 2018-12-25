package com.wisdomschool.student;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan(basePackages= {"com.wisdomschool.student.mapper"})
@ComponentScan(basePackages = {"com.wisdomschool.student.pojo"})
public class StudentappApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentappApplication.class, args);
	}

}

