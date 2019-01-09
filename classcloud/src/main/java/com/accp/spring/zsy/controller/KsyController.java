package com.accp.spring.zsy.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.spring.pojo.Analyze;
import com.accp.spring.pojo.Book;
import com.accp.spring.pojo.BrushHistory;
import com.accp.spring.pojo.BrushHistoryDetails;
import com.accp.spring.pojo.ExamPaper;
import com.accp.spring.pojo.ExamPaperHistory;
import com.accp.spring.pojo.ExamPaperKnowledge;
import com.accp.spring.pojo.Examination;
import com.accp.spring.pojo.Grade;
import com.accp.spring.pojo.Knowledge;
import com.accp.spring.pojo.MyCollection;
import com.accp.spring.pojo.PaperTitle;
import com.accp.spring.pojo.QuesOption;
import com.accp.spring.pojo.Question;
import com.accp.spring.pojo.StuTest;
import com.accp.spring.pojo.Student;
import com.accp.spring.pojo.Teacher;
import com.accp.spring.zsy.pojo.Bookjd;
import com.accp.spring.zsy.pojo.Books;
import com.accp.spring.zsy.pojo.Courses;
import com.accp.spring.zsy.pojo.Ctrelations;
import com.accp.spring.zsy.pojo.ExamPaperHistorys;
import com.accp.spring.zsy.pojo.ExamPapers;
import com.accp.spring.zsy.pojo.Examinations;
import com.accp.spring.zsy.pojo.Questions;
import com.accp.spring.zsy.pojo.Sjtmzsd;
import com.accp.spring.zsy.service.KsyService;
import com.accp.spring.zsy.service.YtkService;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("/ksy")
public class KsyController {
	
	@Autowired
	KsyService ksyService;
	
	@Autowired
	YtkService ytkService;
	
	@GetMapping("/dl")
	public String dl(HttpServletRequest request,HttpSession session) {
		//进入登录页面
		return "classcloud/dl.html";
	}
	
	@GetMapping("/xszy")
	public String xszy(HttpServletRequest request,HttpSession session,Model model) {
		//登录成功后跳到云题库首页
		model.addAttribute("xname",request.getSession().getAttribute("xsname"));
		model.addAttribute("xid",request.getSession().getAttribute("xsid"));
		return "classcloud/xssy.html";
	}
	
	@GetMapping("/tycs")
	public String tycs(HttpServletRequest request,HttpSession session,Model model) {
		//登录成功后跳到统一测试页
		model.addAttribute("xname",request.getSession().getAttribute("xsname"));
		model.addAttribute("xid",request.getSession().getAttribute("xsid"));
		return "classcloud/tycs.html";
	}
	
	@GetMapping("/stjx")
	public String stjx(HttpServletRequest request,HttpSession session,Model model) {
		//登录成功后跳到试题解析页
		model.addAttribute("xname",request.getSession().getAttribute("xsname"));
		model.addAttribute("xid",request.getSession().getAttribute("xsid"));
		return "classcloud/stjx.html";
	}
	
	@GetMapping("/dtls")
	public String dtls(HttpServletRequest request,HttpSession session,Model model) {
		//登录成功后跳到答题历史页面
		model.addAttribute("xname",request.getSession().getAttribute("xsname"));
		model.addAttribute("xid",request.getSession().getAttribute("xsid"));
		return "classcloud/dtls.html";
	}
	
	@GetMapping("/stym")
	public String stym(HttpServletRequest request,HttpSession session,Model model) {
		//登录成功后跳到刷题页面
		model.addAttribute("xname",request.getSession().getAttribute("xsname"));
		model.addAttribute("xid",request.getSession().getAttribute("xsid"));
		model.addAttribute("stid",request.getSession().getAttribute("stid"));
		model.addAttribute("fwmc",request.getSession().getAttribute("fwmc"));
		model.addAttribute("zt",request.getSession().getAttribute("zt"));
		return "classcloud/stym.html";
	}
	

	@ResponseBody
	@RequestMapping(value="/stymcz/{id}/{mc}/{zt}",method=RequestMethod.GET)
	public int stymcz(@PathVariable int id,@PathVariable String mc,@PathVariable int zt,HttpServletRequest request,HttpSession session) {
		//传值到
		request.getSession().setAttribute("stid",id);
		request.getSession().setAttribute("fwmc",mc);
		request.getSession().setAttribute("zt",zt);
		return 1;
	}
	
