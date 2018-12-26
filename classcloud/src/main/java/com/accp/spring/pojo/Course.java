package com.accp.spring.pojo;

import java.io.Serializable;

import lombok.Data;
/**
 * 课程章节
 * @author zml
 *
 */
@Data
public class Course implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6305009991868745556L;
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
	private String courseName;
	private int bookId;
	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", bookId=" + bookId + "]";
	}
	
	
	
	/**
	 * courseId INT PRIMARY KEY AUTO_INCREMENT COMMENT '章节id',
	courseName VARCHAR(100) COMMENT '章节名称',
	bookId INT COMMENT '书本id'
	 */
}
