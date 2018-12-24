package com.bigdata.ant.update.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.security.auth.message.callback.PrivateKeyCallback.Request;
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

	@RequestMapping("/update")
	public String update(HttpServletRequest request) {
		List list = this.updateServiceImpl.listId();
		System.out.println(list.get(0));
		System.out.println(list.size());
		request.setAttribute("list", list);
		return "monitor_updateactivity";
	}

}
