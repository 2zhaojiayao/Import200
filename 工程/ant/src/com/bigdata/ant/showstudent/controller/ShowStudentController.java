package com.bigdata.ant.showstudent.controller;
import java.util.List;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bigdata.ant.entity.Activity;
import com.bigdata.ant.entity.Comprehensive;
import com.bigdata.ant.entity.Student;
import com.bigdata.ant.scan.service.ScannedActivityServiceImpl;
import com.bigdata.ant.showstudent.service.ShowStudentServiceImpl;

@Controller
public class ShowStudentController {
	@Resource
	private ShowStudentServiceImpl showStudentServiceImpl;
	@Resource
	private ScannedActivityServiceImpl scannedActivityServiceImpl;

	@RequestMapping("/personalcenter")
	public String showStudent(HttpServletRequest request, Model model, HttpSession session) {
		Long activitynum = this.showStudentServiceImpl.countActivity();
		model.addAttribute("activityNum", activitynum);
		Student student = (Student) session.getAttribute("s");
		String id = student.getId();
		if (id != null) {
			Comprehensive nowScore = this.showStudentServiceImpl.FindScore(id);
			Long studentActivityNum = this.showStudentServiceImpl.CountStudentactivity(id);
			model.addAttribute("nowScore", nowScore);
			model.addAttribute("studentActivityNum", studentActivityNum);
		}
		List<Activity> actList = this.scannedActivityServiceImpl.findScannedActivityList(id);
		if (actList.equals(null) == false) {
			request.setAttribute("scannedActList", actList);
		} else {
			request.setAttribute("scannedActList", null);
		}
		return "student_personalcenter";

	}

}