	@ResponseBody
	@RequestMapping(value="/xsyz/{zh}/{pwd}",method=RequestMethod.GET)
	public Student xsyz(@PathVariable String pwd,@PathVariable String zh,HttpServletRequest request,HttpSession session) {
		//验证登录是否正确
		Student s=this.ytkService.dl(zh, pwd);
		request.getSession().setAttribute("xsname",s.getStuName());
		request.getSession().setAttribute("xsid",s.getStuId());
		
		return s;
	}
	
	@ResponseBody
	@RequestMapping(value="/yz/{teaUserName}/{teaPwd}",method=RequestMethod.GET)
	public Teacher yz(@PathVariable String teaUserName,@PathVariable String teaPwd,HttpServletRequest request,HttpSession session) {
		//验证登录是否正确
		Teacher t=this.ksyService.dl(teaUserName,teaPwd);
		request.getSession().setAttribute("yhm", t.getTeaName());
		request.getSession().setAttribute("yhid", t.getTeaId());
		
		return t;
	}
	
	@GetMapping("/zy")
	public String zy(HttpServletRequest request,HttpSession session,Model model) {
		//登录成功后跳到考试云首页
		model.addAttribute("uname",request.getSession().getAttribute("yhm"));
		model.addAttribute("uid",request.getSession().getAttribute("yhid"));
		return "classcloud/sy.html";
	}
	
	@GetMapping("/sjyl")
	public String sjyl(HttpServletRequest request,HttpSession session,Model model) {
		//登录成功后跳到试卷预览页面
		model.addAttribute("uname",request.getSession().getAttribute("yhm"));
		model.addAttribute("uid",request.getSession().getAttribute("yhid"));
		model.addAttribute("sjid",request.getSession().getAttribute("sjid"));
		return "classcloud/sjyl.html";
	}
	
	@ResponseBody
	@RequestMapping(value="/bcsjid/{sjid}",method=RequestMethod.GET)
	public  int bcsjid(@PathVariable int sjid,HttpServletRequest request,HttpSession session){
		//传试卷id到试卷预览页面
		request.getSession().setAttribute("sjid", sjid);
		return 1;
	}
	
	@ResponseBody
	@RequestMapping(value="/cxgrade",method=RequestMethod.GET)
	public  List<Grade> cxgrade(){
		//查询所有年级
		return this.ksyService.cxgrade();
	}
	
	@ResponseBody
	@RequestMapping(value="/cxBook/{gId}",method=RequestMethod.GET)
	public List<Books> cxBook(@PathVariable int gId){
		//查询所有课程及下面的章节和知识点
		return this.ksyService.cxBook(gId);
	}
	
	@ResponseBody
	@RequestMapping(value="/cxBookjd/{gId}/{uid}",method=RequestMethod.GET)
	public List<Bookjd> cxBookjd(@PathVariable int gId,@PathVariable int uid){
		//查询所有课程及下面的章节和知识点及进度
		return this.ytkService.cxBookjd(gId, uid);
	}
	
	@ResponseBody
	@RequestMapping(value="/xztm",method=RequestMethod.POST)
	public int xztm(String wt,String jx,int uid,int idDouble,int zsdid) {
		//新增题目和解析
		Question question=new Question();
		question.setIdDouble(idDouble);
		question.setKnowId(zsdid);
		question.setQtQuest(wt);
		question.setTeaId(uid);
		int id=this.ksyService.xztmwt(question);
		Analyze analyze=new Analyze();
		analyze.setQtId(id);
		analyze.setAnalyzeContent(jx);
		analyze.setStuId(uid);
		this.ksyService.xztmjx(analyze);
		return id;
	}
	
	@ResponseBody
	@RequestMapping(value="/xztmxx",method=RequestMethod.POST)
	public int xztmxx(@RequestBody QuesOption[] quesOption) {
		//新增题目选项
		for(QuesOption l:quesOption) {
			this.ksyService.xztmxx(l);
		}
		return 1;
	}
	
	@ResponseBody
	@RequestMapping(value="/cxtk/{pageIndex}",method=RequestMethod.GET)
	public PageInfo<Questions> cxtk(@PathVariable int pageIndex){
		//分页查询所有题目
		return this.ksyService.cxtk(pageIndex);
	}
	
	
	@ResponseBody
	@RequestMapping(value="/sctm/{qtid}",method=RequestMethod.PUT)
	public int sctm(@PathVariable int qtid) {
		//删除单个题目
		return this.ksyService.sctm(qtid);
	}

