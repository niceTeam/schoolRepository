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
