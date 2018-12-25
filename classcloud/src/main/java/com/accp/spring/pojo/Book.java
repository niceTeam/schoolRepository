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
	private String bookName;
	private int gid;//年级id
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", gid=" + gid + "]";
	}
	
}
