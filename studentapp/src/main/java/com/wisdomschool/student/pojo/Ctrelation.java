package com.wisdomschool.student.pojo;
/**
 * 班级与老师的带班历史记录表
 * @author axiang
 *
 * 2018年12月22日 上午9:23:15
 */
public class Ctrelation implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private Integer id;
	private Integer teaid;// 老师Id
	private Integer classid;// 班级Id
	private String cttime;// 开始带班时间

	public Ctrelation() {
		super();
	}

	public Ctrelation(Integer id, Integer teaid, Integer classid, String cttime) {
		super();
		this.id = id;
		this.teaid = teaid;
		this.classid = classid;
		this.cttime = cttime;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getTeaid() {
		return this.teaid;
	}

	public void setTeaid(Integer teaid) {
		this.teaid = teaid;
	}

	public Integer getClassid() {
		return this.classid;
	}

	public void setClassid(Integer classid) {
		this.classid = classid;
	}

	public String getCttime() {
		return this.cttime;
	}

	public void setCttime(String cttime) {
		this.cttime = cttime;
	}

}
