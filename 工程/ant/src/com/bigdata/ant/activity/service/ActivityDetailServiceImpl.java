package com.bigdata.ant.activity.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bigdata.ant.activity.dao.ActivityDetailDaoImpl;
import com.bigdata.ant.entity.Activity;

@Service
@Transactional(readOnly=true)
public class ActivityDetailServiceImpl {
	@Resource
	private ActivityDetailDaoImpl activityDetailDaoImpl;
	public Activity findActivityInformation(int actId) {
		Activity activity = this.activityDetailDaoImpl.findActivityInformation(actId);
		return activity;
	}
}
