package com.accp.spring.zsy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.spring.pojo.BrushHistory;
import com.accp.spring.pojo.BrushHistoryDetails;
import com.accp.spring.pojo.CourseProgress;
import com.accp.spring.pojo.Knowledge;
import com.accp.spring.pojo.KnowledgeProgress;
import com.accp.spring.pojo.MyCollection;
import com.accp.spring.pojo.Student;
import com.accp.spring.zsy.mapper.YtkMapper;
import com.accp.spring.zsy.pojo.Bookjd;
import com.accp.spring.zsy.pojo.Coursejd;
import com.accp.spring.zsy.pojo.Questions;

@Service
public class YtkService {

	@Autowired
	private YtkMapper ytkMapper;
	
	public Student dl(String zh,String pwd) {
		return this.ytkMapper.dl(zh, pwd);
	}
	
	@Transactional
	public List<Bookjd> cxBookjd(int gId,int uid){
		List<Bookjd> book=this.ytkMapper.cxBookjd(gId);
		
		for(Bookjd b:book) {
			 int bookId=b.getBookId();
			 b.setListc(this.ytkMapper.cxCoursejd(bookId, uid));
			 for(Coursejd c:b.getListc()) {
				 int courseId=c.getCourseId();
				 c.setListk(this.ytkMapper.cxKnowledgejd(courseId, uid));
			 }
		}
		
		return book;	
	}
	
	public List<Knowledge> cxzsd(int courseId){
		return this.ytkMapper.cxzsd(courseId);
	}
	
	@Transactional
	public List<Questions> sjcxtm(String zsdid,int sum,int xid){
		List<Questions> questions=this.ytkMapper.sjcxtm(zsdid,sum,xid);
		for(Questions q:questions) {
			int qtid=q.getQtId();
			q.setList(this.ytkMapper.cxtmdaan(qtid));
		}
		return questions;
	}
	
	public int tjsc(MyCollection Collection) {
		return this.ytkMapper.tjsc(Collection);
	}
	
	public int qxsc(int xid,int tmid) {
		return this.ytkMapper.qxsc(xid,tmid);
	}
	
	@Transactional
	public int xzstjl(BrushHistory brushHistory) {
		this.ytkMapper.xzstjl(brushHistory);
		int xid=brushHistory.getStuId();
		int id=this.ytkMapper.cxstjlid(xid);
		return id;
	}
	
	public int xzstmx(BrushHistoryDetails stmx) {
		return this.ytkMapper.xzstmx(stmx);
	}
	
	@Transactional
	public int cxzjjd(int stuId,int courseId,int percent,int progressCount) {
		CourseProgress c=this.ytkMapper.cxzjjd(stuId, courseId);
		int cpId=c.getCpId();
		if(cpId>0) {
			this.ytkMapper.xgzjjd(cpId, percent, progressCount);
		}else {
			CourseProgress courseProgress=new CourseProgress();
			courseProgress.setStuId(stuId);
			courseProgress.setCourseId(courseId);
			courseProgress.setProgressCount(progressCount);
			courseProgress.setPercent(percent);
			this.ytkMapper.xzzjjd(courseProgress);
		}
		return 1;
	}
	
	@Transactional
	public int cxzsdjd(int stuId,int knowId,int percent,int progressCount){
		KnowledgeProgress k=this.ytkMapper.cxzsdjd(stuId, knowId);
		int kpId=k.getKpId();
		if(kpId>0) {
			this.ytkMapper.xgzsdjd(kpId, percent, progressCount);
		}else {
			KnowledgeProgress zsdjd=new KnowledgeProgress();
			zsdjd.setStuId(stuId);
			zsdjd.setKnowId(knowId);
			zsdjd.setPercent(percent);
			zsdjd.setProgressCount(progressCount);
			this.ytkMapper.xzzsdjd(zsdjd);
			
		}
		return 1;
	}
}
