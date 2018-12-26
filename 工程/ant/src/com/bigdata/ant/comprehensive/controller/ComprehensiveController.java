package com.bigdata.ant.comprehensive.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bigdata.ant.comprehensive.service.ComprehensiveServiceImpl;
import com.bigdata.ant.entity.Monitor;

@Controller
public class ComprehensiveController {
	@Resource
	private ComprehensiveServiceImpl comprehensiveServiceImpl;
	
	@RequestMapping(value = "/addressComprehensive")
	public String addressComprehensive(HttpServletRequest request) {
		HttpSession session=request.getSession();
		Monitor monitor=(Monitor) session.getAttribute("m");//登陆后获得该对象
		comprehensiveServiceImpl.insertScore(monitor);
		return "monitor_comprehensive";
	}
}
