package com.accp.spring.zsy.pojo;

import java.io.Serializable;

public class Knowledgejd implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -1203033116514749003L;
	
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
	public int getPercent() {
		return percent;
	}
	public void setPercent(int percent) {
		this.percent = percent;
	}
	private String knowName;
	private int courseId;//课程章节id
	private int percent;//进度比

}
