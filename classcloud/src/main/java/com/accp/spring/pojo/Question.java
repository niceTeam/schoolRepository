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
	public int getQtId() {
		return qtId;
	}
	public void setQtId(int qtId) {
		this.qtId = qtId;
	}
	public String getQtQuest() {
		return qtQuest;
	}
	public void setQtQuest(String qtQuest) {
		this.qtQuest = qtQuest;
	}
	public int getKnowId() {
		return knowId;
	}
	public void setKnowId(int knowId) {
		this.knowId = knowId;
	}
	public String getQtSendTime() {
		return QtSendTime;
	}
	public void setQtSendTime(String qtSendTime) {
		QtSendTime = qtSendTime;
	}
	public int getTeaId() {
		return teaId;
	}
	public void setTeaId(int teaId) {
		this.teaId = teaId;
	}
	public String getPrivary() {
		return privary;
	}
	public void setPrivary(String privary) {
		this.privary = privary;
	}
	public int getIsDel() {
		return isDel;
	}
	public void setIsDel(int isDel) {
		this.isDel = isDel;
	}
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
