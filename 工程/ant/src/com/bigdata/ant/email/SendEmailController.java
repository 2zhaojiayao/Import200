package com.bigdata.ant.email;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
	public String IsEmail(HttpServletRequest request) {
		String email = request.getParameter("email");
		String[] one = { email };
		String hql = "from Student s where s.email=?";
		boolean b = this.sendEmailServiceImpl.FindEmail(hql, one);// 判断数据库中是否有此email
//		this.sendEmailServiceImpl.SendEmail(email);
		System.out.println(email);
		System.out.println(b);
		return "three_sendemail";
	}

}
