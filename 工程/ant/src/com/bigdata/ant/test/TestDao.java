/**
 * @Title:TestDao.java
 * @Package:com.bigdata.ant.test
 * @Description:TODO(用一句话描述该文件做什么)
 * @Author:Admin
 * @Date:2018年11月22日
 */
package com.bigdata.ant.test;

import com.bigdata.ant.header.dao.HeaderDao;

/**
 * @ClassName:TestDao
 * @Description:TODO（用一句话描述这个类的作用）
 * @Author Admin
 * @Date:2018年11月22日
 *
 */
public class TestDao{

	/**
	 * 创建一个新的实例 TestDao.  
	 *
	 */
	public TestDao() {
		// TODO Auto-generated constructor stub
	}
public void main (String[] args) {
	HeaderDao header1=new HeaderDao();
	header1.fuzzySearch();
	
	
}
}
