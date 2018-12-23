package com.wisdomschool.student.service;

import java.util.List;
import com.wisdomschool.student.mapper.CtrelationMapper;
import com.wisdomschool.student.pojo.Ctrelation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CtrelationService {
	@Autowired
	private CtrelationMapper ctrelationMapper;

	public long getCtrelationRowCount() {
		return ctrelationMapper.getCtrelationRowCount();
	}

	public List<Ctrelation> selectCtrelation() {
		return ctrelationMapper.selectCtrelation();
	}

	public Ctrelation selectCtrelationByObj(Ctrelation obj) {
		return ctrelationMapper.selectCtrelationByObj(obj);
	}

	public Ctrelation selectCtrelationById(Integer id) {
		return ctrelationMapper.selectCtrelationById(id);
	}

	public int insertCtrelation(Ctrelation value) {
		return ctrelationMapper.insertCtrelation(value);
	}

	public int insertNonEmptyCtrelation(Ctrelation value) {
		return ctrelationMapper.insertNonEmptyCtrelation(value);
	}

	public int deleteCtrelationById(Integer id) {
		return ctrelationMapper.deleteCtrelationById(id);
	}

	public int updateCtrelationById(Ctrelation enti) {
		return ctrelationMapper.updateCtrelationById(enti);
	}

	public int updateNonEmptyCtrelationById(Ctrelation enti) {
		return ctrelationMapper.updateNonEmptyCtrelationById(enti);
	}

}