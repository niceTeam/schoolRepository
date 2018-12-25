package com.accp.spring.pojo;

import java.io.Serializable;

import lombok.Data;

/**
 * 年级
 * @author zml
 *
 */
@Data
public class Grade implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int gId;
	private String gName;
	public int getgId() {
		return gId;
	}
	public void setgId(int gId) {
		this.gId = gId;
	}
	public String getgName() {
		return gName;
	}
	public void setgName(String gName) {
		this.gName = gName;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Grade [gId=" + gId + ", gName=" + gName + "]";
	}
	
}
