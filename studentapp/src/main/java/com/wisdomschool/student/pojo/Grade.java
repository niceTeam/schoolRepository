package com.wisdomschool.student.pojo;

import java.io.Serializable;

/**
 * 年级
 * @author axiang
 *
 * 2018年12月17日 上午11:27:55
 */
public class Grade implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8059653762881056396L;
	private Integer gId;
	private String gName;

	public Grade() {
	}

	public Grade(String gName) {
		this.gName = gName;
	}

	@Override
	public String toString() {
		return "Grade [gId=" + gId + ", gName=" + gName + "]";
	}

	public Integer getgId() {
		return gId;
	}

	public void setgId(Integer gId) {
		this.gId = gId;
	}

	public String getgName() {
		return gName;
	}

	public void setgName(String gName) {
		this.gName = gName;
	}

}
