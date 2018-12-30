package com.bigdata.ant.update.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.swing.filechooser.FileSystemView;

import org.apache.commons.fileupload.disk.DiskFileItem;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

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
//		MultipartResolver resolver = new CommonsMultipartResolver(request.getSession().getServletContext());
//		MultipartHttpServletRequest multipartRequest = resolver.resolveMultipart(request);
//		MultipartFile f = multipartRequest.getFile("upfile");
//
//		// 把MultipartFile转化为File
//		CommonsMultipartFile cmf = (CommonsMultipartFile) f;
//		DiskFileItem dfi = (DiskFileItem) cmf.getFileItem();
//		File file = dfi.getStoreLocation();

//		
//		 MultipartFile file = xxx; 
//	        CommonsMultipartFile cf= (CommonsMultipartFile)file; 
//	        DiskFileItem fi = (DiskFileItem)cf.getFileItem(); 
//	        File f = fi.getStoreLocation();
		
		MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
		MultipartFile f = multipartRequest.getFile("upfile");
		File file = null;
		try {
			f.transferTo(file);
		} catch (IllegalStateException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String name = f.getOriginalFilename();
		// 进一步判断文件是否为空（即判断其大小是否为0或其名称是否为null）
		List<ActivitySum> listExcel = this.updateServiceImpl.getAllByExcel(file);
		for (ActivitySum a : listExcel) {
			this.updateServiceImpl.setAS(a.getStudent(), a.getActivityName(), a.getScore());
		}
	}

}
