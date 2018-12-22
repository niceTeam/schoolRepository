package com.wisdomschool.student.mapper;
import com.wisdomschool.student.pojo.Dialogue;
import java.util.List;
public interface DialogueMapper{
	/**
	 * 获得Dialogue数据的总行数
	 * @return
	 */
    long getDialogueRowCount();
	/**
	 * 获得Dialogue数据集合
	 * @return
	 */
    List<Dialogue> selectDialogue();
	/**
	 * 获得一个Dialogue对象,以参数Dialogue对象中不为空的属性作为条件进行查询
	 * @param obj
	 * @return
	 */
    Dialogue selectDialogueByObj(Dialogue obj);
	/**
	 * 通过Dialogue的id获得Dialogue对象
	 * @param id
	 * @return
	 */
    Dialogue selectDialogueById(Integer id);
	/**
	 * 插入Dialogue到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertDialogue(Dialogue value);
	/**
	 * 插入Dialogue中属性值不为null的数据到数据库
	 * @param value
	 * @return
	 */
    int insertNonEmptyDialogue(Dialogue value);
	/**
	 * 通过Dialogue的id删除Dialogue
	 * @param id
	 * @return
	 */
    int deleteDialogueById(Integer id);
	/**
	 * 通过Dialogue的id更新Dialogue中的数据,包括null值
	 * @param enti
	 * @return
	 */
    int updateDialogueById(Dialogue enti);
	/**
	 * 通过Dialogue的id更新Dialogue中属性不为null的数据
	 * @param enti
	 * @return
	 */
    int updateNonEmptyDialogueById(Dialogue enti);
}