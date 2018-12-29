package com.bigdata.ant.update.service;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bigdata.ant.entity.ActivitySum;
import com.bigdata.ant.entity.Student;
import com.bigdata.ant.login.dao.StudentDaoImpl;
import com.bigdata.ant.update.dao.UpdateDaoImpl;

import jxl.Sheet;
import jxl.Workbook;

/**
 * 
 * @ClassName:UpdateServiceImpl
 * @Description:修改报名表
 * @Author xujunmei
 * @Date:2018年12月24日
 *
 */
@Service
@Transactional(readOnly = false)
public class UpdateServiceImpl {
	@Resource
	private StudentDaoImpl studentDaoImpl;
	@Resource
	private UpdateDaoImpl updateDaoImpl;

	/**
	 * 
	 * @Title: listId
	 * @Description: 查出id对应的学生
	 * @param:@return (参数)
	 * @return:Student(返回类型)
	 *
	 * @return
	 */
	public Student getStuById(String id) {
		return this.getStuById(id);
	}

	/**
	 * 
	 * @Title: getAllByExcel
	 * @Description: 获取excel
	 * @param:@param file
	 * @param:@return (参数)
	 * @return:List<ActivitySum>(返回类型)
	 *
	 * @param file
	 * @return
	 */
	public List<ActivitySum> getAllByExcel() {
		List<ActivitySum> list = new ArrayList<ActivitySum>();
		File file = new File("C:\\");
		try {
			Workbook rwb = Workbook.getWorkbook(file);
			Sheet rs = rwb.getSheet(0);// 或者rwb.getSheet(0)
			int clos = rs.getColumns();// 得到所有的列
			int rows = rs.getRows();// 得到所有的行
			System.out.println("clos:" + clos + " rows:" + rows);
			for (int i = 2; i < rows + 1; i++) {
				for (int j = 0; j < clos; j++) {
					// 第一个是列数，第二个是行数
					String id = rs.getCell(j++, i).getContents();// 默认最左边编号也算一列 所以这里得j++
					Student s = this.getStuById(id);
					String activity = rs.getCell(j++, i).getContents();
					String score = rs.getCell(j++, i).getContents();
					System.out.println(" student:" + s + " sex:" + activity + " num:" + score);
					ActivitySum a = null;
					a.setStudent(s);
					a.setActivityName(activity);
					a.setScore(Float.parseFloat(score));
					list.add(a);
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	public void setAS(Student s, String name, Float score) {
		this.updateDaoImpl.setAS(s, name, score);
	}
}
