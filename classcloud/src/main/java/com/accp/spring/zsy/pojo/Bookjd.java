package com.accp.spring.zsy.pojo;

import java.io.Serializable;
import java.util.List;

public class Bookjd implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -5003511112116948125L;
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
	public List<Coursejd> getListc() {
		return listc;
	}
	public void setListc(List<Coursejd> listc) {
		this.listc = listc;
	}
	private String bookName;
	private int gid;//年级id
	private List<Coursejd> listc;
}
