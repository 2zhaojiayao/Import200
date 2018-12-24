package com.bigdata.ant.update.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bigdata.ant.update.service.UpdateServiceImpl;

/**
 * 
 * @ClassName:UpdateController
 * @Description:修改参并将结果存到汇总表
 * @Author xujunmei
 * @Date:2018年12月24日
 *
 */
@Controller
public class UpdateController {

	@Resource
	private UpdateServiceImpl updateServiceImpl;

	/**
	 * 
	 * @Title: update
	 * @Description: 修改活动汇总表
	 * @param:@param request
	 * @param:@return (参数)
	 * @return:String(返回类型)
	 *
	 * @param request
	 * @return
	 */
	@RequestMapping("/update")
	public String update(HttpServletRequest request) {
		Map map = this.updateServiceImpl.listId();
//		List<Object[]> list = null;
//		Iterator<String> it = set.iterator();
//		while (it.hasNext()) {
//			list = this.updateServiceImpl.listScoreById(it.next());
//		

//		System.out.println(map.get("2016011000").get(0).toString());
//		System.out.println(map.get(2016011000).get(0).toString());
		request.setAttribute("map", map);
		return "monitor_updateactivity";
	}

}
