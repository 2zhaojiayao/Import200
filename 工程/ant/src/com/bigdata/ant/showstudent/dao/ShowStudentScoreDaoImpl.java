package com.bigdata.ant.showstudent.dao;

import org.springframework.stereotype.Repository;
import com.bigdata.ant.entity.Comprehensive;
import com.bigdata.ant.utils.BaseDao;

@Repository
public class ShowStudentScoreDaoImpl extends BaseDao<Comprehensive, String> {
	/**
	 * 
	 * @Title: findStudentscoreCount
	 * @Description: 通过id查找已加综测分
	 * @param:@param hql
	 * @param:@param params
	 * @return:C
	 *
	 * @param hql
	 * @param params
	 * @return Comprehensive
	 */
	public Comprehensive getStudentScore(String id) {
		String hql = "from Comprehensive c where c.id = ?0";
		Object[] params = {id };
		try {
			Comprehensive studentScore = this.findOne(hql, params);
			return studentScore;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}

	}
}
