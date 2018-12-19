package com.bigdata.ant.download.controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bigdata.ant.download.service.DownloadServiceImpl;
import com.bigdata.ant.entity.ActivitySum;
import com.bigdata.ant.utils.MakeExcel;

import jxl.write.WriteException;

/**
 * 
 * @ClassName:DownloadController
 * @Description:下载活动汇总表
 * @Author xujunmei
 * @Date:2018年12月18日
 *
 */

@Controller
public class DownloadController {

	@Resource
	private DownloadServiceImpl downloadServiceImpl;

	@RequestMapping("/download")
	public void download(HttpServletResponse response) throws IOException {
		String FILEPATH = "活动汇总表.xls";
		deleteFile(FILEPATH);
		// 首行表头信息
		List<String> ll = new ArrayList<>();
		ll.add("序号");
		ll.add("学号");
		ll.add("活动名称");
		ll.add("年份");
		ll.add("分数");
		ll.add("类型");
		// 获取所有用户信息
		List<ActivitySum> alist = this.downloadServiceImpl.listAll();
		// 将用户的相关信息遍历到 List<Map<String, Object>> 中
		List<Map<String, Object>> list = new ArrayList<>();
		for (ActivitySum a : alist) {
			Map<String, Object> map = new HashMap<>();
			map.put("序号", a.getId());
			map.put("学号", a.getStudentId());
			map.put("活动名称", a.getActivityName());
			map.put("年份", a.getYear());
			map.put("分数", a.getScore());
			map.put("类型", a.getType());
			list.add(map);
		}
		try {
			// 第一个参数：表格中的数据
			// 第二个参数：表格保存的路径
			// 第三个参数：表格第二行的列信息
			// 第四个参数：表格第一行的表头信息
			// 参照效果图看会清楚些
			MakeExcel.CreateExcelFile(list, new File(FILEPATH), ll, "活动汇总");
		} catch (WriteException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		// 调用浏览器下载接口
		MakeExcel.send(FILEPATH, response);
		deleteFile(FILEPATH);
	}

	/**
	 * 删除单个文件
	 * 
	 * @param sPath 被删除文件的文件名
	 * @return 单个文件删除成功返回true，否则返回false
	 */
	public boolean deleteFile(String sPath) {
		boolean flag = false;
		File file = new File(sPath);
		// 路径为文件且不为空则进行删除
		if (file.isFile() && file.exists()) {
			file.delete();
			flag = true;
		}
		return flag;
	}

}
