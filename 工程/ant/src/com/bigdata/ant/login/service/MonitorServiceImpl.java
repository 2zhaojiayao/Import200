package com.bigdata.ant.login.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bigdata.ant.entity.Monitor;
import com.bigdata.ant.login.dao.MonitorDaoImpl;

/**
 * 
 * @ClassName:MonitorServiceImpl
 * @Description:班委登录验证
 * @Author xujunmei
 * @Date:2018年12月12日
 *
 */
@Service
@Transactional(readOnly = false)
public class MonitorServiceImpl {

	@Resource
	private MonitorDaoImpl monitorDaoImpl;

	/**
	 * 
	 * @Title: FindIdAndPwd
	 * @Description: 验证账号密码是否正确
	 * @param:@param email
	 * @param:@param pwd
	 * @param:@return (参数)
	 * @return:boolean(返回类型)
	 *
	 * @param email
	 * @param pwd
	 * @return
	 */
	public boolean FindIdAndPwd(String email, String pwd) {
		if (this.monitorDaoImpl.SearchByIdAndPwd(email, pwd)) {
			return true;
		} else {
			return false;
		}
	}
}
