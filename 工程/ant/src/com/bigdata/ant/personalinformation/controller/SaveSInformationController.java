/**
 * @Title:SaveSInformation.java
 * @Package:com.bigdata.ant.personalinformation.controller
 * @Description:点击提交后，更新个人信息
 * @Author:吕凝慧
 * @Date:2018年12月17日
 */
package com.bigdata.ant.personalinformation.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bigdata.ant.entity.Student;
import com.bigdata.ant.personalinformation.service.SaveSInformationServiceImpl;

/**
 * @ClassName:SaveSInformation
 * @Description:更新个人信息
 * @Author 吕凝慧
 * @Date:2018年12月17日
 *
 */
@Controller
public class SaveSInformationController {
	@Resource
	private SaveSInformationServiceImpl savesinformationserviceimpl;
	@RequestMapping(value="/saveSinformation",method=RequestMethod.POST)
	//@RequestMapping("/saveSinformation")
	public String findStu(Student stu) {
		System.out.println("hello");
//		Student student=this.savesinformationserviceimpl.findStu(id);
//		savesinformationserviceimpl.updateSInf(stu);
	    System.out.println(stu.getName());
		return "student_PersonalInformation";
	}
	
	
}
