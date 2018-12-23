package com.wisdomschool.student.pojo;

import java.io.Serializable;
import java.util.List;

/**
 * 对话表
 * 
 * @author axiang
 *
 *         2018年12月21日 下午2:28:19
 */
public class Dialogue implements Serializable {
	private static final long serialVersionUID = 4752692379538924944L;
	private Integer dId;
	private String sendId; // 发送人Id
	private String beSendId; // 接收人Id/群
	private Integer isqun; // 是否为群聊 1：不是 2：是
	private Integer state;

	private List<CharInfo> charInfos;

	public Dialogue() {
	}

	public Dialogue(String sendId, String beSendId, Integer isqun, Integer state) {
		this.sendId = sendId;
		this.beSendId = beSendId;
		this.isqun = isqun;
		this.state = state;
	}

	public Dialogue(String sendId, String beSendId, Integer isqun, Integer state, List<CharInfo> charInfos) {
		this.sendId = sendId;
		this.beSendId = beSendId;
		this.isqun = isqun;
		this.state = state;
		this.charInfos = charInfos;
	}

	public Integer getdId() {
		return dId;
	}

	public void setdId(Integer dId) {
		this.dId = dId;
	}

	public String getSendId() {
		return sendId;
	}

	public void setSendId(String sendId) {
		this.sendId = sendId;
	}

	public String getBeSendId() {
		return beSendId;
	}

	public void setBeSendId(String beSendId) {
		this.beSendId = beSendId;
	}

	public Integer getIsqun() {
		return isqun;
	}

	public void setIsqun(Integer isqun) {
		this.isqun = isqun;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public List<CharInfo> getCharInfos() {
		return charInfos;
	}

	public void setCharInfos(List<CharInfo> charInfos) {
		this.charInfos = charInfos;
	}

}
