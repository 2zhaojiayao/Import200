package com.bigdata.ant.update.dao;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Repository;

import com.bigdata.ant.entity.ActivityJoin;
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
public class UpdateDaoImpl extends BaseDao<ActivityJoin, Integer> {

	/**
	 * 
	 * @Title: listId
	 * @Description: 查出所有的学号
	 * @param:@return (参数)
	 * @return:Set(返回类型)
	 *
	 * @return
	 */
	public Set listId() {
		String hql = "select a from ActivityJoin a";
		List<ActivityJoin> l = null;
		try {
			l = this.find0(hql);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Set<String> set = new HashSet();
		for (int i = 0; i < l.size(); i++) {
			set.add(l.get(i).getStudent().getId());
		}
		return set;
	}

}
