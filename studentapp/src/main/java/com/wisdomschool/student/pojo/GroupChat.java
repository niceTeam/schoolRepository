package com.wisdomschool.student.pojo;

import java.io.Serializable;

/**
 * 群组表
 * 
 * @author axiang
 *
 *         2018年12月19日 下午3:47:41
 */
public class GroupChat implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -7254797342319509906L;
	private int groupId;// 群组Id
	private String groupName;// 群组名
	private int ownerId;// 群主id
	private String groupTime;// 创立时间'

	@Override
	public String toString() {
		return "GroupChat [groupId=" + groupId + ", groupName=" + groupName + ", ownerId=" + ownerId + ", groupTime="
				+ groupTime + "]";
	}

	public int getGroupId() {
		return groupId;
	}

	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public int getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(int ownerId) {
		this.ownerId = ownerId;
	}

	public String getGroupTime() {
		return groupTime;
	}

	public void setGroupTime(String groupTime) {
		this.groupTime = groupTime;
	}
}
