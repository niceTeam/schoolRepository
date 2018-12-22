package com.wisdomschool.student.service;
import java.util.List;
import com.wisdomschool.student.mapper.EnterhighrecordMapper;
import com.wisdomschool.student.pojo.Enterhighrecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class EnterhighrecordService {
    @Autowired
    private EnterhighrecordMapper enterhighrecordMapper;
    
    public long getEnterhighrecordRowCount(){
        return enterhighrecordMapper.getEnterhighrecordRowCount();
    }
    
    public List<Enterhighrecord> selectEnterhighrecord(){
        return enterhighrecordMapper.selectEnterhighrecord();
    }
    
    public Enterhighrecord selectEnterhighrecordByObj(Enterhighrecord obj){
        return enterhighrecordMapper.selectEnterhighrecordByObj(obj);
    }
    
    public Enterhighrecord selectEnterhighrecordById(Integer id){
        return enterhighrecordMapper.selectEnterhighrecordById(id);
    }
    
    public int insertEnterhighrecord(Enterhighrecord value){
        return enterhighrecordMapper.insertEnterhighrecord(value);
    }
    
    public int insertNonEmptyEnterhighrecord(Enterhighrecord value){
        return enterhighrecordMapper.insertNonEmptyEnterhighrecord(value);
    }
    
    public int deleteEnterhighrecordById(Integer id){
        return enterhighrecordMapper.deleteEnterhighrecordById(id);
    }
    
    public int updateEnterhighrecordById(Enterhighrecord enti){
        return enterhighrecordMapper.updateEnterhighrecordById(enti);
    }
    
    public int updateNonEmptyEnterhighrecordById(Enterhighrecord enti){
        return enterhighrecordMapper.updateNonEmptyEnterhighrecordById(enti);
    }

    public EnterhighrecordMapper getEnterhighrecordMapper() {
        return this.enterhighrecordMapper;
    }

    public void setEnterhighrecordMapper(EnterhighrecordMapper enterhighrecordMapper) {
        this.enterhighrecordMapper = enterhighrecordMapper;
    }

}