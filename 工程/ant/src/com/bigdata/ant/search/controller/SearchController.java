/**
 * @Title:SearchController.java
 * @Package:com.bigdata.ant.search.controller
 * @Description:TODO(用一句话描述该文件做什么)
 * @Author:Admin
 * @Date:2018年12月10日
 */
package com.bigdata.ant.search.controller;

import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bigdata.ant.search.service.SearchServiceImpl;
import com.google.gson.Gson;

/**
 * @ClassName:SearchController
 * @Description:TODO（用一句话描述这个类的作用）
 * @Author 成琼
 * @Date:2018年12月10日
 *
 */
@Controller
public class SearchController {
	@Resource
	private SearchServiceImpl searchServiceImpl;

	public SearchController() {
		// TODO Auto-generated constructor stub
	}

	@RequestMapping("/beforeSearch")
	public String searchActivities(Model model, @RequestParam("pageNo") int pageNo) {
		// response.setCharacterEncoding("UTF-8");
		List<Object[]> activities = searchServiceImpl.listActivitiesByPopular(pageNo);
		Long count = (searchServiceImpl.findActivityCount());
		int pageNum;
		if (count % 8 == 0) {
			pageNum = (int) (count / 8);
		} else {
			pageNum = (int) (count / 8 + 1);
		}
		// Long pageNum=searchServiceImpl.findActivityCount();
		System.out.println("pageNo" + pageNo + "pageNum" + pageNum);
		model.addAttribute("activities", activities);
		model.addAttribute("pageNo", pageNo);
		model.addAttribute("pageNum", pageNum);
		System.out.println("pageNo" + pageNo + "pageNum" + pageNum + "后面");
		return "student_activityclassify";
	}

	@RequestMapping("/search")
	public void searchActivities(@RequestParam("types") Object[] types, HttpServletResponse response, Model model) {
		response.setCharacterEncoding("UTF-8");
		System.out.println("hi" + types[0]);
		List<Object[]> activities = searchServiceImpl.listActivities(types);
		Gson gson = new Gson();
		String re = gson.toJson(activities);
		System.out.println(re + "json");
		try {
			response.getWriter().print(re);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(activities.size() + "controller查到数据");
		model.addAttribute("activities", activities);
	}
	
	@RequestMapping("searchByName")
	public String listActivitiesByName(@RequestParam("name") String name,Model model) {
		List<Object[]> activities = searchServiceImpl.listActivitiesByName(name);
		model.addAttribute("activities",activities);
		return "student_activityclassify";
		
	}
}
