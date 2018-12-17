package com.wisdomschool.student.pojo;

/**
 * 班级升学记录
 * @author axiang
 *
 * 2018年12月17日 上午11:27:50
 */
public class Enterhighrecord {
	private Integer id;
	private Integer classId; // 班级id
	private Integer gId; // 年级 id
	private String enterTime; // 升学时间

	public Enterhighrecord() {
	}

	public Enterhighrecord(Integer classId, Integer gId, String enterTime) {
		this.classId = classId;
		this.gId = gId;
		this.enterTime = enterTime;
	}

	@Override
	public String toString() {
		return "Enterhighrecord [id=" + id + ", classId=" + classId + ", gId=" + gId + ", enterTime=" + enterTime + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getClassId() {
		return classId;
	}

	public void setClassId(Integer classId) {
		this.classId = classId;
	}

	public Integer getgId() {
		return gId;
	}

	public void setgId(Integer gId) {
		this.gId = gId;
	}

	public String getEnterTime() {
		return enterTime;
	}

	public void setEnterTime(String enterTime) {
		this.enterTime = enterTime;
	}
}
