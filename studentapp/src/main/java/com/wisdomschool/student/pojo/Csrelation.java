package com.wisdomschool.student.pojo;

/**
 * 班级与学生关系
 * @author axiang
 *
 * 2018年12月17日 上午11:27:43
 */
public class Csrelation {
	private Integer id;
	private Integer stuId; // 学员Id
	private Integer classId; // 班级id
	private String csTime; // 进班时间
	private Integer isChange; // 是否转班

	public Csrelation() {
	}

	public Csrelation(Integer stuId, Integer classId, String csTime, Integer isChange) {
		this.stuId = stuId;
		this.classId = classId;
		this.csTime = csTime;
		this.isChange = isChange;
	}

	@Override
	public String toString() {
		return "Csrelation [id=" + id + ", stuId=" + stuId + ", classId=" + classId + ", csTime=" + csTime
				+ ", isChange=" + isChange + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getStuId() {
		return stuId;
	}

	public void setStuId(Integer stuId) {
		this.stuId = stuId;
	}

	public Integer getClassId() {
		return classId;
	}

	public void setClassId(Integer classId) {
		this.classId = classId;
	}

	public String getCsTime() {
		return csTime;
	}

	public void setCsTime(String csTime) {
		this.csTime = csTime;
	}

	public Integer getIsChange() {
		return isChange;
	}

	public void setIsChange(Integer isChange) {
		this.isChange = isChange;
	}

}
