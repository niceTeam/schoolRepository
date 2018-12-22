package com.wisdomschool.student.service;

import java.util.List;
import com.wisdomschool.student.mapper.CharinfoMapper;
import com.wisdomschool.student.pojo.CharInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CharinfoServiceImpl {
	@Autowired
	private CharinfoMapper charinfoMapper;

	public long getCharinfoRowCount() {
		return charinfoMapper.getCharinfoRowCount();
	}

	public List<CharInfo> selectCharinfo() {
		return charinfoMapper.selectCharinfo();
	}

	public CharInfo selectCharinfoByObj(CharInfo obj) {
		return charinfoMapper.selectCharinfoByObj(obj);
	}

	public CharInfo selectCharinfoById(Integer id) {
		return charinfoMapper.selectCharinfoById(id);
	}

	public int insertCharinfo(CharInfo value) {
		return charinfoMapper.insertCharinfo(value);
	}

	public int insertNonEmptyCharinfo(CharInfo value) {
		return charinfoMapper.insertNonEmptyCharinfo(value);
	}

	public int deleteCharinfoById(Integer id) {
		return charinfoMapper.deleteCharinfoById(id);
	}

	public int updateCharinfoById(CharInfo enti) {
		return charinfoMapper.updateCharinfoById(enti);
	}

	public int updateNonEmptyCharinfoById(CharInfo enti) {
		return charinfoMapper.updateNonEmptyCharinfoById(enti);
	}
}