package com.bigdata.ant.activity.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bigdata.ant.activity.dao.ShowActivityDetailDaoImpl;
import com.bigdata.ant.activity.dao.ShowActivityStageDaoImpl;
import com.bigdata.ant.entity.Activity;
import com.bigdata.ant.entity.ActivityStage;
/**
 * 
 * @ClassName:ShowActivityDetailServiceImpl
 * @Description:将Dao获得的对象传给Controller
 * @Author zhaojiayao
 * @Date:2018年12月10日
 *
 */
@Service
@Transactional(readOnly=true)
public class ShowActivityDetailServiceImpl {
	@Resource
	private ShowActivityDetailDaoImpl showActivityDetailDaoImpl;
	
	@Resource
	private ShowActivityStageDaoImpl showActivityStageDaoImpl;
	/**
	 * 
	* @Title: getActivityDetail  
	* @Description: 将Activity对象传给Controller
	* @param:@param actId
	* @param:@return (参数)
	* @return:Activity(返回类型)
	*
	 * @param actId
	 * @return
	 */
	public Activity getActivityDetail(int actId) {
		Activity activity = this.showActivityDetailDaoImpl.getActivity(actId);
		return activity;
	}
	/**
	 * 
	* @Title: getActivityStage  
	* @Description: 将ActivityStage对象传给Controller
	* @param:@param actId
	* @param:@return (参数)
	* @return:ActivityStage(返回类型)
	*
	 * @param actId
	 * @return
	 */
	public ActivityStage getActivityStage(int actId) {
		ActivityStage astage = this.showActivityStageDaoImpl.getActivityStage(actId);
		return astage;
	}
}
