package com.wisdomschool.student.service;

import java.util.List;
import com.wisdomschool.student.mapper.GroupChatMapper;
import com.wisdomschool.student.pojo.GroupChat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GroupChatService {
	@Autowired
	private GroupChatMapper groupChatMapper;

	public long getGroupChatRowCount() {
		return groupChatMapper.getGroupChatRowCount();
	}

	public List<GroupChat> selectGroupChat() {
		return groupChatMapper.selectGroupChat();
	}

	public GroupChat selectGroupChatByObj(GroupChat obj) {
		return groupChatMapper.selectGroupChatByObj(obj);
	}

	public GroupChat selectGroupChatById(Integer id) {
		return groupChatMapper.selectGroupChatById(id);
	}

	public int insertGroupChat(GroupChat value) {
		return groupChatMapper.insertGroupChat(value);
	}

	public int insertNonEmptyGroupChat(GroupChat value) {
		return groupChatMapper.insertNonEmptyGroupChat(value);
	}

	public int deleteGroupChatById(Integer id) {
		return groupChatMapper.deleteGroupChatById(id);
	}

	public int updateGroupChatById(GroupChat enti) {
		return groupChatMapper.updateGroupChatById(enti);
	}

	public int updateNonEmptyGroupChatById(GroupChat enti) {
		return groupChatMapper.updateNonEmptyGroupChatById(enti);
	}

	public GroupChatMapper getGroupChatMapper() {
		return this.groupChatMapper;
	}

	public void setGroupChatMapper(GroupChatMapper groupChatMapper) {
		this.groupChatMapper = groupChatMapper;
	}

}