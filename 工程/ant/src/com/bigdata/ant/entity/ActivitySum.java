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
	private String activityName;
	private String year;
	private Float score;
	private String type;

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

	@Column(name = "activity_name")
	public String getActivityName() {
		return activityName;
	}

	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public Float getScore() {
		return score;
	}

	public void setScore(Float score) {
		this.score = score;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
