package com.bigdata.ant.download.dao;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Repository;

import com.bigdata.ant.entity.ActivitySum;
import com.bigdata.ant.entity.Student;
import com.bigdata.ant.utils.BaseDao;

/**
 * 
 * @ClassName:DownloadDaoImpl
 * @Description:下载活动汇总表
 * @Author xujunmei
 * @Date:2018年12月18日
 *
 */
@Repository
public class DownloadDaoImpl extends BaseDao<ActivitySum, Integer> {

	/**
	 * 
	 * @Title: listAll
	 * @Description: 查询活动汇总表中的所有数据
	 * @param:@return (参数)
	 * @return:List<ActivitySum>(返回类型)
	 *
	 * @return
	 */
//	public boolean listAll() {
//		String hql = "from ActivitySum";
//		while (it.hasNext()) {
//			Student str = it.next();
//			System.out.println(str.getName());
//			List<ActivitySum> li = str.getSumActivities();
//			for (int i = 0; i < li.size(); i++) {
//				System.out.println(li.get(i).getActivityName());
//				System.out.println(li.get(i).getScore());
//				System.out.println(li.get(i).getType());
//				System.out.println(li.get(i).getYear());
//			}
//		}
//		return true;
//	}

	/**
	 * 
	 * @Title: getIdList
	 * @Description: 查询相同学号的记录集合
	 * @param:@param id
	 * @param:@return (参数)
	 * @return:List<ActivitySum>(返回类型)
	 *
	 * @param id
	 * @return
	 */
//	public List getNameById(String id) {
//		String hql = "select a.activityNamea.year,a.type from ActivitySum a where a.studentId = ?0";
//		List list = null;
//		try {
//			list = this.find0(hql, id);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return list;
//	}
//
//	public List getScoreById(String id) {
//		String hql = "select a.score from ActivitySum a where a.studentId = ?0";
//		List list = null;
//		try {
//			list = this.find0(hql, id);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return list;
//	}
//
//	public List getYearById(String id) {
//
//	}
//
//	public List getTypeById(String id) {
//
//	}
}
