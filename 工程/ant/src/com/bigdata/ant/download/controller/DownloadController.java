package com.bigdata.ant.download.controller;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bigdata.ant.download.service.DownloadServiceImpl;
import com.bigdata.ant.entity.ActivitySum;
import com.bigdata.ant.entity.Monitor;
import com.bigdata.ant.entity.Student;

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
	public void download(HttpServletResponse response, HttpSession session) throws IOException {
		Monitor m = (Monitor) session.getAttribute("m");
		System.out.println(m.getEmail());
		Set<Student> set = m.getClassInfo().getStudents();
		Iterator<Student> it = set.iterator();
		while (it.hasNext()) {
			Student str = it.next();
			System.out.println(str.getId());
			List list = this.downloadServiceImpl.getIdList(str.getId());
			System.out.println(list.size());
			System.out.println(list.get(0).toString());
//			List<ActivitySum> li = str.getSumActivities();
//			for (int i = 0; i < li.size(); i++) {
//				System.out.println(li.get(i).getActivityName());
//				System.out.println(li.get(i).getScore());
//				System.out.println(li.get(i).getType());
//				System.out.println(li.get(i).getYear());
//			}
		}
	}
}
//		String FILEPATH = "活动汇总表.xls";
//		deleteFile(FILEPATH);
//		int num = 0;
//		int w = 0;
//		List<ActivitySum> alist = this.downloadServiceImpl.listAll(s);
//		List<Map<String, Object>> list = new ArrayList<>();
//		for (ActivitySum a : alist) {
//			Map<String, Object> map = new HashMap<>();
//			map.put("序号", a.getId());
//			map.put("学号", a.getStudentId());
//			List<ActivitySum> l = this.downloadServiceImpl.getIdList(a.getStudentId());
//			for (ActivitySum as : l) {
//				map.put("活动名称", as.getActivityName());
//				map.put("分数", as.getScore());
//				map.put("活动名称", as.getActivityName());
//				map.put("分数", as.getScore());
//			}
//			System.out.println(w);
//			if (w > num) {
//				num = w;
//			}
//			System.out.println(num);
//			list.add(map);
//		}
//		List<String> ll = new ArrayList<>();
//		ll.add("序号");
//		ll.add("学号");
//		for (int i = 0; i < 18; i++) {
//			ll.add("活动名称");
//			ll.add("级别");
//			ll.add("分数");
//
//		}
//		try {
//			MakeExcel.CreateExcelFile(list, new File(FILEPATH), ll, "活动汇总");
//		} catch (WriteException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		MakeExcel.send(FILEPATH, response);
//		deleteFile(FILEPATH);s

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
//	public boolean deleteFile(String sPath) {
//		boolean flag = false;
//		File file = new File(sPath);
//		if (file.isFile() && file.exists()) {
//			file.delete();
//			flag = true;
//		}
//		return flag;
//	}
