package com.accp.spring.pojo;

import java.io.Serializable;

import lombok.Data;

/**
 * 课程知识点
 * @author zml
 *
 */
@Data
public class Knowledge implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8685945575750530939L;
	private int knowId;
	private String knowName;
	private int courseId;//课程章节id
	@Override
	public String toString() {
		return "Knowledge [knowId=" + knowId + ", knowName=" + knowName + ", courseId=" + courseId + "]";
	}
	
	
}
