package com.bigdata.ant.update.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
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
		List<Object[]> list = null;
//		Map<String, List<Object[]>> map = new HashMap<String, List<Object[]>>();
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
//		System.out.println(set.size());
//		Iterator<String> it = set.iterator();
//		while (it.hasNext()) {
//			System.out.println(it.next());
//			list = this.listScoreById(it.next());
//			map.put(it.next(), list);
//		}
		return set;
	}

	/**
	 * 
	 * @Title: listScoreById
	 * @Description: 按学号查出活动名称及分数
	 * @param:@param id
	 * @param:@return (参数)
	 * @return:List(返回类型)
	 *
	 * @param id
	 * @return
	 */
	public Map listScoreById(String id) {
		String hql = "from ActivityJoin a where a.student.id = ?0";
		List<ActivityJoin> l = null;
		try {
			l = this.find0(hql, id);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(id);
//		List<Object[]> list = new ArrayList<Object[]>();
		Map<String, Float> map = new HashMap<String, Float>();
		for (int i = 0; i < l.size(); i++) {
			map.put(l.get(i).getActivityStage().getActivity().getName(), l.get(i).getActivityStage().getScore());
//			list.add(Object[]{ l.get(i).getActivityStage().getActivity().getName(),
//					l.get(i).getActivityStage().getScore() });
//			System.out.println(l.get(i).getActivityStage().getActivity().getName());
//			System.out.println(l.get(i).getActivityStage().getScore());
		}
		return map;
	}

}
