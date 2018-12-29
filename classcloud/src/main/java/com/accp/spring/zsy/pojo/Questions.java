package com.accp.spring.zsy.pojo;

import java.io.Serializable;

public class Questions implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5711945209358536536L;
	
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
	public String getZsd() {
		return zsd;
	}
	public void setZsd(String zsd) {
		this.zsd = zsd;
	}
	public String getFbr() {
		return fbr;
	}
	public void setFbr(String fbr) {
		this.fbr = fbr;
	}
	private String qtQuest;
	private int knowId;
	private String QtSendTime;
	private int teaId;
	private String privary;//私密度 私有题库1、或公开题库2
	private int isDel;//是否删除 1否 2是
	private String zsd;//知识点
	private String fbr;//发布人
}
