package com.accp.spring.zsy.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.spring.pojo.Analyze;
import com.accp.spring.pojo.Appraise;
import com.accp.spring.pojo.BrushHistory;
import com.accp.spring.pojo.BrushHistoryDetails;
import com.accp.spring.pojo.Classes;
import com.accp.spring.pojo.CourseProgress;
import com.accp.spring.pojo.Knowledge;
import com.accp.spring.pojo.KnowledgeProgress;
import com.accp.spring.pojo.MyCollection;
import com.accp.spring.pojo.QuesOption;
import com.accp.spring.pojo.StuAnswer;
import com.accp.spring.pojo.Student;
import com.accp.spring.zsy.mapper.YtkMapper;
import com.accp.spring.zsy.pojo.Analyzes;
import com.accp.spring.zsy.pojo.Bookjd;
import com.accp.spring.zsy.pojo.Books;
import com.accp.spring.zsy.pojo.Coursejd;
import com.accp.spring.zsy.pojo.Errors;
import com.accp.spring.zsy.pojo.Examinations;
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
	public int cxzjjd(int stuId,int courseId) {
		//查询章节进度
		CourseProgress c=this.ytkMapper.cxzjjd(stuId, courseId);
		
		
		int zjid=courseId;
		int zjtmzs=this.ytkMapper.cxzjtmsl(zjid);//查询总数
		int wdsl=this.ytkMapper.cxwsgdzjtm(zjid, stuId);//我刷过的
		
		
		double sum=(double)wdsl/(double)zjtmzs;
			   sum=sum*100;
		int percent=(int) sum;
		
		System.out.println("章节总数:"+zjtmzs+",我刷过的:"+wdsl+"进度："+sum);
		
		if(c!=null) {
			
			int cpId=c.getCpId();
			int progressCount=c.getProgressCount();
						
			if(percent>=100) {
				
				System.out.println("修改进度：进度大于100");
				
				percent=100;
				progressCount++;
								
				List<QuesOption> qp=this.ytkMapper.wsgdzjtmid(zjid, stuId);
				for(QuesOption q:qp) {
					
					int tmid=q.getQtId();
					this.ytkMapper.xgstmxzt(tmid);//修改刷题明细的题目状态
				}			
			}
			
			this.ytkMapper.xgzjjd(cpId, percent, progressCount);
			
		}else {
			
			if(percent>=100) {
				
				System.out.println("新增进度：进度大于100");
				
				percent=100;
								
				List<QuesOption> qp=this.ytkMapper.wsgdzjtmid(zjid, stuId);
				for(QuesOption q:qp) {
					
					int tmid=q.getQtId();
					this.ytkMapper.xgstmxzt(tmid);//修改刷题明细的题目状态
				}			
			}
			
			CourseProgress courseProgress=new CourseProgress();
			courseProgress.setStuId(stuId);
			courseProgress.setCourseId(courseId);
			courseProgress.setProgressCount(1);
			courseProgress.setPercent(percent);
			
			this.ytkMapper.xzzjjd(courseProgress);
						
		}
		
		List<Knowledge> kd=this.ytkMapper.cxzjxdzsd(zjid, stuId);//查询章节下的知识点
		
		for(Knowledge k:kd) {
			
			int zsdid=k.getKnowId();
			int knowId=zsdid;
			int zs=this.ytkMapper.cxzsdtmsl(zsdid);//查询总数
			int wsd=this.ytkMapper.cxwsgdzsdtm(zsdid, stuId);//我刷的
			
			double sl=wsd/zs;
			   	   sl=sl*100;
			percent=(int) sl;
			
			KnowledgeProgress kp=this.ytkMapper.cxzsdjd(stuId,knowId);
			
			
			if(kp!=null) {
				
				System.out.println("修改知识点进度");
				
				int kpId=kp.getKpId();
				int progressCount=kp.getProgressCount();
				
				if(percent>=100) {
					
					System.out.println("知识点进度等于100");
					percent=100;
					progressCount++;
						
					List<QuesOption> q=this.ytkMapper.wsgdzsdtmid(knowId, stuId);
					for(QuesOption qs:q) {
						int tmid=qs.getQtId();
						this.ytkMapper.xgstmxzt(tmid);
					}
	
				}
				
				this.ytkMapper.xgzsdjd(kpId, percent, progressCount);
				
			}else {
				
				System.out.println("新增知识点进度");
				
				if(percent>=100) {
					
					System.out.println("知识点进度等于100");
					percent=100;
						
					List<QuesOption> q=this.ytkMapper.wsgdzsdtmid(knowId, stuId);
					for(QuesOption qs:q) {
						int tmid=qs.getQtId();
						this.ytkMapper.xgstmxzt(tmid);
					}
	
				}
				
				KnowledgeProgress zsdjd=new KnowledgeProgress();
				zsdjd.setStuId(stuId);
				zsdjd.setKnowId(knowId);
				zsdjd.setPercent(percent);
				zsdjd.setProgressCount(1);
				this.ytkMapper.xzzsdjd(zsdjd);
				
			}		
			
		}
			
		return 1;
	}
	
	public int xzct(int stuId,int bhId) {
		
		List<BrushHistoryDetails> b=this.ytkMapper.cxsttm(bhId);//查询刷题历史的详细
		List<Errors> er=this.ytkMapper.cxct(stuId);//查询我的错题
		Errors error=new Errors(); 
		
		for(BrushHistoryDetails l:b) {
			String yes=l.getRightAnswer();
			String no=l.getStuAnswer();
			if(yes==no||yes.equals(no)) {//答对的题
				
				for(Errors e:er) {
					
					if(l.getQtId()==e.getQtId()) {//如果错题表有这道题
						//删除错题纪录
						this.ytkMapper.scct(stuId,l.getQtId());
					}
				}				
					
			}else {//答错的题
				if(er.size() != 0) {
					for(Errors e:er) {
						if(l.getQtId()==e.getQtId()) {//如果错题表有这道题
							
							//修改错题次数和答案
							this.ytkMapper.xgct(stuId,l.getQtId(),l.getStuAnswer());
							System.out.println("修改错题次数纪录");
							break;
							
						}else {//如果错题表没有这题
							
							error.setQtId(l.getQtId());
							error.setStuId(stuId);
							error.setRecentlyAnswer(l.getStuAnswer());
							error.setErrorCount(1);
							System.out.println("新增错题纪录："+this.ytkMapper.ctxz(error));//没有纪录新增一条
							
						}
					}	
				}else {
					error.setQtId(l.getQtId());
					error.setStuId(stuId);
					error.setRecentlyAnswer(l.getStuAnswer());
					error.setErrorCount(1);
					System.out.println("新增错题纪录："+this.ytkMapper.ctxz(error));//没有纪录新增一条
				}
						
			}	
	}
	/*	for(int a=0;a<b.size();a++) {
							
			for(int i=0;i<er.size();i++) {		
				
				if(b.get(a).getRightAnswer()!=b.get(a).getStuAnswer()) {//答错的题
				
					if(b.get(a).getQtId()== er.get(i).getQtId()) {						
						//修改错题次数和答案
						this.ytkMapper.xgct(stuId, b.get(a).getQtId(), b.get(a).getStuAnswer());
						System.out.println("修改错题次数纪录："+i);
						break;
						
					}else if(i==(er.size()-1)){
						
						
						error.setQtId(b.get(i).getQtId());
						error.setStuId(stuId);
						error.setRecentlyAnswer(b.get(a).getStuAnswer());
						error.setErrorCount(1);
						System.out.println("新增错题纪录："+this.ytkMapper.ctxz(error));//没有纪录新增一条
					}
				}else {//答对的题
					
					if(b.get(a).getQtId()== er.get(i).getQtId()) {	
						//删除错题纪录
						this.ytkMapper.scct(stuId, b.get(a).getQtId());
					}
				}
			}
		 }*/
		
		return 1;
	}
	
	@Transactional
	public int cxzsdjd(int stuId,int knowId){
		
		KnowledgeProgress k=this.ytkMapper.cxzsdjd(stuId, knowId);
		
		
		int zsdid=knowId;
		int zs=this.ytkMapper.cxzsdtmsl(zsdid);//查询总数
		int wsd=this.ytkMapper.cxwsgdzsdtm(zsdid, stuId);//我刷的
		
		double sl=(double)zs/(double)wsd;
		   	   sl=sl*100;
		int percent=(int) sl;
				
		if(k!=null) {
			
			int kpId=k.getKpId();
			int progressCount=k.getProgressCount();
			
			if(percent>=100) {
				percent=100;
				progressCount++;
					
				List<QuesOption> q=this.ytkMapper.wsgdzsdtmid(knowId, stuId);
				for(QuesOption qs:q) {
					int tmid=qs.getQtId();
					this.ytkMapper.xgstmxzt(tmid);
				}
			}
			
			this.ytkMapper.xgzsdjd(kpId, percent, progressCount);
			
		}else {
			
			if(percent>=100) {
				
				percent=100;
					
				List<QuesOption> q=this.ytkMapper.wsgdzsdtmid(knowId, stuId);
				for(QuesOption qs:q) {
					int tmid=qs.getQtId();
					this.ytkMapper.xgstmxzt(tmid);//修改每个题目的状态
				}
			}
			
			KnowledgeProgress zsdjd=new KnowledgeProgress();
			zsdjd.setStuId(stuId);
			zsdjd.setKnowId(knowId);
			zsdjd.setPercent(percent);
			zsdjd.setProgressCount(1);
			this.ytkMapper.xzzsdjd(zsdjd);
			
		}
		
		int zjid=this.ytkMapper.cxzsddzjid(knowId);
		int courseId=zjid;
		//查询章节进度
		CourseProgress c=this.ytkMapper.cxzjjd(stuId, courseId);
		
		
		int zjtmzs=this.ytkMapper.cxzjtmsl(zjid);//查询总数
		int wdsl=this.ytkMapper.cxwsgdzjtm(zjid, stuId);//我刷过的
		
		double sum=wdsl/zjtmzs;
			   sum=sum*100;
		percent=(int) sum;
		
		if(c!=null) {
			
			int cpId=c.getCpId();
			int progressCount=c.getProgressCount();
			
			if(percent>=100) {
				
				percent=100;
				progressCount++;
					
				List<QuesOption> qp=this.ytkMapper.wsgdzjtmid(zjid, stuId);
				for(QuesOption q:qp) {
					
					int tmid=q.getQtId();
					this.ytkMapper.xgstmxzt(tmid);//修改刷题明细的题目状态
				}			
			}
			
			this.ytkMapper.xgzjjd(cpId, percent, progressCount);
			
		}else {
			
			if(percent>=100) {
				
				percent=100;
					
				List<QuesOption> qp=this.ytkMapper.wsgdzjtmid(zjid, stuId);
				for(QuesOption q:qp) {
					
					int tmid=q.getQtId();
					this.ytkMapper.xgstmxzt(tmid);//修改刷题明细的题目状态
				}			
			}
			
			CourseProgress courseProgress=new CourseProgress();
			courseProgress.setStuId(stuId);
			courseProgress.setCourseId(courseId);
			courseProgress.setProgressCount(1);
			courseProgress.setPercent(percent);
			
			this.ytkMapper.xzzjjd(courseProgress);
			
		}
					
		return 1;
	}
	
	public List<Questions> cxzxstbg(int stuId){
		List<Questions> questions=this.ytkMapper.cxzxstbg(stuId);
		for(Questions q:questions) {
			int qtid=q.getQtId();
			q.setList(this.ytkMapper.cxtmdaan(qtid));
		}
		return questions;
	}
	
	public List<Analyzes> cxjx(int qtId){
		return this.ytkMapper.cxjx(qtId);
	}
	
	public int xzjx(Analyzes a) {
		return this.ytkMapper.xzjx(a);
	}
	
	public Appraise sfdz(int stuId,int jxid) {
		return this.ytkMapper.sfdz(stuId, jxid);
	}
	
	public int xzdz(Appraise a) {
		return this.ytkMapper.xzdz(a);
	}
	
	public int xgdz(int stuId,int jxid,int appraise) {
		return this.ytkMapper.xgdz(stuId, jxid, appraise);
	}
	
	public int xgjx(int yes,int no,int jxid) {
		return this.ytkMapper.xgjx(yes, no, jxid);
	}
	
	public List<Knowledge> cxkczsd(int bookId) {
		return this.ytkMapper.cxkczsd(bookId);
	}
	public Classes cxxsnj(int stuId) {
		return this.ytkMapper.cxxsnj(stuId);
	}
	
	public List<Examinations> cxwdtycs(String bjid,String time){
		return this.ytkMapper.cxwdtycs(bjid, time);
	}
	
	public List<Knowledge> cxnjxdzsd(int gid){
		return this.ytkMapper.cxnjxdzsd(gid);
	}
	
	public List<BrushHistoryDetails> cxljsum(String time){
		return this.ytkMapper.cxljsum(time);
	}
	
	public List<BrushHistoryDetails> cxsjsum(String time){
		return this.ytkMapper.cxsjsum(time);
	}
	
	public int cxzql(String time) {
		return this.ytkMapper.cxzql(time);
	}
	
	public int xzksdaan(StuAnswer da) {
		return this.ytkMapper.xzksdaan(da);
	}
	
	public int xgksryqk(String kssj,int jjfs,int score,int stuid,int ksid) {
		return this.ytkMapper.xgksryqk(kssj, jjfs, score, stuid, ksid);
	}
	
	public List<Questions> cxsjtm(int sjid,int stuid){
		List<Questions> questions= this.ytkMapper.cxsjtm(sjid, stuid);
		for(Questions q:questions) {
			int qtid=q.getQtId();
			q.setList(this.ytkMapper.cxtmdaan(qtid));
		}
		return questions;
	}
	
	public List<Books> cxkcsttm(int stuid,int njid){
		return this.ytkMapper.cxkcsttm(stuid, njid);
	}
	
	public List<Questions> cxsctm(int stuid,int bookid){
		List<Questions> questions=this.ytkMapper.cxkcscid(stuid, bookid);
		
		for(Questions q:questions) {
			int qtid=q.getQtId();
			q.setList(this.ytkMapper.cxtmdaan(qtid));
		}
		
		return questions;
	}
	
	public List<Questions> cxkcct(int stuid,int bookid){
		
		List<Questions> questions=this.ytkMapper.cxkcct(stuid, bookid);
		for(Questions q:questions) {
			int qtid=q.getQtId();
			q.setList(this.ytkMapper.cxtmdaan(qtid));
		}
		return questions;
	}
	
	public List<Books> cxkcctsl(int stuid,int njid){
		return this.ytkMapper.cxkcctsl(stuid, njid);
	}
}
