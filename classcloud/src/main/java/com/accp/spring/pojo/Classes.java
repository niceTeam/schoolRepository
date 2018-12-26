package com.accp.spring.pojo;

import java.io.Serializable;

import lombok.Data;

/**
 *班级
 * @author zml
 *
 */
@Data
public class Classes implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -673774774222998206L;
	private int classId;
	private String cName;
	private int gId;
	private String graduateTime;//毕业时间
	
	
	public String getGraduateTime() {
		return graduateTime;
	}
	public void setGraduateTime(String graduateTime) {
		this.graduateTime = graduateTime;
	}
	public int getClassId() {
		return classId;
	}
	public void setClassId(int classId) {
		this.classId = classId;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public int getgId() {
		return gId;
	}
	public void setgId(int gId) {
		this.gId = gId;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Classes [classId=" + classId + ", cName=" + cName + ", gId=" + gId + ", graduateTime=" + graduateTime
				+ "]";
	}
	
}
