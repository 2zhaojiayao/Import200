package com.bigdata.ant.email.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bigdata.ant.email.service.UpdatePwdServiceImpl;

/**
 * 
 * @ClassName:UpdatePwdController
 * @Description:更改密码
 * @Author xujunmei
 * @Date:2018年12月10日
 *
 */
@Controller
public class UpdatePwdController {

	@Resource
	private UpdatePwdServiceImpl updatePwdServiceImpl;

	@RequestMapping("/updatepwd")
	public String UpdatePwd(HttpServletRequest request) {
		String email = request.getParameter("email");
		System.out.println(email);
		String pwd = request.getParameter("pwd");
		System.out.println(pwd);
		String hql = "from Student s where s.email = ?0";
		this.updatePwdServiceImpl.ChangePwd(hql, email, pwd);
		return "updatepwd_success.jsp";
	}

}
