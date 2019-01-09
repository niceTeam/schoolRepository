package com.accp.spring.zml.vo;

import java.io.Serializable;
import java.util.List;


public class BookVo implements Serializable {

	/**
	 * 书本扩展
	 * 
	 */
	private static final long serialVersionUID = 2889373872367920434L;
	
	private int bookId;
	private String bookName;
	private int gid;//年级id
	private List<CourseVo> courseList;
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getGid() {
		return gid;
	}
	public void setGid(int gid) {
		this.gid = gid;
	}
	public List<CourseVo> getCourseList() {
		return courseList;
	}
	public void setCourseList(List<CourseVo> courseList) {
		this.courseList = courseList;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "BookVo [bookId=" + bookId + ", bookName=" + bookName + ", gid=" + gid + ", courseList=" + courseList
				+ "]";
	}
	

}
