package com.bigdata.ant.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
/**
 * 
 * @ClassName:Student
 * @Description:TODO（学生类）
 * @Author 成琼
 * @Date:2018年11月22日
 *
 */
@Entity
@Table(name="student_user")
public class Student {
	private String id;
	private String password;
	private String name;
	private String gender;
	private String email;
	private ClassInfo classInfo;
	private Set<Activity> scanedActivities=new HashSet<Activity>();
	private Set<ActivityStage> joinedActivities=new HashSet<ActivityStage>();
	public Student() {
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@ManyToOne
	@JoinColumn(name="class_id")
	public ClassInfo getClassInfo() {
		return classInfo;
	}
	public void setClassInfo(ClassInfo classInfo) {
		this.classInfo = classInfo;
	}
	@ManyToMany
	@JoinTable(name="student_scan",joinColumns=@JoinColumn(name="student_id"),inverseJoinColumns=@JoinColumn(name="activity_id"))
	public Set<Activity> getScanedActivities() {
		return scanedActivities;
	}
	public void setScanedActivities(Set<Activity> scanedActivities) {
		this.scanedActivities = scanedActivities;
	}
	@ManyToMany
	@JoinTable(name="student_join",joinColumns=@JoinColumn(name="student_id"),inverseJoinColumns=@JoinColumn(name="score_id"))
	public Set<ActivityStage> getJoinedActivities() {
		return joinedActivities;
	}
	public void setJoinedActivities(Set<ActivityStage> joinedActivities) {
		this.joinedActivities = joinedActivities;
	}
	
	
	
}
