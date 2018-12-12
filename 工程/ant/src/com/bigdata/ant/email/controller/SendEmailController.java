package com.bigdata.ant.email.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bigdata.ant.email.service.SendEmailServiceImpl;

/**
 * 
 * @ClassName:SendEmailController
 * @Description: 忘记密码，邮箱验证
 * @Author xujunmei
 * @Date:2018年12月10日
 *
 */
@Controller
public class SendEmailController {
	@Resource
	private SendEmailServiceImpl sendEmailServiceImpl;

	@RequestMapping("/send")
	public String SendEmail(HttpServletRequest request) {
		String email = request.getParameter("email");
		boolean b = this.sendEmailServiceImpl.FindEmail(email);// 判断数据库中是否有此email
		request.setAttribute("email", email);
		if (b == true) {
			this.sendEmailServiceImpl.SendEmail(email);
			return "three_login";
		} else {
			return "three_sendemail";
		}
	}

}
