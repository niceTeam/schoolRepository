package com.wisdomschool.student.pojo;

/**
 * 班级
 * @author axiang
 *
 * 2018年12月17日 上午11:27:28
 */
public class Classes {
	private int classId;
	private String cName; // 班级名称
	private int gId;// 年级编号

	public Classes() {
	}

	public Classes(String cName, int gId) {
		this.cName = cName;
		this.gId = gId;
	}

	@Override
	public String toString() {
		return "Classes [classId=" + classId + ", cName=" + cName + ", gId=" + gId + "]";
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

}
