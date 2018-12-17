package com.bigdata.ant.scan.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bigdata.ant.entity.Activity;
import com.bigdata.ant.entity.Student;
import com.bigdata.ant.scan.service.ScannedActivityServiceImpl;
/**
 * 
 * @ClassName:ScannedActivityController
 * @Description:通过session中的id获得浏览过的活动
 * @Author zhaojiayao
 * @Date:2018年12月13日
 *
 */
@Controller
public class ScannedActivityController {
	@Resource
	private ScannedActivityServiceImpl scannedActivityServiceImpl;
	/**
	 * 
	* @Title: findScannedActivityList  
	* @Description: 通过session中的id获得浏览过的活动
	* @param:@param request
	* @param:@return (参数)
	* @return:String(返回类型)
	*
	 * @param request
	 * @return
	 */
	@RequestMapping(value="/getScannedActivity",method=RequestMethod.GET)
	public String findScannedActivityList(HttpServletRequest request,HttpSession session){
		Student s = (Student) session.getAttribute("s");
		String stuId = s.getId();
		List<Activity> actList = this.scannedActivityServiceImpl.findScannedActivityList(stuId);
		if(actList.equals(null)==false) {
			request.setAttribute("scannedActList",actList);
		}else {
			request.setAttribute("scannedActList", null);
		}
		return "student_personalcenter";
		
	}
	
}
