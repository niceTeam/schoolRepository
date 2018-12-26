package com.accp.spring.zsy.pojo;

import java.io.Serializable;
import java.util.List;

import com.accp.spring.pojo.Knowledge;

public class Courses implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2899751801852383417L;
	
	private int courseId;
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public List<Knowledge> getListk() {
		return listk;
	}
	public void setListk(List<Knowledge> listk) {
		this.listk = listk;
	}
	private String courseName;
	private int bookId;
	private List<Knowledge> listk;

}
