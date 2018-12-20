/**
 * @Title:PublishDaoImpl.java
 * @Package:com.bigdata.ant.publish.dao
 * @Description:TODO(用一句话描述该文件做什么)
 * @Author:Admin
 * @Date:2018年12月18日
 */
package com.bigdata.ant.publish.dao;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.bigdata.ant.entity.Activity;
import com.bigdata.ant.entity.ActivityStage;
import com.bigdata.ant.utils.BaseDao;

/**
 * @ClassName:PublishDaoImpl
 * @Description:TODO（用一句话描述这个类的作用）
 * @Author Admin
 * @Date:2018年12月18日
 *
 *
 */
@Repository
public class PublishDaoImpl extends BaseDao<Activity,Integer> {    

	public PublishDaoImpl() {
		// TODO Auto-generated constructor stub
	}
	/*public Boolean uploadImage(String url) {
		
		return true;
	}*/
	public List<Object[]> listHotActivities(){
		String hql="select ac.name,ac.description,ac.organization,ac.studentNumber from Activity ac ORDER BY ac.studentNumber desc";
		//String hql = "select id from Activity";
		Object[] params=null;
		List<Object[]> activities=null;
		try {
			activities = findByProjection(hql, params,5);
			// findByProjection(hql, params);
			 System.out.println("查询成功");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("查询失败");
			e.printStackTrace();
		}
		System.out.println("活动数目"+activities.size());
		return activities;
	}
 public Boolean saveActivity(Activity activity,String stage,Float score) {
	 /*Activity a=new Activity();*/
	 /*java.sql.Date date=new java.sql.Date(2018, 1, 1);
	 a.setApplyBegin(date);
	 Date date = new Date();
	 Timestamp timeStamep = new Timestamp(date.getTime());
	 try {
		save(a);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		return false;
	}*/
	 int count = 0;
	 int count1=0;
	 //因为date的问题，无法插入整个对象
	 //先向activity_information中插入信息
	String sql="insert into activity_information(name,description,organization_id,level,apply_begin,apply_end,hold_begin,hold_end,hold_place,style,participant,search_type,comprehensive_type,is_interview,image) values(?0,?1,?2,?3,?4,?5,?6,?7,?8,?9,?10,?11,?12,?13,?14)";
	 Object[] params= {activity.getName(),activity.getDescription(),1,activity.getLevel(),new Timestamp(activity.getApplyBegin().getTime()),new Timestamp(activity.getApplyEnd().getTime()),new Timestamp(activity.getHoldBegin().getTime()),new Timestamp(activity.getHoldEnd().getTime()),activity.getHoldPlace(),activity.getStyle(),activity.getParticipant(),activity.getSearchType(),activity.getComprehensiveType(),activity.getIsInterview(),activity.getImage()};
	try {
		count=excuteBySql(sql,params);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	//获取刚插入活动的id
	String hql="select id from Activity where name=?0";
	Object[] params1= {activity.getName()};
	List<Object[]> id= null;
	try {
		 id=findByProjection(hql,params1);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    //向活动阶段表插入数据
//	ActivityStage as=new ActivityStage();
////	as.setActivity(activity);
//	as.setScore(score);
//	as.setStage(stage);
//	try {
//		save(as);
//	} catch (Exception e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
	if(id!=null) {
		String sql1="insert into activity_score(activity_id,stage,score) values(?0,?1,?2)";
		Object[] params2= {id.get(0),stage,score};
		try {
			count1=excuteBySql(sql1,params2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}}else {
			count1=0;
		}
	if(count*count1!=0) {
	 return true;
	}else {
		return false;
	}
 }
}