	@ResponseBody
	@RequestMapping(value="/cxdgst/{qtid}",method=RequestMethod.GET)
	public Question cxdgst(@PathVariable int qtid){
		//根据id查询单个题目
		return this.ksyService.cxdgst(qtid);
	}
	
	@ResponseBody
	@RequestMapping(value="/cxxx/{qtid}",method=RequestMethod.GET)
	public List<QuesOption> cxxx(@PathVariable int qtid){
		//根据id查询题目选项
		return this.ksyService.cxxx(qtid);
	}
	
	@ResponseBody
	@RequestMapping(value="/cxjx/{qtid}/{uid}",method=RequestMethod.GET)
	public Analyze cxjx(@PathVariable int qtid,@PathVariable int uid){
		//根据id查询题目解析
		return this.ksyService.cxjx(qtid,uid);
	}
	
	@ResponseBody
	@RequestMapping(value="/xgtm",method=RequestMethod.PUT)
	public int xgtm(String wt,String jx,int idDouble,int zsdid,int jxid,int wtid) {
		//修改题目
		Question question=new Question();
		question.setIdDouble(idDouble);
		question.setKnowId(zsdid);
		question.setQtQuest(wt);
		question.setQtId(wtid);
		this.ksyService.xgtm(question);
		//修改解析
		Analyze analyze=new Analyze();
		analyze.setAnalyzeId(jxid);;
		analyze.setAnalyzeContent(jx);
		this.ksyService.xgjx(analyze);
		
		return 1;
	}
	
	@ResponseBody
	@RequestMapping(value="/xgxx/{xb}/{nr}/{isRight}/{opId}",method=RequestMethod.PUT)
	public int xgxx(@PathVariable String xb,@PathVariable String nr,@PathVariable int isRight,@PathVariable int opId) {
		//修改题目选项
		//for(QuesOption quesOption:l) {
			//int xxid=quesOption.getOpId();
			//int i=this.ksyService.cxdgxx(xxid);
			QuesOption quesOption=new QuesOption();
			quesOption.setIsRight(isRight);
			quesOption.setOpId(opId);
			quesOption.setOpORder(xb);
			quesOption.setRightOption(nr);
				this.ksyService.xgxx(xb,nr,isRight,opId);
			
		//}
		return 1;
	}
	

	@ResponseBody
	@RequestMapping(value="/scxx/{xxid}",method=RequestMethod.DELETE)
	public int scxx(@PathVariable int xxid) {
		//删除选项
		return this.ksyService.scxx(xxid);
	}
	
	@ResponseBody
	@RequestMapping(value="/cxksmb",method=RequestMethod.GET)
	public List<ExamPapers> cxksmb(){
		//查询考试模板
		return this.ksyService.cxksmb();
	}
	
	@ResponseBody
	@RequestMapping(value="/cxsyBook",method=RequestMethod.GET)
	public List<Book> cxsyBook(){
		//查询所有课程
		return this.ksyService.cxsyBook();
	}
	

	@ResponseBody
	@RequestMapping(value="/cxCourse/{bookId}",method=RequestMethod.GET)
	public List<Courses> cxCourse(@PathVariable int bookId){
		//查询章节
		return this.ksyService.cxCourse(bookId);
	}
	
	@ResponseBody
	@RequestMapping(value="/cxKnowledge/{courseId}",method=RequestMethod.GET)
	public List<Knowledge> cxKnowledge(@PathVariable int courseId){
		//查询知识点
		return this.ksyService.cxKnowledge(courseId);
	}
	
	@ResponseBody
	@RequestMapping(value="/cxzsd/{courseId}",method=RequestMethod.GET)
	public List<Knowledge> cxzsd(@PathVariable int courseId){
		//查询章节的知识点id
		return this.ytkService.cxzsd(courseId);
	}
	
	@ResponseBody
	@RequestMapping(value="/sjcxtm/{zsdid}/{sum}/{xid}",method=RequestMethod.GET)
	public List<Questions> sjcxtm(@PathVariable String zsdid,@PathVariable int sum,@PathVariable int xid){
		//随机查询10道题目
		return this.ytkService.sjcxtm(zsdid,sum,xid);
	}
	
