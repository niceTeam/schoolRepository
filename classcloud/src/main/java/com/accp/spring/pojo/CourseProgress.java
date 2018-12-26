package com.accp.spring.pojo;

import java.io.Serializable;

/**
 * 章节刷题进度
 * @author zml
 *
 */
public class CourseProgress implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2455458407998575598L;
	private int cpId;
	public int getCpId() {
		return cpId;
	}
	public void setCpId(int cpId) {
		this.cpId = cpId;
	}
	public int getStuId() {
		return stuId;
	}
	public void setStuId(int stuId) {
		this.stuId = stuId;
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
	public int getProgressCount() {
		return progressCount;
	}
	public void setProgressCount(int progressCount) {
		this.progressCount = progressCount;
	}
	private int stuId;
	private int courseId;
	private int percent;
	private int progressCount;
	@Override
	public String toString() {
		return "CourseProgress [cpId=" + cpId + ", stuId=" + stuId + ", courseId=" + courseId + ", percent=" + percent
				+ ", progressCount=" + progressCount + "]";
	}
	
	
	/**
	 * cpId int primary key auto_increment,
	stuId int comment '学员id',
	courseId int comment '章节id',
	percent int comment '百分比数值',
	progressCount int comment '第几遍'
	 */
}
