package com.wisdomschool.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wisdomschool.student.mapper.StudentMapper;
import com.wisdomschool.student.pojo.Student;

@Service
public class StudentService {

	@Autowired
	private StudentMapper studentMapper;

	public List<Student> listAll() {
		return this.studentMapper.listAll();
	}

	public Student getStudentByStuId(Integer stuId) {
		return this.studentMapper.getStudentByStuId(stuId);
	}

	public Student getStudentByStuUserName(String stuUserName) {
		return this.studentMapper.getStudentByStuUserName(stuUserName);
	}

	public int save(Student student) {
		return this.studentMapper.save(student);
	}

	public int update(Student student) {
		return this.studentMapper.update(student);
	}

	public int saveList(List<Student> students) {
		return this.studentMapper.saveList(students);
	}
}
