package com.bigdata.ant.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
/**
 * 
 * @ClassName:Organization
 * @Description:TODO（组织类）
 * @Author 成琼
 * @Date:2018年11月22日
 *
 */
@Entity
@Table(name="organization_user")
public class Organization {
private int id;
private String email;
private String password;
private String name;
<<<<<<< HEAD
=======
private Integer status;// 状态，0-未激活；1-已激活 ;
private String validateCode;
private Date registerTime;
>>>>>>> dd8abd3f468ded7142e238d6738130d5d19890a0
private Set<Activity> activities=new HashSet<Activity>();

	public Organization() {
		// TODO Auto-generated constructor stub
	}
<<<<<<< HEAD
=======
	@Column(name="organization_id")
>>>>>>> dd8abd3f468ded7142e238d6738130d5d19890a0
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
<<<<<<< HEAD
=======
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	@Column(name="validate_code")
	public String getValidateCode() {
		return validateCode;
	}
	public void setValidateCode(String validateCode) {
		this.validateCode = validateCode;
	}
	@Column(name="register_time")
	public Date getRegisterTime() {
		return registerTime;
	}
	public void setRegisterTime(Date registerTime) {
		this.registerTime = registerTime;
	}
>>>>>>> dd8abd3f468ded7142e238d6738130d5d19890a0
	@OneToMany(mappedBy="organization",targetEntity=Activity.class,cascade=CascadeType.ALL)
	public Set<Activity> getActivities() {
		return activities;
	}
	public void setActivities(Set<Activity> activities) {
		this.activities = activities;
	}
	
	

}
