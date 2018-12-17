package com.bigdata.ant.activity.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bigdata.ant.activity.service.ShowActivityDetailServiceImpl;
import com.bigdata.ant.entity.Activity;
import com.bigdata.ant.entity.ActivityStage;
@Controller
public class ShowActivityDetailController {
	@Resource
	private ShowActivityDetailServiceImpl showActivityDetailServiceImpl;

	@RequestMapping(value="/activitydetail",method=RequestMethod.GET)
	public String getActivityDetail(HttpServletRequest request) {
		String id = "1";
		if(id!=null) {
			int actId = Integer.parseInt(id);
			Activity activity = this.showActivityDetailServiceImpl.getActivityDetail(actId);
			if(activity.equals(null)==false) {
				request.setAttribute("activitydetail", activity);
				ActivityStage astage = this.showActivityDetailServiceImpl.getActivityStage(actId);
				if(astage!=null) {
					request.setAttribute("activitystage", astage);
				}else {
					request.setAttribute("activitystagemsg", "活动信息错误！");
				}
			}else {
				request.setAttribute("activitydetailmsg", "该活动已不存在！");
			}
		}
		return "student_activitydetail";
	}
}
