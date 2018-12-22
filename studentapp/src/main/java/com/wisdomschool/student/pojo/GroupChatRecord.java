package com.wisdomschool.student.pojo;

import java.io.Serializable;

/**
 * 群组聊天记录表
 * 
 * @author axiang
 *
 *         2018年12月19日 下午3:49:28
 */
public class GroupChatRecord implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -134524515960087830L;
	private int id;
	private int sendId;// 发送人id
	private String message;// 消息内容
	private String messageFile;// 文件图片消息 文件路径or图片路径
	private String time;// 发送时间
	private int isRemove;// 是否撤回

	@Override
	public String toString() {
		return "GroupChatRecord [id=" + id + ", sendId=" + sendId + ", message=" + message + ", messageFile="
				+ messageFile + ", time=" + time + ", isRemove=" + isRemove + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSendId() {
		return sendId;
	}

	public void setSendId(int sendId) {
		this.sendId = sendId;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getMessageFile() {
		return messageFile;
	}

	public void setMessageFile(String messageFile) {
		this.messageFile = messageFile;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public int getIsRemove() {
		return isRemove;
	}

	public void setIsRemove(int isRemove) {
		this.isRemove = isRemove;
	}
}
