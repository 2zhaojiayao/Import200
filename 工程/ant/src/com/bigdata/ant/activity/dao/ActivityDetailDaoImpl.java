package com.bigdata.ant.activity.dao;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;

import com.bigdata.ant.entity.Activity;

public class ActivityDetailDaoImpl {
	@Resource
	private SessionFactory sessionFactory;
	public Activity findActivityInformation(int actId) {
		Activity activity = this.sessionFactory.getCurrentSession().get(Activity.class,actId);
		return activity;
	}
}
