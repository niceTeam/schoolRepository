package com.wisdomschool.student.service;

import java.util.List;
import com.wisdomschool.student.mapper.GroupchatMapper;
import com.wisdomschool.student.pojo.GroupChat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GroupchatService {
	@Autowired
	private GroupchatMapper groupchatMapper;

	public long getGroupchatRowCount() {
		return groupchatMapper.getGroupChatRowCount();
	}

	public List<GroupChat> selectGroupchat() {
		return groupchatMapper.selectGroupChat();
	}

	public GroupChat selectGroupchatByObj(GroupChat obj) {
		return groupchatMapper.selectGroupChatByObj(obj);
	}

	public GroupChat selectGroupchatById(Integer id) {
		return groupchatMapper.selectGroupChatById(id);
	}

	public int insertGroupchat(GroupChat value) {
		return groupchatMapper.insertGroupChat(value);
	}

	public int insertNonEmptyGroupchat(GroupChat value) {
		return groupchatMapper.insertNonEmptyGroupChat(value);
	}

	public int deleteGroupchatById(Integer id) {
		return groupchatMapper.deleteGroupChatById(id);
	}

	public int updateGroupchatById(GroupChat enti) {
		return groupchatMapper.updateGroupChatById(enti);
	}

	public int updateNonEmptyGroupchatById(GroupChat enti) {
		return groupchatMapper.updateNonEmptyGroupChatById(enti);
	}

}