/**
 * @Title:deleteController.java
 * @Package:com.bigdata.ant.editactivity.Controller
 * @Description:TODO(用一句话描述该文件做什么)
 * @Author:吕凝慧
 * @Date:2018年12月27日
 */
package com.bigdata.ant.editactivity.Controller;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bigdata.ant.editactivity.Service.DeleteServiceImpl;
import com.bigdata.ant.editactivity.Service.DisplayServiceImpl;
import com.bigdata.ant.entity.Activity;

/**
 * @ClassName:deleteController
 * @Description:删除活动
 * @Author 吕凝慧
 * @Date:2018年12月27日
 *
 */
@Controller
public class DeleteController {
	@Resource
	private DeleteServiceImpl deleteServiceImpl;
	@RequestMapping(value="/delete")
	public String deleteAcitivity(HttpServletRequest request,HttpServletResponse response,HttpSession session) throws ServletException, IOException {
		String id=request.getParameter("act");
		//String类型转换成Integer
		Integer id2 = null;
		if(id!=null){
			id2 = Integer.valueOf(id);
		}
		//根据id找到活动
		Activity activity = this.deleteServiceImpl.findActivityById(id2);
		System.out.println("要delete的活动id是"+id);
		//删除这个活动
		this.deleteServiceImpl.deleteActivity(activity);
		System.out.println("delete成功");
		request.getRequestDispatcher("toDisplayOrganizationMine").forward(request, response);
		return null;
	} 
}
