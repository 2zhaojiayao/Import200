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
		int num = 0;
		int w = 0;
		List<ActivitySum> alist = this.downloadServiceImpl.listAll();
		List<Map<String, Object>> list = new ArrayList<>();
		for (ActivitySum a : alist) {
			Map<String, Object> map = new HashMap<>();
			map.put("序号", a.getId());
			map.put("学号", a.getStudentId());
			List<ActivitySum> l = this.downloadServiceImpl.getIdList(a.getStudentId());
			for (ActivitySum as : l) {
				map.put("活动名称", as.getActivityName());
				map.put("分数", as.getScore());
				map.put("活动名称", as.getActivityName());
				map.put("分数", as.getScore());
			}
			System.out.println(w);
			if (w > num) {
				num = w;
			}
			System.out.println(num);
			list.add(map);
		}
		List<String> ll = new ArrayList<>();
		ll.add("序号");
		ll.add("学号");
		for (int i = 0; i < 18; i++) {
			ll.add("活动名称");
			ll.add("级别");
			ll.add("分数");
			
		}
		try {
			MakeExcel.CreateExcelFile(list, new File(FILEPATH), ll, "活动汇总");
		} catch (WriteException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		MakeExcel.send(FILEPATH, response);
		deleteFile(FILEPATH);
	}

	/**
	 * 
	 * @Title: deleteFile
	 * @Description: 删除单个文件
	 * @param:@param sPath
	 * @param:@return (参数)
	 * @return:boolean(返回类型)
	 *
	 * @param sPath
	 * @return
	 */
	public boolean deleteFile(String sPath) {
		boolean flag = false;
		File file = new File(sPath);
		if (file.isFile() && file.exists()) {
			file.delete();
			flag = true;
		}
		return flag;
	}

}
