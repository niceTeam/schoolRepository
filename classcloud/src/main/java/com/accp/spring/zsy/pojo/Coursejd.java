package com.accp.spring.zsy.pojo;

import java.io.Serializable;
import java.util.List;

public class Coursejd implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 328375891734815725L;
	
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
	public int getPercent() {
		return percent;
	}
	public void setPercent(int percent) {
		this.percent = percent;
	}
	public List<Knowledgejd> getListk() {
		return listk;
	}
	public void setListk(List<Knowledgejd> listk) {
		this.listk = listk;
	}
	private String courseName;
	private int bookId;
	private int percent;//进度比
	private List<Knowledgejd> listk;

}
