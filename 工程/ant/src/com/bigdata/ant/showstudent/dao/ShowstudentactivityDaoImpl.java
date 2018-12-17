/*
 * @ClassName:ShowstudentactivityDao
 * @Description:个人中心页，顶部展示数据的查询
 * @Author hwx
 * @Date:2018年12月15日
 */
package com.bigdata.ant.showstudent.dao;

import org.springframework.stereotype.Repository;
import com.bigdata.ant.entity.ActivityJoin;
import com.bigdata.ant.utils.BaseDao;

@Repository
public class ShowstudentactivityDaoImpl extends BaseDao<ActivityJoin, Integer> {
	/**
	 * 
	 * @Title: ShowActivityCount
	 * @Description: 根据id查询当前id已报名活动总数
	 * @param:@param hql
	 * @param:@param params
	 * @return:Long
	 */

	public Long CountStudentactivity(String id) {
		Long joinmun = null;
		String hql = "from ActivityJoin j where j.id = ?0";
		Object[] params = null;
		try {
			joinmun = this.findCount(hql, params);
			return joinmun;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
