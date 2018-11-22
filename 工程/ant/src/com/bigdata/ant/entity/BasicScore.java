package com.bigdata.ant.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;
/**
 * 
 * @ClassName:BasicScore
 * @Description:TODO（综测品德和学业基础分的类）
 * @Author 成琼
 * @Date:2018年11月22日
 *
 */
public class BasicScore {
private String id;
private String name;
private float moralScore;
private float studyScore;
	public BasicScore() {
		// TODO Auto-generated constructor stub
	}
	@Id
	@GenericGenerator(name="assigned-generator",strategy="assigned")
	@GeneratedValue(generator="assigned-generator")
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getMoralScore() {
		return moralScore;
	}
	public void setMoralScore(float moralScore) {
		this.moralScore = moralScore;
	}
	public float getStudyScore() {
		return studyScore;
	}
	public void setStudyScore(float studyScore) {
		this.studyScore = studyScore;
	}
	

}
