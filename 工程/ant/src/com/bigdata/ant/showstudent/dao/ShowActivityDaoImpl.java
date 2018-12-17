package com.bigdata.ant.showstudent.dao;
/*
 * @ClassName:ShowActivityDaoImpl
 * @Description:个人中心页，顶部展示数据的查询
 * @Author hwx
 * @Date:2018年12月15日
 */

import org.springframework.stereotype.Repository;
import com.bigdata.ant.entity.Activity;
import com.bigdata.ant.utils.BaseDao;

@Repository
public class ShowActivityDaoImpl extends BaseDao<Activity, Integer> {
	/**
	 * 
	 * @Title: ShowActivityCount
	 * @Description: 查询并计算当前活动总数
	 * @param:@param hql
	 * @param:@param params
	 * @return:Long
	 */

	public Long CountActivity() {
			Long sum = null;
			String hql = "from Activity a where a.id is not null";
			Object[] params =null;
			try {
				sum = this.findCount(hql,params);
				return sum;
			} catch(Exception e){
				e.printStackTrace();
				return null;
			}
		}
}
