package com.wisdomschool.student.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

	// 学生进行登陆，并且修改cid
	@Transactional
	public Student getUserToLogin(Student stu) {
		if (stu == null)
			return null;
		Student student = this.studentMapper.getUserToLogin(stu.getStuPhone(), stu.getStuPwd());
		if (student != null) {
			student.setcId(stu.getcId());
			this.studentMapper.update(student);
			Student student2 = this.studentMapper.getStudentByCid(student.getcId(), student.getStuId());
			if(student2!=null) {
				student2.setcId(null);
				this.studentMapper.update(student2);
			}
		}
		return student;
	}
}
