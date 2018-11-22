package com.bigdata.ant.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
/**
 * 
 * @ClassName:Monitor
 * @Description:TODO（班委类）
 * @Author 成琼
 * @Date:2018年11月22日
 *
 */
@Entity
@Table(name="monitor_user")
public class Monitor {
  private String email;
  private String password;
  private ClassInfo classInfo;
  @Id
  @GenericGenerator(name="assigned-generator" ,strategy="assigned")
  @GeneratedValue(generator="assigned-generator")
	public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}
@OneToOne(cascade=CascadeType.ALL)
@JoinColumn(name="class_id")
public ClassInfo getClassInfo() {
	return classInfo;
}

public void setClassInfo(ClassInfo classInfo) {
	this.classInfo = classInfo;
}

	public Monitor() {
		// TODO Auto-generated constructor stub
	}

}
