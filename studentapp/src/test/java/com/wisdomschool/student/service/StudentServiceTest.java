package com.wisdomschool.student.service;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentServiceTest {

	@Autowired
	private StudentService stuSer;

	@Test
	public void testGetTeam() {
		System.out.println(stuSer.getTeam(1).toString());
	}

}
