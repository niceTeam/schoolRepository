package com.wisdomschool.student.rest.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wisdomschool.student.pojo.Leaveprocess;
import com.wisdomschool.student.pojo.Student;
import com.wisdomschool.student.service.StudentService;
import com.wisdomschool.student.util.MapInfo;

@CrossOrigin
@RestController
@RequestMapping("/rest/student")
public class StudentRestController {
	
	@Autowired
	private StudentService studentService;

	/*
	 * 请假
	 */
	@PostMapping("/leave")
	public int leave(Leaveprocess leaveprocess) {
		System.out.println("111111");
		return this.studentService.leave(leaveprocess);
	}
	
	/**
	 * 得到所有的学生
	 * 
	 * @return
	 */
	@GetMapping("/listAll")
	public List<Student> listAll() {
		return this.studentService.listAll();
	}

	/**
	 * 更具学生的Id得到该学生
	 * 
	 * @param stuId
	 * @return
	 */
	@GetMapping("/{stuId}")
	public Student getStudentByStuId(@PathVariable Integer stuId) {
		return this.studentService.getStudentByStuId(stuId);
	}

	/**
	 * 更具学生的通行证得到该学生
	 * 
	 * @param stuUserName
	 * @return
	 */
	@GetMapping("/getStuUserName/{stuUserName}")
	public Student getStudentByStuUserName(@PathVariable String stuUserName) {
		return this.studentService.getStudentByStuUserName(stuUserName);
	}

	/**
	 * 新增学生
	 * 
	 * @param student
	 * @return
	 */
	@PostMapping("/save")
	public int save(@RequestBody Student student) {
		return this.studentService.save(student);
	}

	/**
	 * 修改学生
	 * 
	 * @param student
	 * @return
	 */
	@PutMapping("/update")
	public int update(@RequestBody Student student) {
		return this.studentService.update(student);
	}

	/**
	 * 批量新增学生
	 * 
	 * @param students
	 * @return
	 */
	@PostMapping("/saveList")
	public int saveList(@RequestBody List<Student> students) {
		return this.studentService.saveList(students);
	}

	/**
	 * 登陆
	 * 
	 * @param stu
	 * @return
	 */
	@PostMapping("/tologin")
	public Object getUserToLogin(Student stu) {
		Student student = this.studentService.getUserToLogin(stu);
		Map<String, Object> map = MapInfo.getMap("登陆", student!=null);
		map.put("student", student);
		return map;
	}
}
