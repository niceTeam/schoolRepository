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
