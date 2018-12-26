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
	public int getKnowId() {
		return knowId;
	}
	public void setKnowId(int knowId) {
		this.knowId = knowId;
	}
	public String getKnowName() {
		return knowName;
	}
	public void setKnowName(String knowName) {
		this.knowName = knowName;
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	private String knowName;
	private int courseId;//课程章节id
	@Override
	public String toString() {
		return "Knowledge [knowId=" + knowId + ", knowName=" + knowName + ", courseId=" + courseId + "]";
	}
	
	
}