	@ResponseBody
	@RequestMapping(value="/tjsc",method=RequestMethod.POST)
	public int tjsc(@RequestBody MyCollection Collection) {
		//添加收藏
		return this.ytkService.tjsc(Collection);
	}
	
	@ResponseBody
	@RequestMapping(value="/qxsc/{xid}/{tmid}",method=RequestMethod.DELETE)
	public int qxsc(@PathVariable int xid,@PathVariable int tmid) {
		//取消收藏
		return this.ytkService.qxsc(xid,tmid);
	}
	
	@ResponseBody
	@RequestMapping(value="/xzstjl",method=RequestMethod.POST)
	public int xzstjl(@RequestBody BrushHistory brushHistory) {
		//新增刷题纪录
		return this.ytkService.xzstjl(brushHistory);
	}
	
	@ResponseBody
	@RequestMapping(value="/xzstmx",method=RequestMethod.POST)
	public int xzstmx(@RequestBody BrushHistoryDetails[] brushHistoryDetails) {
		//新增刷题纪录明细
		for(BrushHistoryDetails stmx:brushHistoryDetails) {
			this.ytkService.xzstmx(stmx);
		}
		return 1;
	}
	
	@ResponseBody
	@RequestMapping(value="/cxzjjd/{stuId}/{courseId}/{percent}/{progressCount}",method=RequestMethod.GET)
	public int cxzjjd(@PathVariable int stuId,@PathVariable int courseId,@PathVariable int percent,@PathVariable int progressCount) {
		//修改章节进度
		return this.ytkService.cxzjjd(stuId, courseId, percent, progressCount);
	}
	
	@ResponseBody
	@RequestMapping(value="/cxzsdjd/{stuId}/{knowId}/{percent}/{progressCount}",method=RequestMethod.GET)
	public int cxzsdjd(@PathVariable int stuId,@PathVariable int knowId,@PathVariable int percent,@PathVariable int progressCount){
		//修改知识点进度
		return this.ytkService.cxzsdjd(stuId, knowId, percent, progressCount);
	}
	
	@ResponseBody
	@RequestMapping(value="/xzksmb",method=RequestMethod.POST)
	public int xzksmb(@RequestBody ExamPaper examPaper) {
		//新增试卷模板
		return this.ksyService.xzksmb(examPaper);
	}
	
	@ResponseBody
	@RequestMapping(value="/xzsj",method=RequestMethod.POST)
	public int xzsj(@RequestBody ExamPaperHistory sj) {
		//新增试卷
		return this.ksyService.xzsj(sj);
	}
	
	@ResponseBody
	@RequestMapping(value="/cxsjtm/{zsdid}/{sum}",method=RequestMethod.GET)
	public List<Questions> cxsjtm(@PathVariable String zsdid,@PathVariable int sum){
		//根据知识点查询试卷题目
		return this.ksyService.sjcxtm(zsdid, sum);
	}
	
	@ResponseBody
	@RequestMapping(value="/xzsjtm",method=RequestMethod.POST)
	public int xzsjtm(@RequestBody PaperTitle[] p) {
		//新增试卷题目
		for(PaperTitle paperTitle:p) {
			this.ksyService.xzsjtm(paperTitle);
		}
		return 1;
	}
	
	@ResponseBody
	@RequestMapping(value="/xzmbgx",method=RequestMethod.POST)
	public int xzmbgx(@RequestBody ExamPaperKnowledge[] examPaperKnowledge) {
		//新增考试试卷模板与知识点关系表
		for(ExamPaperKnowledge mbgx:examPaperKnowledge) {
			this.ksyService.xzmbgx(mbgx);
		}
		return 1;
	}
	
	@ResponseBody
	@RequestMapping(value="/cxtbj/{uid}",method=RequestMethod.GET)
	public List<Ctrelations> cxtbj(@PathVariable int uid) {
		//查询老师带的班级
		return this.ksyService.cxtbj(uid);
	}
	
	@ResponseBody
	@RequestMapping(value="/cxsysj/{pageIndex}/{pageSize}",method=RequestMethod.GET)
	public PageInfo<ExamPaperHistorys> cxsysj(@PathVariable int pageIndex,@PathVariable int pageSize){
		//查询所有试卷 
		return this.ksyService.cxsysj(pageIndex,pageSize);
	}
	
	@ResponseBody
	@RequestMapping(value="/cxygsj/{sjid}",method=RequestMethod.GET)
	public ExamPaperHistorys cxygsj(@PathVariable int sjid) {
		//查询单个试卷 
		return this.ksyService.cxygsj(sjid);
	}
	
