package com.bigdata.ant.register.controller;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bigdata.ant.entity.Monitor;
import com.bigdata.ant.register.service.MonitorServiceImpl;

@Controller
public class MonitorController {
	@Resource
	private MonitorServiceImpl monitorServiceImpl;
	
	@RequestMapping("/checkMonitorEmail")
	public void checkMonitorEmail(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String mon_email = request.getParameter("mon_email");
		Boolean bool = monitorServiceImpl.findMonitorByEmail(mon_email);
		if (bool == true) {// 数据库中已存在该班委
			System.out.println("已存在班委");
			response.getWriter().print("no");
		} else {// 该学生可以注册
			System.out.println("可以注册");
			response.getWriter().print("ok");
		}
	}
	
	
//	@RequestMapping("/monitorRegister")
//	public String monitorRegister(HttpServletRequest request, Monitor monitor) {
//		String againpsd = request.getParameter("againpwd");
//		String college=request.getParameter("college");
//		String profession=request.getParameter("profession");
//		String grade=request.getParameter("grade");
//		String classes=request.getParameter("classes");
//
//		String admitMonitorRegister = monitorServiceImpl.admitMonitorRegister(monitor, college,profession,grade,classes,againpsd);// 获得信息（是否允许注册）
////		if (admitMonitorRegister.equals("0")) {// 该用户注册成功，待激活
////			registerServiceImpl.processRegister(student);
////			request.setAttribute("msg", "注册成功，去邮箱激活吧");
////			return "register_msg";
////		} else {
////			request.setAttribute("admitStudentRegister", admitStudentRegister);
////			request.setAttribute("student", student);
////			request.setAttribute("againpsd", againpsd);
////			return "three_register";
////		}
//	}

	/**
	 * 
	 * @Title: activeStudent
	 * @Description: TODO(这里用一句话描述这个方法的作用) 激活该用户
	 * @param: (参数)
	 * @return:void(返回类型)
	 * @throws IOException
	 * @throws ServletException
	 *
	 */
//	@RequestMapping("/activeStudent")
//	public String activeStudent(HttpServletRequest request, HttpServletResponse response) {
//		String email = request.getParameter("email");
//		String validateCode = request.getParameter("validateCode");
//		String msg = registerServiceImpl.VolidateRegister(email, validateCode);
//		request.setAttribute("msg", msg);
//		return "register_msg";
//	}
}

