package com.accp.spring.zsy.pojo;

import java.io.Serializable;

public class Ctrelations implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -5059189781474617104L;
	
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getTeaId() {
		return teaId;
	}
	public void setTeaId(int teaId) {
		this.teaId = teaId;
	}
	public int getClassId() {
		return classId;
	}
	public void setClassId(int classId) {
		this.classId = classId;
	}
	public String getCtTime() {
		return ctTime;
	}
	public void setCtTime(String ctTime) {
		this.ctTime = ctTime;
	}
	private int teaId;
	private int classId;
	private String ctTime;
	private String cName;
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}

}
