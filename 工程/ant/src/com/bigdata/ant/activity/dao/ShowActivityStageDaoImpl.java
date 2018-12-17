package com.bigdata.ant.activity.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.bigdata.ant.entity.ActivityStage;
import com.bigdata.ant.utils.BaseDao;
/**
 * 
 * @ClassName:ShowActivityStageDaoImpl
 * @Description:获得ActivityStage对象以得到当前活动阶段
 * @Author zhaojiayao
 * @Date:2018年12月10日
 *
 */
@Repository
public class ShowActivityStageDaoImpl extends BaseDao<ActivityStage, Integer> {

	/**
	 * 
	* @Title: getActivityStage  
	* @Description: 获得ActivityStage对象以得到当前活动阶段
	* @param:@param actId
	* @param:@return (参数)
	* @return:ActivityStage(返回类型)
	*
	 * @param actId
	 * @return
	 */
	public ActivityStage getActivityStage(int actId) {
		String hql = "from ActivityStage a where a.id=?0";
		Object[] obj = { actId };
		List<ActivityStage> lastage=null;
		try {
			lastage = this.find(hql, obj);
			if (lastage != null) {
				System.out.println("lastage不为空");
				if (lastage.size() == 1) {
					ActivityStage astage = lastage.get(0);
					return astage;
				} else if (lastage.size() == 2) {
					for (ActivityStage as : lastage) {
						if (as.getStage().equals("初赛") == true) {
							continue;
						} else {
							return as;
						}
					}
					return null;
				} else {
					for (ActivityStage as : lastage) {
						if (as.getStage().equals("初赛") || as.getStage().equals("复赛")) {
							continue;
						} else {
							return as;
						}
					}
					return null;
				}
			} else {
				return null;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
