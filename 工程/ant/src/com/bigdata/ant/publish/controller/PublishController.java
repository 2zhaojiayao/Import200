/**
 * @Title:PublishController.java
 * @Package:com.bigdata.ant.publish
 * @Description:TODO(用一句话描述该文件做什么)
 * @Author:Admin
 * @Date:2018年12月18日
 */
package com.bigdata.ant.publish.controller;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.bigdata.ant.entity.Activity;
import com.bigdata.ant.entity.Organization;
import com.bigdata.ant.publish.service.PublishServiceImpl;

/**
 * @ClassName:PublishController
 * @Description:TODO（发布活动页面的功能实现）
 * @Author 成琼
 * @Date:2018年12月18日
 *
 *
 */
@Controller
public class PublishController {
	@Resource
	public PublishServiceImpl publishServiceImpl;
	private String imageUrl;

	public PublishController() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 * @Title: listHotActivities
	 * @Description: TODO(查询热门活动)
	 * @param:@param model (参数)
	 * @return:void(展示发布活动页面)
	 */
	@RequestMapping("/listHotActivities")
	public String listHotActivities(Model model) {
		List<Object[]> activities = publishServiceImpl.listHotActivities();
		model.addAttribute("hotActivities", activities);
		// System.out.println("已传递热门活动"+activities.size());

		return "organization_publishactivity";
	}

	/**
	 * 
	 * @Title: uploadImage
	 * @Description: TODO(上传活动图片)
	 * @param:@param sortPicImg 活动图片文件
	 * @param:@param request
	 * @param:@param response (参数)
	 * @return:void(返回类型)
	 */
	@RequestMapping("/imageUpload")
	public void uploadImage(@RequestParam("file") MultipartFile sortPicImg, HttpServletRequest request,
			HttpServletResponse response) {
		// System.out.println(title);
		String rootPath = request.getServletContext().getRealPath("images/");
		Date date = new Date();
		System.out.println(rootPath);
		try {
			FileCopyUtils.copy(sortPicImg.getBytes(),
					new File(rootPath, date.getTime() + sortPicImg.getOriginalFilename()));
			System.out.println("成功");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		imageUrl = "images/" + date.getTime() + sortPicImg.getOriginalFilename();

	}

	/**
	 * 
	 * @Title: saveActivity
	 * @Description: TODO(向数据库插入活动)
	 * @param:@param activity 活动
	 * @param:@param score 分数
	 * @param:@param stage 阶段
	 * @param:@return (参数)
	 * @return:String(发布成功到成功页面，失败回到本页重新发布)
	 */
	@RequestMapping(value = "/saveActivity", method = RequestMethod.POST)
	public String saveActivity(Activity activity, @RequestParam("score") String score,
			@RequestParam("stage") String stage,HttpServletRequest request) {
		HttpSession session =request.getSession();
		Organization organization=(Organization) session.getAttribute("o");
		activity.setImage(imageUrl);
		if (publishServiceImpl.saveActivity(activity, stage, score,organization.getId())) {
			System.out.println("保存活动成功");
			return "organization_successfulpublish";
		} else {
			System.out.println("保存活动未成功");
			return "organization_publishactivity";
		}
	}

}
