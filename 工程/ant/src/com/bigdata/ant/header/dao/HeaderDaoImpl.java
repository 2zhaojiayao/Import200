/**
 * @Title:HeaderDao.java
 * @Package:com.bigdata.ant.header.dao
 * @Description:TODO(用一句话描述该文件做什么)
 * @Author:Admin
 * @Date:2018年12月5日
 */
package com.bigdata.ant.header.dao;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.annotation.Resource;
import javax.persistence.Id;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

//import org.apache.commons.dbutils.QueryRunner;
//import org.apache.commons.dbutils.handlers.BeanListHandler;
//import org.apache.commons.dbutils.handlers.ScalarHandler;
//
import com.bigdata.ant.entity.Activity;
import com.bigdata.ant.utils.BaseDao;
//import com.demo.fenye.domain.Page;
//import com.demo.fenye.domain.Student;
//import com.demo.fenye.utils.C3P0Utils;



/**
 * @ClassName:HeaderDao
 * @Description:TODO（用一句话描述这个类的作用）
 * @Author 成琼
 * @Date:2018年12月5日
 *
 */
@Repository

public class HeaderDaoImpl extends BaseDao<Activity,Integer> {

	public List<Object[]> findActivitiesNames(String keyword)  {
		List<Object[]> activities=null;
		String hql="select name from Activity where name like ?0";
		Object[] params= {"%"+keyword+"%"};
		
		try {
			 activities=findByProjection(hql, params);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return activities;
	}

}
