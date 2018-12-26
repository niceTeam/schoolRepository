package com.accp.spring.pojo;

import java.io.Serializable;

public class ExamPaperKnowledge implements Serializable {

	/**
	 * 考试试卷模板与知识点关系表
	 */
	private static final long serialVersionUID = 5939765910634589668L;
	
	private int epkId;
	public int getEpkId() {
		return epkId;
	}
	public void setEpkId(int epkId) {
		this.epkId = epkId;
	}
	public int getEpId() {
		return epId;
	}
	public void setEpId(int epId) {
		this.epId = epId;
	}
	public int getKnowId() {
		return knowId;
	}
	public void setKnowId(int knowId) {
		this.knowId = knowId;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	private int epId;
	private int knowId;
	private int count;
}
