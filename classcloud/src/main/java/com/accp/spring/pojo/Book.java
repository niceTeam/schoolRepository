package com.accp.spring.pojo;

import java.io.Serializable;

import lombok.Data;

/**
 * 课程书本
 * @author zml
 *
 */
@Data
public class Book implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7269774557297045913L;
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
	private String bookName;
	private int gid;//年级id
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", gid=" + gid + "]";
	}
	
}
