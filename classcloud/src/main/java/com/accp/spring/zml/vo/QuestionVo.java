package com.accp.spring.zml.vo;

import java.io.Serializable;

public class QuestionVo implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1545977736106719594L;
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
	private int idDouble;
	public int getIdDouble() {
		return idDouble;
	}
	public void setIdDouble(int idDouble) {
		this.idDouble = idDouble;
	}
	private int opId;
	public int getOpId() {
		return opId;
	}
	public void setOpId(int opId) {
		this.opId = opId;
	}
	public String getOpORder() {
		return opORder;
	}
	public void setOpORder(String opORder) {
		this.opORder = opORder;
	}
	public String getRightOption() {
		return rightOption;
	}
	public void setRightOption(String rightOption) {
		this.rightOption = rightOption;
	}
	public int getIsRight() {
		return isRight;
	}
	public void setIsRight(int isRight) {
		this.isRight = isRight;
	}
	private String opORder;//问题答案选项序列
	private String rightOption;//问题答案选项
	private int isRight;//是否为正确答案 1:是 2:否

}
