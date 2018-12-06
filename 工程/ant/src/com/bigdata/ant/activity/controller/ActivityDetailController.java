/**
 * @Title:Test.java
 * @Package:com.bigdata.ant.test
 * @Description:TODO(用一句话描述该文件做什么)
 * @Author:Admin
 * @Date:2018年11月22日
 */
package com.bigdata.ant.activity.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bigdata.ant.activity.service.ActivityDetailServiceImpl;
import com.bigdata.ant.entity.Activity;

@Controller
public class ActivityDetailController {
	@Resource
	private ActivityDetailServiceImpl activityDetailServiceImpl;
	@RequestMapping(value="/activityDetail" ,method=RequestMethod.GET)
	public String findActivityDetail(HttpServletRequest request) {
		String id = request.getParameter("actId");
		if(id.equals(null)==false) {
			int actId = Integer.parseInt(id);
			Activity act = this.activityDetailServiceImpl.findActivityInformation(actId);
			request.setAttribute("activityForDetail", act);
			return "activity";
		}else {
			return "activities";
		}
		
	}

}
