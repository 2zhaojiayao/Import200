package com.bigdata.ant.update.dao;

import org.springframework.stereotype.Repository;

import com.bigdata.ant.entity.ActivitySum;
import com.bigdata.ant.entity.Student;
import com.bigdata.ant.utils.BaseDao;

/**
 * 
 * @ClassName:UpdateDaoImpl
 * @Description:修改参与表
 * @Author xujunmei
 * @Date:2018年12月24日
 *
 */
@Repository
public class UpdateDaoImpl extends BaseDao<ActivitySum, Integer> {

	public void setAS(Student s, String name, Float score) {
		ActivitySum a = new ActivitySum();
		a.setStudent(s);
		a.setActivityName(name);
		a.setScore(score);
		try {
			this.save(a);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
