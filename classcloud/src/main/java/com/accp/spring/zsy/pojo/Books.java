package com.accp.spring.zsy.pojo;

import java.io.Serializable;
import java.util.List;

import com.accp.spring.pojo.Course;

import lombok.Data;


public class Books implements Serializable{

	/**
	 * 书本扩展表
	 */
	
	private static final long serialVersionUID = 8883664180652120408L;

	private int bookId;
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
	public List<Courses> getListc() {
		return listc;
	}
	public void setListc(List<Courses> listc) {
		this.listc = listc;
	}
	private String bookName;
	private int gid;//年级id
	private List<Courses> listc;
}
