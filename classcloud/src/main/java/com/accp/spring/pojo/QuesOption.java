package com.accp.spring.pojo;

import java.io.Serializable;

import lombok.Data;

/**
 * 题目选项
 * @author zml
 *
 */
@Data
public class QuesOption implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 9177098168778977462L;
	private int opId;
	public int getOpId() {
		return opId;
	}
	public void setOpId(int opId) {
		this.opId = opId;
	}
	public int getQtId() {
		return qtId;
	}
	public void setQtId(int qtId) {
		this.qtId = qtId;
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
	private int qtId;//题目编号
	private String opORder;//问题答案选项序列
	private String rightOption;//问题答案选项
	private int isRight;//是否为正确答案 1:是 2:否
	@Override
	public String toString() {
		return "QuesOption [opId=" + opId + ", qtId=" + qtId + ", opORder=" + opORder + ", rightOption=" + rightOption
				+ ", isRight=" + isRight + "]";
	}
	
	
}
