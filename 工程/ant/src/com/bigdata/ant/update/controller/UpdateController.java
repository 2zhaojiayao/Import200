package com.bigdata.ant.update.controller;

import java.util.List;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.bigdata.ant.entity.ActivitySum;
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

	@RequestMapping("/upload1")
	public void update(HttpServletRequest request) { // 得到表格中所有的数据
//		String filePath = null;
//		JFileChooser fileChooser = new JFileChooser("C:\\");
//		fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
//		int returnVal = fileChooser.showOpenDialog(fileChooser);
//		if (returnVal == JFileChooser.APPROVE_OPTION) {
//			filePath = fileChooser.getSelectedFile().getAbsolutePath();
//		}

//		if (!StuService.isExist(id)) {
//不存在就添加
//		String sql = "insert into stu (name,sex,num) values(?,?,?)";
//		String[] str = new String[] { a.getName(), a.getSex(), a.getNum() + "" };
//		db.AddU(sql, str);
//		} else {
//存在就更新
//			String sql = "update stu set name=?,sex=?,num=? where id=?";
//			String[] str = new String[] { stuEntity.getName(), stuEntity.getSex(), stuEntity.getNum() + "",
//					id + "" };
//			db.AddU(sql, str);
//		}

		MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
		MultipartFile file = multipartRequest.getFile("upfile");

		String name = null;
		// 判断文件是否为空
		if (file != null) {
			// 获取文件名
			name = file.getOriginalFilename();
			System.out.println(name);
		}

		List<ActivitySum> listExcel = this.updateServiceImpl.getAllByExcel(name);
		for (ActivitySum a : listExcel) {
			this.updateServiceImpl.setAS(a.getStudent(), a.getActivityName(), a.getScore());
		}
	}

}
