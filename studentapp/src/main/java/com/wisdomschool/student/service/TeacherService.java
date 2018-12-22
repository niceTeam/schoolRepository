package com.wisdomschool.student.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wisdomschool.student.mapper.TeacherMapper;
import com.wisdomschool.student.pojo.Teacher;

@Service
public class TeacherService {

	@Autowired
	private TeacherMapper teacherMapper;

	// 更具 Id 得到一个老师对象
	public Teacher getTeacherById(int treId) {
		return this.teacherMapper.getTeacherById(treId);
	}

	// 更具 通行证号 得到一个老师对象
	public Teacher getTeacherByUserNum(String uNum) {
		return this.teacherMapper.getTeacherByUserNum(uNum);
	}
}
