package com.wisdomschool.student.pojo;

import java.io.Serializable;
import java.util.Date;

public class Leaveprocess implements Serializable{
		
	private static final long serialVersionUID = 7417038063675317524L;
	
		private int leaveId;	//'请假id',
		private int domeId;		//'模板id',
		private int stuId;		//'学员id',
		private Date leaTime;	//'申请时间',
		private String leaReson;	// '请假原因',
		private Date leaStarTime;	//'请假开始时间',
		private Date	leaEndTime;	//'请假结束时间',
		private int leaStates;		//处理状态 发起状态1、待审批2、已通过3、已拒绝4、结束5',
		private int isDorm;		//'是否同步到住寝 否1，是2',
		
		public int getLeaveId() {
			return leaveId;
		}
		public void setLeaveId(int leaveId) {
			this.leaveId = leaveId;
		}
		public int getDomeId() {
			return domeId;
		}
		public void setDomeId(int domeId) {
			this.domeId = domeId;
		}
		public int getStuId() {
			return stuId;
		}
		public void setStuId(int stuId) {
			this.stuId = stuId;
		}
		public Date getLeaTime() {
			return leaTime;
		}
		public void setLeaTime(Date leaTime) {
			this.leaTime = leaTime;
		}
		public String getLeaReson() {
			return leaReson;
		}
		public void setLeaReson(String leaReson) {
			this.leaReson = leaReson;
		}
		public Date getLeaStarTime() {
			return leaStarTime;
		}
		public void setLeaStarTime(Date leaStarTime) {
			this.leaStarTime = leaStarTime;
		}
		public Date getLeaEndTime() {
			return leaEndTime;
		}
		public void setLeaEndTime(Date leaEndTime) {
			this.leaEndTime = leaEndTime;
		}
		public int getLeaStates() {
			return leaStates;
		}
		public void setLeaStates(int leaStates) {
			this.leaStates = leaStates;
		}
		public int getIsDorm() {
			return isDorm;
		}
		public void setIsDorm(int isDorm) {
			this.isDorm = isDorm;
		}
}
