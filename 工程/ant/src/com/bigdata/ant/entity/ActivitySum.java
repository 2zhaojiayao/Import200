/**
 * @Title:ActivitySum.java
 * @Package:com.bigdata.ant.entity
 * @Description:TODO(用一句话描述该文件做什么)
 * @Author:Admin
 * @Date:2018年12月18日
 */
package com.bigdata.ant.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @ClassName:ActivitySum
 * @Description:TODO（综测活动汇总表）
 * @Author 成琼
 * @Date:2018年12月18日
 *
 *
 */
@Entity
@Table(name = "activity_sum")
public class ActivitySum {
	private int id;
	private String studentId;
	private String activityName1;
	private Float score1;
	private String activityName2;
	private Float score2;
	private String activityName3;
	private Float score3;
	private String activityName4;
	private Float score4;
	private String activityName5;
	private Float score5;
	private String activityName6;
	private Float score6;
	private String activityName7;
	private Float score7;
	private String activityName8;
	private Float score8;
	private String activityName9;
	private Float score9;
	private String activityName10;
	private Float score10;
	private String activityName11;
	private Float score11;
	private String activityName12;
	private Float score12;
	private String activityName13;
	private Float score13;
	private String activityName14;
	private Float score14;
	private String activityName15;
	private Float score15;

	public ActivitySum() {
		// TODO Auto-generated constructor stub
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "student_id")
	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	@Column(name = "activity_name1")
	public String getActivityName1() {
		return activityName1;
	}

	public void setActivityName1(String activityName1) {
		this.activityName1 = activityName1;
	}

	public Float getScore1() {
		return score1;
	}

	public void setScore1(Float score1) {
		this.score1 = score1;
	}

	@Column(name = "activity_name2")
	public String getActivityName2() {
		return activityName2;
	}

	public void setActivityName2(String activityName2) {
		this.activityName2 = activityName2;
	}

	public Float getScore2() {
		return score2;
	}

	public void setScore2(Float score2) {
		this.score2 = score2;
	}

	@Column(name = "activity_name3")
	public String getActivityName3() {
		return activityName3;
	}

	public void setActivityName3(String activityName3) {
		this.activityName3 = activityName3;
	}

	public Float getScore3() {
		return score3;
	}

	public void setScore3(Float score3) {
		this.score3 = score3;
	}

	@Column(name = "activity_name4")
	public String getActivityName4() {
		return activityName4;
	}

	public void setActivityName4(String activityName4) {
		this.activityName4 = activityName4;
	}

	public Float getScore4() {
		return score4;
	}

	public void setScore4(Float score4) {
		this.score4 = score4;
	}

	@Column(name = "activity_name5")
	public String getActivityName5() {
		return activityName5;
	}

	public void setActivityName5(String activityName5) {
		this.activityName5 = activityName5;
	}

	public Float getScore5() {
		return score5;
	}

	public void setScore5(Float score5) {
		this.score5 = score5;
	}

	@Column(name = "activity_name6")
	public String getActivityName6() {
		return activityName6;
	}

	public void setActivityName6(String activityName6) {
		this.activityName6 = activityName6;
	}

	public Float getScore6() {
		return score6;
	}

	public void setScore6(Float score6) {
		this.score6 = score6;
	}

	@Column(name = "activity_name7")
	public String getActivityName7() {
		return activityName7;
	}

	public void setActivityName7(String activityName7) {
		this.activityName7 = activityName7;
	}

	public Float getScore7() {
		return score7;
	}

	public void setScore7(Float score7) {
		this.score7 = score7;
	}

	@Column(name = "activity_name8")
	public String getActivityName8() {
		return activityName8;
	}

	public void setActivityName8(String activityName8) {
		this.activityName8 = activityName8;
	}

	public Float getScore8() {
		return score8;
	}

	public void setScore8(Float score8) {
		this.score8 = score8;
	}

	@Column(name = "activity_name9")
	public String getActivityName9() {
		return activityName9;
	}

	public void setActivityName9(String activityName9) {
		this.activityName9 = activityName9;
	}

	public Float getScore9() {
		return score9;
	}

	public void setScore9(Float score9) {
		this.score9 = score9;
	}

	@Column(name = "activity_name10")
	public String getActivityName10() {
		return activityName10;
	}

	public void setActivityName10(String activityName10) {
		this.activityName10 = activityName10;
	}

	public Float getScore10() {
		return score10;
	}

	public void setScore10(Float score10) {
		this.score10 = score10;
	}

	@Column(name = "activity_name11")
	public String getActivityName11() {
		return activityName11;
	}

	public void setActivityName11(String activityName11) {
		this.activityName11 = activityName11;
	}

	public Float getScore11() {
		return score11;
	}

	public void setScore11(Float score11) {
		this.score11 = score11;
	}

	@Column(name = "activity_name12")
	public String getActivityName12() {
		return activityName12;
	}

	public void setActivityName12(String activityName12) {
		this.activityName12 = activityName12;
	}

	public Float getScore12() {
		return score12;
	}

	public void setScore12(Float score12) {
		this.score12 = score12;
	}

	@Column(name = "activity_name13")
	public String getActivityName13() {
		return activityName13;
	}

	public void setActivityName13(String activityName13) {
		this.activityName13 = activityName13;
	}

	public Float getScore13() {
		return score13;
	}

	public void setScore13(Float score13) {
		this.score13 = score13;
	}

	@Column(name = "activity_name14")
	public String getActivityName14() {
		return activityName14;
	}

	public void setActivityName14(String activityName14) {
		this.activityName14 = activityName14;
	}

	public Float getScore14() {
		return score14;
	}

	public void setScore14(Float score14) {
		this.score14 = score14;
	}

	@Column(name = "activity_name15")
	public String getActivityName15() {
		return activityName15;
	}

	public void setActivityName15(String activityName15) {
		this.activityName15 = activityName15;
	}

	public Float getScore15() {
		return score15;
	}

	public void setScore15(Float score15) {
		this.score15 = score15;
	}

}
