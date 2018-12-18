package com.bigdata.ant.showstudent.controller;

/*
 * @ClassName:ShowstudentController
 * @Description:个人中心页，顶部展示数据的查询
 * @Author hwx
 * @Date:2018年12月16日
 */
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bigdata.ant.entity.Comprehensive;
import com.bigdata.ant.scan.controller.ScannedActivityController;
import com.bigdata.ant.showstudent.service.ShowStudentServiceImpl;

@Controller
public class ShowstudentController {
	@Resource
	private ShowStudentServiceImpl showStudentServiceImpl;
	private ScannedActivityController scannedActivityController;

	@RequestMapping("/personalcenter")
	public String Showstudent(HttpServletRequest request, Model model, HttpSession session) {
		Long activitynum = this.showStudentServiceImpl.CountActivity();
		model.addAttribute("activitynum", activitynum);
		String id = request.getParameter("studentid");

		if (id != null) {
			Comprehensive nowscore = this.showStudentServiceImpl.FindScore(id);
			Long Studentactivitynum = this.showStudentServiceImpl.CountStudentactivity(id);
			model.addAttribute("nowscore", nowscore);
			model.addAttribute("Studentactivitynum", Studentactivitynum);
		}
		this.scannedActivityController.findScannedActivityList(request, session);
		return "student_personalcenter";

	}

}
