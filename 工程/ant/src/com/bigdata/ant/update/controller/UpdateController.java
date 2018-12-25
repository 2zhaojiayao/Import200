package com.bigdata.ant.update.controller;

import java.util.Iterator;
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
		Set set = this.updateServiceImpl.listId();
		Map map = null;
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			map = this.updateServiceImpl.listScoreById(it.next());
		}
		request.setAttribute("map", map);
		System.out.println(map.keySet());
		
		request.setAttribute("set", set);
		return "monitor_updateactivity";
	}

}
