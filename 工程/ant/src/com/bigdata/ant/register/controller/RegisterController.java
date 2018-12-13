package com.bigdata.ant.register.controller;

import java.io.IOException;

import javax.annotation.Resource;
import javax.mail.Session;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bigdata.ant.entity.Student;
import com.bigdata.ant.register.service.RegisterServiceImpl;
import com.bigdata.ant.utils.IncreaseTimeUtil;

@Controller
public class RegisterController {
	
	@Resource
	private RegisterServiceImpl registerServiceImpl;	
	
	/**
	 * 
	* @Title: toRegister  
	* @Description: TODO(这里用一句话描述这个方法的作用) 注册前获得数据（学院等信息）
	* @param: (参数)
	* @return:void(返回类型)
	*
	 */
	@RequestMapping("/toRegister")
	public String toRegister(HttpServletRequest request) {
		request.setAttribute("college", registerServiceImpl.findCollege());//把学院信息查出来
		request.setAttribute("grade", IncreaseTimeUtil.addDateYear(-4));
		return "three_register";
		
	}
	
	/**
	 * 
	* @Title: checkStudentId  
	* @Description: TODO(这里用一句话描述这个方法的作用)通过学生id查找是否存在该学生 
	* @param:@param request
	* @param:@param response
	* @param:@throws IOException (参数)
	* @return:void(返回类型)
	*
	 * @param request
	 * @param response
	 * @throws IOException
	 */
	@RequestMapping("/checkStudentId")
	public void checkStudentId(HttpServletRequest request,HttpServletResponse response) throws IOException{
		System.out.println("跳转到AJAXcontroller里");
		String student_id=request.getParameter("student_id");
		Boolean bool=registerServiceImpl.findStudentById(student_id);
		if(bool==true) {//数据库中已存在该学生
			System.out.println("已存在学生");
			response.getWriter().print("no");
		}else {//该学生可以注册
			System.out.println("可以注册");
			response.getWriter().print("ok");
		}
	}
	
	/**
	 * 
	* @Title: studentRegister  
	* @Description: TODO(这里用一句话描述这个方法的作用) 
	* @param:@param request
	* @param:@param response
	* @param:@param student
	* @param:@throws IOException (参数)
	* @return:void(返回类型)
	*
	 * @param request
	 * @param response
	 * @param student
	 * @throws IOException
	 */
	@RequestMapping("/studentRegister")
	public String studentRegister(HttpServletRequest request,Student student) throws IOException{
		String againpsd=request.getParameter("againpwd");
		String admitStudentRegister=registerServiceImpl.admitStudentRegister(student, againpsd);//获得信息（是否允许注册）
		System.out.println(student.getName());
		System.out.println(admitStudentRegister);
		if(admitStudentRegister.equals("0")) {//该用户注册成功，待激活
			registerServiceImpl.processRegister(student);
			request.setAttribute("msg", "注册成功，去邮箱激活吧");
			return "register_msg";
		}else {
			request.setAttribute("admitStudentRegister", admitStudentRegister);
			return "three_register";
		}
	}
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
	@RequestMapping("/activeStudent")
	public String activeStudent(HttpServletRequest request,HttpServletResponse response){
		String email=request.getParameter("email");
		String validateCode=request.getParameter("validateCode");
		String msg=registerServiceImpl.VolidateRegister(email, validateCode);
			request.setAttribute("msg", msg);
			return "register_msg";
		}
}
