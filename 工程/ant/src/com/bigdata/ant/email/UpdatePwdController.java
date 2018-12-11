package com.bigdata.ant.email;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.swing.JOptionPane;

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
	private UpdatePwdServiceImpl updatePwdServiceImpl;

	@RequestMapping("/updatepwd")
	public String UpdatePwd(HttpServletRequest request) {
		String email = request.getParameter("email");
		System.out.println(email);
		String pwd = request.getParameter("pwd");
		System.out.println(pwd);
		String hql = "from Student s where s.email = ?0";
		if (email != null && pwd != null) {
			this.updatePwdServiceImpl.ChangePwd(hql, email, pwd);
			JOptionPane.showMessageDialog(null, "密码修改成功，请登录", "成功", JOptionPane.OK_OPTION);
			return "three_login";
		} else {
			JOptionPane.showMessageDialog(null, "请重新输入！", "错误", JOptionPane.ERROR_MESSAGE);
			return "three_resetpassword";
		}
	}

}
