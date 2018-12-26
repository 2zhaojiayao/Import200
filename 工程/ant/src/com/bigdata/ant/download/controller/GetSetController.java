package com.bigdata.ant.download.controller;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bigdata.ant.download.service.DownloadServiceImpl;
import com.bigdata.ant.entity.Monitor;
import com.bigdata.ant.entity.Student;

/**
 * 
 * @ClassName:GetSetController
 * @Description:得到student的set集合
 * @Author xujunmei
 * @Date:2018年12月26日
 *
 */
@Controller
public class GetSetController {
	@RequestMapping("/getset")
	public void getSet(HttpServletRequest request, HttpServletResponse response, HttpSession session)
			throws IOException {
		Monitor m = (Monitor) session.getAttribute("m");
		System.out.println(m.getEmail());
		Set<Student> set = m.getClassInfo().getStudents();
		request.setAttribute("set", set);
		try {
			request.getRequestDispatcher("download").forward(request, response);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
