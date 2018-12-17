package com.bigdata.ant.activity.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bigdata.ant.activity.service.ShowActivityDetailServiceImpl;
import com.bigdata.ant.entity.Activity;
import com.bigdata.ant.entity.ActivityStage;
	/**
	 * 
	 * @ClassName:ShowActivityDetailController
	 * @Description:获得Activity和ActivityStage对象用于活动详情页显示信息
	 * @Author zhaojiayao
	 * @Date:2018年12月10日
	 *
	 */
@Controller
public class ShowActivityDetailController {
	@Resource
	private ShowActivityDetailServiceImpl showActivityDetailServiceImpl;

	/**
	 * 
	 * @Title: getActivityDetail  
	 * @Description: 获得Activity和ActivityStage对象用于活动详情页显示信息
	 * @param:@param request
	 * @param:@return (参数)
	 * @return:String(返回类型)
	 *
	 * @param request
	 * @return
	 */
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