	@ResponseBody
	@RequestMapping(value="/cxdgmb/{mbid}",method=RequestMethod.GET)
	public ExamPaper cxdgmb(@PathVariable int mbid) {
		//查询单个模板
		return this.ksyService.cxdgmb(mbid);
	}
	
	@ResponseBody
	@RequestMapping(value="/cxsjtm/{sjid}",method=RequestMethod.GET)
	public List<Questions> cxsjtm(@PathVariable int sjid){
		//查询试卷题目及答案解析
		return this.ksyService.cxsjtm(sjid);
	}
	
	@ResponseBody
	@RequestMapping(value="/cxsjtmzsd/{sjid}",method=RequestMethod.GET)
	public List<Sjtmzsd> cxsjtmzsd(@PathVariable int sjid){
		//查询试卷题目的知识点和每个知识点题目的数量
		return this.ksyService.cxsjtmzsd(sjid);
	}
	
	@ResponseBody
	@RequestMapping(value="/xzks",method=RequestMethod.POST)
	public int xzks(@RequestBody Examination examination) {
		//发布考试
		return this.ksyService.xzks(examination);
	}
	
	@ResponseBody
	@RequestMapping(value="/cxsyks/{pageIndex}",method=RequestMethod.GET)
	public PageInfo<Examinations> cxsyks(@PathVariable int pageIndex){
		//查询所有考试
		return this.ksyService.cxsyks(pageIndex);
	}
	
	@ResponseBody
	@RequestMapping(value="/cxwkks",method=RequestMethod.GET)
	public PageInfo<Examinations> cxwkks( String time,int pageSize){
		//查询即将进行的考试
		return this.ksyService.cxwkks(time,pageSize);
	}
	
	@ResponseBody
	@RequestMapping(value="/cxzzjxks",method=RequestMethod.GET)
	public PageInfo<Examinations> cxzzjxks( String time,int pageSize){
		//查询正在进行的考试
		return this.ksyService.cxzzjxks(time,pageSize);
	}
	
	@ResponseBody
	@RequestMapping(value="/ghsjzsdtm/{zsdid}/{sjid}/{sum}",method=RequestMethod.GET)
	public int ghsjzsdtm(@PathVariable int zsdid,@PathVariable int sjid,@PathVariable int sum) {
		//跟换试卷知识点中的题目
		return this.ksyService.ghsjzsdtm(zsdid, sjid, sum);
	}
	
	@ResponseBody
	@RequestMapping(value="/ghsjzsd/{jzsdid}/{xzsdid}/{sum}/{sjid}",method=RequestMethod.GET)
	public int ghsjzsd(@PathVariable int jzsdid,@PathVariable int xzsdid,@PathVariable int sum,@PathVariable int sjid) {
		//跟换试卷的知识点
		return this.ksyService.ghsjzsd(jzsdid, xzsdid, sum, sjid);
	}
	
	@ResponseBody
	@RequestMapping(value="/cxBooks",method=RequestMethod.GET)
	public List<Books> cxBooks(){
		//查询所有课程
		return this.ksyService.cxBooks();
	}
	
	@ResponseBody
	@RequestMapping(value="/cxsjmb/{mbid}",method=RequestMethod.GET)
	public List<ExamPaperKnowledge> cxsjmb(@PathVariable int mbid){
		//查询模板中的知识点
		return this.ksyService.cxsjmb(mbid);
	}
	
	@ResponseBody
	@RequestMapping(value="/xzksryxx/{xsid}/{sjid}/{kssj}/{jssj}",method=RequestMethod.GET)
	public int cxcjksxy(String xsid,int sjid,String kssj,String jssj){
		//新增考试人员信息
		return this.ksyService.cxcjksxy(xsid, sjid, kssj, jssj);
	}
	
	@ResponseBody
	@RequestMapping(value="/cxycks/{ksid}",method=RequestMethod.GET)
	public Examinations cxycks(@PathVariable int ksid) {
		//根据id查询考试信息
		return this.ksyService.cxycks(ksid);
	}
	
	@ResponseBody
	@RequestMapping(value="/xgksxx",method=RequestMethod.POST)
	public int xgksxx(@RequestBody Examinations ks) {
		//修改考试信息
		return this.ksyService.xgksxx(ks);
	}
}
	
