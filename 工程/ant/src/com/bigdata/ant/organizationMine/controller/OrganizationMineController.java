package com.bigdata.ant.organizationMine.controller;


import java.util.Date;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bigdata.ant.entity.Organization;
import com.bigdata.ant.organizationMine.service.OrganizationMineServiceImpl;
import com.bigdata.ant.utils.Page;

/**
 * 
 * @ClassName:OrganizationMineController
 * @Description:TODO（用一句话描述这个类的作用）
 * @Author wangmengzhen
 * @Date:2018年12月19日
 *
 */
@Controller
public class OrganizationMineController {

	@Resource
	private OrganizationMineServiceImpl organizationMineServiceImpl;
	
	/**
	 * 
	* @Title: toDisplayOrganizationMine  
	* @Description: TODO(这里用一句话描述这个方法的作用) 显示所有活动
	* @param:@param request
	* @param:@return (参数)
	* @return:String(返回类型)
	*
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/toDisplayOrganizationMine")
	public String toDisplayOrganizationMine(HttpServletRequest request) {
		HttpSession session=request.getSession();
		Organization organization=(Organization) session.getAttribute("o");
		String pageNum=(String) request.getParameter("pageNum");
		int num=0;
		if(pageNum==null||pageNum.equals("")) {
			num=1;
		}else {
			num=Integer.parseInt(pageNum);
		}
		Long countBeforeTime=organizationMineServiceImpl.countBeforeTime(organization);
		Long countInTime=organizationMineServiceImpl.countInTime(organization);
		Long countAfterTime=organizationMineServiceImpl.countAfterTime(organization);
		Page<Object[]> allActivity=organizationMineServiceImpl.findPageByProjection(num, organization);

		request.setAttribute("key", "0");
		request.setAttribute("currentTime", new Date());
		request.setAttribute("countBeforeTime", countBeforeTime);
		request.setAttribute("countInTime", countInTime);
		request.setAttribute("countAfterTime", countAfterTime);
		request.setAttribute("allActivity", allActivity);
		return "organization_mine";
	}
	
	/**
	 * 
	* @Title: displayBeforeTime  
	* @Description: TODO(这里用一句话描述这个方法的作用) 显示未开始的活动
	* @param:@param request
	* @param:@return (参数)
	* @return:String(返回类型)
	*
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "displayBeforeTime")
	public String displayBeforeTime(HttpServletRequest request) {
		HttpSession session=request.getSession();
		Organization organization=(Organization) session.getAttribute("o");
		String pageNum=(String) request.getParameter("pageNum");
		int num=0;
		if(pageNum==null||pageNum.equals("")) {
			num=1;
		}else {
			num=Integer.parseInt(pageNum);
		}
		
		Long countBeforeTime=organizationMineServiceImpl.countBeforeTime(organization);
		Long countInTime=organizationMineServiceImpl.countInTime(organization);
		Long countAfterTime=organizationMineServiceImpl.countAfterTime(organization);
		
		Page<Object[]> beforeActivity=organizationMineServiceImpl.findPageBeforeTime(num, organization);

		request.setAttribute("key", "1");
		request.setAttribute("countBeforeTime", countBeforeTime);
		request.setAttribute("countInTime", countInTime);
		request.setAttribute("countAfterTime", countAfterTime);
		request.setAttribute("beforeActivity", beforeActivity);
		return "organization_mine";
	}
	
	/**
	 * 
	* @Title: displayInTime  
	* @Description: TODO(这里用一句话描述这个方法的作用) 显示进行中的活动
	* @param:@param request
	* @param:@return (参数)
	* @return:String(返回类型)
	*
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "displayInTime")
	public String displayInTime(HttpServletRequest request) {
		HttpSession session=request.getSession();
		Organization organization=(Organization) session.getAttribute("o");
		String pageNum=(String) request.getParameter("pageNum");
		int num=0;
		if(pageNum==null||pageNum.equals("")) {
			num=1;
		}else {
			num=Integer.parseInt(pageNum);
		}
		
		Long countBeforeTime=organizationMineServiceImpl.countBeforeTime(organization);
		Long countInTime=organizationMineServiceImpl.countInTime(organization);
		Long countAfterTime=organizationMineServiceImpl.countAfterTime(organization);
		
		Page<Object[]> inActivity=organizationMineServiceImpl.findPageInTime(num, organization);

		request.setAttribute("key", "2");
		request.setAttribute("currentTime", new Date());
		request.setAttribute("countBeforeTime", countBeforeTime);
		request.setAttribute("countInTime", countInTime);
		request.setAttribute("countAfterTime", countAfterTime);
		request.setAttribute("inActivity", inActivity);
		return "organization_mine";
	}
	
	/**
	 * 
	* @Title: displayAfterTime  
	* @Description: TODO(这里用一句话描述这个方法的作用) 显示已结束的活动
	* @param:@param request
	* @param:@return (参数)
	* @return:String(返回类型)
	*
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "displayAfterTime")
	public String displayAfterTime(HttpServletRequest request) {
		HttpSession session=request.getSession();
		Organization organization=(Organization) session.getAttribute("o");
		String pageNum=(String) request.getParameter("pageNum");
		int num=0;
		if(pageNum==null||pageNum.equals("")) {
			num=1;
		}else {
			num=Integer.parseInt(pageNum);
		}
		
		Long countBeforeTime=organizationMineServiceImpl.countBeforeTime(organization);
		Long countInTime=organizationMineServiceImpl.countInTime(organization);
		Long countAfterTime=organizationMineServiceImpl.countAfterTime(organization);
		
		Page<Object[]> afterActivity=organizationMineServiceImpl.findPageAfterTime(num, organization);

		request.setAttribute("key", "3");
		request.setAttribute("countBeforeTime", countBeforeTime);
		request.setAttribute("countInTime", countInTime);
		request.setAttribute("countAfterTime", countAfterTime);
		request.setAttribute("afterActivity", afterActivity);
		return "organization_mine";
	}
	
}
