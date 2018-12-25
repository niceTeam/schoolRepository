package com.accp.spring.pojo;

import java.io.Serializable;

import lombok.Data;

/**
 * 题目题库
 * @author zml
 *
 */
@Data
public class Question implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7262039908838861549L;
	private int qtId;
	private String qtQuest;
	private int knowId;
	private String QtSendTime;
	private int teaId;
	private String privary;//私密度 私有题库1、或公开题库2
	private int isDel;//是否删除 1否 2是
	@Override
	public String toString() {
		return "Question [qtId=" + qtId + ", qtQuest=" + qtQuest + ", knowId=" + knowId + ", QtSendTime=" + QtSendTime
				+ ", teaId=" + teaId + ", privary=" + privary + ", isDel=" + isDel + "]";
	}
}
