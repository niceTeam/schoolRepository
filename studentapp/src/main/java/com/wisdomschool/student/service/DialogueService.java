package com.wisdomschool.student.service;
import java.util.List;
import com.wisdomschool.student.mapper.DialogueMapper;
import com.wisdomschool.student.pojo.Dialogue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class DialogueService {
    @Autowired
    private DialogueMapper dialogueMapper;
    
    public long getDialogueRowCount(){
        return dialogueMapper.getDialogueRowCount();
    }
    
    public List<Dialogue> selectDialogue(){
        return dialogueMapper.selectDialogue();
    }
    
    public Dialogue selectDialogueByObj(Dialogue obj){
        return dialogueMapper.selectDialogueByObj(obj);
    }
    
    public Dialogue selectDialogueById(Integer id){
        return dialogueMapper.selectDialogueById(id);
    }
    
    public int insertDialogue(Dialogue value){
        return dialogueMapper.insertDialogue(value);
    }
    
    public int insertNonEmptyDialogue(Dialogue value){
        return dialogueMapper.insertNonEmptyDialogue(value);
    }
    
    public int deleteDialogueById(Integer id){
        return dialogueMapper.deleteDialogueById(id);
    }
    
    public int updateDialogueById(Dialogue enti){
        return dialogueMapper.updateDialogueById(enti);
    }
    
    public int updateNonEmptyDialogueById(Dialogue enti){
        return dialogueMapper.updateNonEmptyDialogueById(enti);
    }

    public DialogueMapper getDialogueMapper() {
        return this.dialogueMapper;
    }

    public void setDialogueMapper(DialogueMapper dialogueMapper) {
        this.dialogueMapper = dialogueMapper;
    }

}