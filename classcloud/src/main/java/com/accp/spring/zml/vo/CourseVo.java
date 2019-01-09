package com.accp.spring.zml.vo;

import java.io.Serializable;
import java.util.List;

import com.accp.spring.pojo.Knowledge;

public class CourseVo implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 496526823907038461L;
	private int courseId;
	private String courseName;
	private int bookId;
	private List<Knowledge> knowList;
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
	public List<Knowledge> getKnowList() {
		return knowList;
	}
	public void setKnowList(List<Knowledge> knowList) {
		this.knowList = knowList;
	}
	@Override
	public String toString() {
		return "CourseVo [courseId=" + courseId + ", courseName=" + courseName + ", bookId=" + bookId + ", knowList="
				+ knowList + "]";
	}
	
	
	
}
