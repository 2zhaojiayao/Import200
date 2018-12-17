package com.bigdata.ant.showstudent.dao;

import org.springframework.stereotype.Repository;
import com.bigdata.ant.entity.Comprehensive;
import com.bigdata.ant.utils.BaseDao;

@Repository
public class ShowStudentscoreDaoImpl extends BaseDao<Comprehensive, String> {
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
	public Comprehensive getStudentscore(String id) {
		Object[] params = null;
		String hql = "from Comprehensive ss where ss.id = ?0";
		Comprehensive studentscore = new Comprehensive();
		try {
			studentscore = this.findOne(hql, params);
			return studentscore;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}

	}
}
