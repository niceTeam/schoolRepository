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
