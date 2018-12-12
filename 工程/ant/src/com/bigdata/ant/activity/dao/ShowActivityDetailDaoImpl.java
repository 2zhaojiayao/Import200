package com.bigdata.ant.activity.dao;

import org.springframework.stereotype.Repository;

import com.bigdata.ant.entity.Activity;
import com.bigdata.ant.utils.BaseDao;

@Repository
public class ShowActivityDetailDaoImpl extends BaseDao<Activity, Integer> {
	public Activity getActivity(int actId) {
		try {
			Activity activity = this.get(actId);
			System.out.println(activity.getName());
			return activity;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}
