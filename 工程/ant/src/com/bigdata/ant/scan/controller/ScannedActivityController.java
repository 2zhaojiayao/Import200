package com.bigdata.ant.scan.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bigdata.ant.entity.Activity;
import com.bigdata.ant.scan.service.ScannedActivityServiceImpl;
@Controller
public class ScannedActivityController {
	@Resource
	private ScannedActivityServiceImpl scannedActivityServiceImpl;
	@RequestMapping(value="/getScannedActivity",method=RequestMethod.GET)
	public String findScannedActivityList(HttpServletRequest request){
		String stuId = "2016011079";
		List<Activity> actList = this.scannedActivityServiceImpl.findScannedActivityList(stuId);
		if(actList.equals(null)==false) {
			request.setAttribute("scannedActList",actList);
		}else {
			request.setAttribute("scannedActList", null);
		}
		return "student_personalcenter";
		
	}
	
}
