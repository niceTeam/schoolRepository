package com.accp.spring.pojo;

import java.io.Serializable;

import lombok.Data;

/**
 * 知识点刷题历史
 * @author zml
 *
 */
@Data
public class BrushHistory implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3608894838520557473L;
	private int bhId;
	public int getBhId() {
		return bhId;
	}
	public void setBhId(int bhId) {
		this.bhId = bhId;
	}
	public int getStuId() {
		return stuId;
	}
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}
	public String getKnowName() {
		return knowName;
	}
	public void setKnowName(String knowName) {
		this.knowName = knowName;
	}
	public int getIsCommit() {
		return isCommit;
	}
	public void setIsCommit(int isCommit) {
		this.isCommit = isCommit;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	private int stuId;
	private String knowName;
	private int isCommit;
	private String startTime;
	private String endTime;
	@Override
	public String toString() {
		return "BrushHistory [bhId=" + bhId + ", stuId=" + stuId + ", knowName=" + knowName + ", isCommit=" + isCommit
				+ ", startTime=" + startTime + ", endTime=" + endTime + "]";
	}
	
}
