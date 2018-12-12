package com.bigdata.ant.login.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bigdata.ant.login.service.OrganizationServiceImpl;
import com.bigdata.ant.login.service.StudentServiceImpl;

/**
 * 
 * @ClassName:OrganizationController
 * @Description:组织者登录验证
 * @Author xujunmei
 * @Date:2018年12月12日
 *
 */
@Controller
public class OrganizationController {

	@Resource
	private OrganizationServiceImpl organizationServiceImpl;

	/**
	 * 
	 * @Title: Login
	 * @Description: 账号密码验证
	 * @param:@param request
	 * @param:@return (参数)
	 * @return:String(返回类型)
	 *
	 * @param request
	 * @return
	 */
	@RequestMapping("/org_login")
	public String Login(HttpServletRequest request) {
		String email = request.getParameter("email");
		String pwd = request.getParameter("pwd");
		boolean b = this.organizationServiceImpl.FindIdAndPwd(email, pwd);
		if (b == false) {
			return "three_login";
		} else {
			request.setAttribute("email", email);
			return "organization_index";
		}
	}
}
