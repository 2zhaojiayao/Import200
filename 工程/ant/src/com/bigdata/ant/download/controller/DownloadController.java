package com.bigdata.ant.download.controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bigdata.ant.download.service.DownloadServiceImpl;
import com.bigdata.ant.entity.ActivitySum;
import com.bigdata.ant.entity.Monitor;
import com.bigdata.ant.entity.Student;
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
	public void download(HttpServletResponse response, HttpServletRequest request, HttpSession session)
			throws IOException {
		String FILEPATH = "活动汇总表.xls";
		deleteFile(FILEPATH);
		Monitor m = (Monitor) session.getAttribute("m");
		Set<Student> set = m.getClassInfo().getStudents();
		int n = set.size();
		Iterator<Student> it = set.iterator();
		List<String> ll = new ArrayList<>();
		ll.add("学号");
		for (int j = 1; j < 16; j++) {
			ll.add("活动名称" + j);
			ll.add("分数" + j);
			ll.add("级别" + j);
			ll.add("年份" + j);
		}
		List<Map<String, Object>> list = new ArrayList<>();
		String mapid = null;
		while (it.hasNext()) {
			Student str = it.next();
			System.out.println(str.getId());
			List<ActivitySum> li = str.getSumActivities();
			int size = li.size() + 1;
			Map<String, Object> map = new HashMap<>();
			for (int i = 1; i < size; i++) {
				int r = i - 1;
				String s1 = "活动名称" + i;
				String s2 = "分数" + i;
				String s3 = "级别" + i;
				String s4 = "年份" + i;
				if (li.get(r).getStudent().getId() != mapid) {
					map.put("学号", li.get(r).getStudent().getId());
					map.put(s1, li.get(r).getActivityName());
					map.put(s2, li.get(r).getScore());
					map.put(s3, li.get(r).getType());
					map.put(s4, li.get(r).getYear());
					mapid = li.get(r).getStudent().getId();
				} else {
					map.put(s1, li.get(r).getActivityName());
					map.put(s2, li.get(r).getScore());
					map.put(s3, li.get(r).getType());
					map.put(s4, li.get(r).getYear());
					break;
				}

				list.add(map);
			}
		}
//		while (it.hasNext()) {
//			Student str = it.next();
//			System.out.println(str.getId());
//			List<ActivitySum> li = str.getSumActivities();
//			for (int i = 0; i < li.size(); i++) {
//				System.out.println(li.get(i).getActivityName());
//				System.out.println(li.get(i).getScore());
//				System.out.println(li.get(i).getType());
//				System.out.println(li.get(i).getYear());
//			}
//		}

//		while (it.hasNext()) {
//			Student str = it.next();
//			System.out.println(str.getId());
//			List<ActivitySum> alist = str.getSumActivities();
//			List<Map<String, Object>> list = new ArrayList<>();
//			for (ActivitySum a : alist) {
//				Map<String, Object> map = new HashMap<>();
//				map.put("序号", a.getId());
//				map.put("学号", a.getStudent().getId());
//				List<ActivitySum> l = this.downloadServiceImpl.getIdList(a.getStudentId());
//				for (ActivitySum as : l) {
//					map.put("活动名称", as.getActivityName());
//					map.put("分数", as.getScore());
//					map.put("活动名称", as.getActivityName());
//					map.put("分数", as.getScore());
//				}
//				list.add(map);
//			}
//		}

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
