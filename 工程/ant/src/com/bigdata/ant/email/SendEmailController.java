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
@RequestMapping("/send")
public class SendEmailController {
	@Resource
	private SendEmailServiceImpl sendEmailServiceImpl;
	
	public String IsEmail(HttpServletRequest request) {
		return "index";
//		String email = request.getParameter("email");
//		Object[] one = {email};
//		String hql = "from Student s where s.email=?";
//		boolean b = this.sendEmailServiceImpl.FindEmail(hql, one);//判断数据库中是否有此email
//		if(b) {
//			this.sendEmailServiceImpl.SendEmail(email);
//		}else {
//			return "404";
//		}
//		return null;
	}

}
