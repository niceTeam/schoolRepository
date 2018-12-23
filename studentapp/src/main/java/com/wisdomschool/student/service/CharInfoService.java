package com.wisdomschool.student.service;

import java.util.List;
import com.wisdomschool.student.mapper.CharInfoMapper;
import com.wisdomschool.student.pojo.CharInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CharInfoService {
	@Autowired
	private CharInfoMapper charInfoMapper;

	public long getCharInfoRowCount() {
		return charInfoMapper.getCharInfoRowCount();
	}

	public List<CharInfo> selectCharInfo() {
		return charInfoMapper.selectCharInfo();
	}

	public CharInfo selectCharInfoByObj(CharInfo obj) {
		return charInfoMapper.selectCharInfoByObj(obj);
	}

	public CharInfo selectCharInfoById(Integer id) {
		return charInfoMapper.selectCharInfoById(id);
	}

	public int insertCharInfo(CharInfo value) {
		return charInfoMapper.insertCharInfo(value);
	}

	public int insertNonEmptyCharInfo(CharInfo value) {
		return charInfoMapper.insertNonEmptyCharInfo(value);
	}

	public int deleteCharInfoById(Integer id) {
		return charInfoMapper.deleteCharInfoById(id);
	}

	public int updateCharInfoById(CharInfo enti) {
		return charInfoMapper.updateCharInfoById(enti);
	}

	public int updateNonEmptyCharInfoById(CharInfo enti) {
		return charInfoMapper.updateNonEmptyCharInfoById(enti);
	}

}