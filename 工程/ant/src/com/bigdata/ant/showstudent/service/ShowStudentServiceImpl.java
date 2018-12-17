package com.bigdata.ant.showstudent.service;

/*
 * @ClassName:ShowStudentServiceImpl
 * @Description:个人中心页，顶部展示数据的查询
 * @Author hwx
 * @Date:2018年12月16日
 */
import javax.annotation.Resource;
import org.springframework.transaction.annotation.Transactional;

import org.springframework.stereotype.Service;

import com.bigdata.ant.entity.Comprehensive;
import com.bigdata.ant.showstudent.dao.ShowActivityDaoImpl;
import com.bigdata.ant.showstudent.dao.ShowStudentscoreDaoImpl;
import com.bigdata.ant.showstudent.dao.ShowstudentactivityDaoImpl;

@Service
@Transactional(readOnly = false)
public class ShowStudentServiceImpl {

	@Resource
	private ShowActivityDaoImpl showActivityDaoImpl;
	@Resource
	private ShowStudentscoreDaoImpl showStudentscoreDaoImpl;
	@Resource
	private ShowstudentactivityDaoImpl showStudentactivityDaoImpl;

	public Long CountActivity() {
		Long countactivity = this.showActivityDaoImpl.CountActivity();
		return countactivity;
	}

	public Comprehensive FindScore(String id) {
		Comprehensive nowscore = this.showStudentscoreDaoImpl.getStudentscore(id);
		return nowscore;
	}

	public Long CountStudentactivity(String id) {
		Long stuactivitycount = this.showStudentactivityDaoImpl.CountStudentactivity(id);
		return stuactivitycount;
	}

}
