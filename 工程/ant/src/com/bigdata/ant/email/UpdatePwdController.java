package com.bigdata.ant.email;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
	private UpdatePwdServiceImpl updatePwdService;

	@RequestMapping("/updatepwd")
	public String UpdatePwd(HttpServletRequest request) {
		String email = request.getParameter("email");
		System.out.println(email);
		String pwd = request.getParameter("pwd");
		System.out.println(pwd);

		return "three_login";
	}

}
