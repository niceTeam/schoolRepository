package com.wisdomschool.student.service;

import java.util.List;
import com.wisdomschool.student.mapper.CsrelationMapper;
import com.wisdomschool.student.pojo.Csrelation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CsrelationService {
	@Autowired
	private CsrelationMapper csrelationMapper;

	public long getCsrelationRowCount() {
		return csrelationMapper.getCsrelationRowCount();
	}

	public List<Csrelation> selectCsrelation() {
		return csrelationMapper.selectCsrelation();
	}

	public Csrelation selectCsrelationByObj(Csrelation obj) {
		return csrelationMapper.selectCsrelationByObj(obj);
	}

	public Csrelation selectCsrelationById(Integer id) {
		return csrelationMapper.selectCsrelationById(id);
	}

	public int insertCsrelation(Csrelation value) {
		return csrelationMapper.insertCsrelation(value);
	}

	public int insertNonEmptyCsrelation(Csrelation value) {
		return csrelationMapper.insertNonEmptyCsrelation(value);
	}

	public int deleteCsrelationById(Integer id) {
		return csrelationMapper.deleteCsrelationById(id);
	}

	public int updateCsrelationById(Csrelation enti) {
		return csrelationMapper.updateCsrelationById(enti);
	}

	public int updateNonEmptyCsrelationById(Csrelation enti) {
		return csrelationMapper.updateNonEmptyCsrelationById(enti);
	}

	public CsrelationMapper getCsrelationMapper() {
		return this.csrelationMapper;
	}

	public void setCsrelationMapper(CsrelationMapper csrelationMapper) {
		this.csrelationMapper = csrelationMapper;
	}

}