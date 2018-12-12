package com.bigdata.ant.login.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bigdata.ant.login.service.StudentServiceImpl;

/**
 * 
 * @ClassName:StudentController
 * @Description:学生登录验证
 * @Author xujunmei
 * @Date:2018年12月12日
 *
 */
@Controller
public class StudentController {

	@Resource
	private StudentServiceImpl studentServiceImpl;

	/**
	 * 
	 * @Title: Login
	 * @Description: 账号密码s验证
	 * @param:@param request
	 * @param:@return (参数)
	 * @return:String(返回类型)
	 *
	 * @param request
	 * @return
	 */
	@RequestMapping("/stu_login")
	public String Login(HttpServletRequest request) {
		
		return "";
	}
}
