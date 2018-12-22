package com.wisdomschool.student.mapper;
import com.wisdomschool.student.pojo.Csrelation;
import java.util.List;
public interface CsrelationMapper{
	/**
	 * 获得Csrelation数据的总行数
	 * @return
	 */
    long getCsrelationRowCount();
	/**
	 * 获得Csrelation数据集合
	 * @return
	 */
    List<Csrelation> selectCsrelation();
	/**
	 * 获得一个Csrelation对象,以参数Csrelation对象中不为空的属性作为条件进行查询
	 * @param obj
	 * @return
	 */
    Csrelation selectCsrelationByObj(Csrelation obj);
	/**
	 * 通过Csrelation的id获得Csrelation对象
	 * @param id
	 * @return
	 */
    Csrelation selectCsrelationById(Integer id);
	/**
	 * 插入Csrelation到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertCsrelation(Csrelation value);
	/**
	 * 插入Csrelation中属性值不为null的数据到数据库
	 * @param value
	 * @return
	 */
    int insertNonEmptyCsrelation(Csrelation value);
	/**
	 * 通过Csrelation的id删除Csrelation
	 * @param id
	 * @return
	 */
    int deleteCsrelationById(Integer id);
	/**
	 * 通过Csrelation的id更新Csrelation中的数据,包括null值
	 * @param enti
	 * @return
	 */
    int updateCsrelationById(Csrelation enti);
	/**
	 * 通过Csrelation的id更新Csrelation中属性不为null的数据
	 * @param enti
	 * @return
	 */
    int updateNonEmptyCsrelationById(Csrelation enti);
}