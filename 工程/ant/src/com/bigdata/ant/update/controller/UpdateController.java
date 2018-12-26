package com.bigdata.ant.update.controller;

import java.io.File;
import java.util.List;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.swing.JFileChooser;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
	public void update(HttpServletRequest request) { // 得到表格中所有的数据
//		String filePath = null;
//		JFileChooser fileChooser = new JFileChooser("C:\\");
//		fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
//		int returnVal = fileChooser.showOpenDialog(fileChooser);
//		if (returnVal == JFileChooser.APPROVE_OPTION) {
//			filePath = fileChooser.getSelectedFile().getAbsolutePath();
//		}
		List<ActivitySum> listExcel = this.updateServiceImpl.getAllByExcel();
		for (ActivitySum a : listExcel) {
			this.updateServiceImpl.setAS(a.getStudent(), a.getActivityName(), a.getScore());
		}
	}

}

//			if (!StuService.isExist(id)) {
// 不存在就添加
//			String sql = "insert into stu (name,sex,num) values(?,?,?)";
//			String[] str = new String[] { a.getName(), a.getSex(), a.getNum() + "" };
//			db.AddU(sql, str);
//			} else {
// 存在就更新
//				String sql = "update stu set name=?,sex=?,num=? where id=?";
//				String[] str = new String[] { stuEntity.getName(), stuEntity.getSex(), stuEntity.getNum() + "",
//						id + "" };
//				db.AddU(sql, str);
//			}
