package com.bigdata.ant.login.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bigdata.ant.login.dao.StudentDaoImpl;

/**
 * 
 * @ClassName:StudentServiceImpl
 * @Description:学生登录验证
 * @Author xujunmei
 * @Date:2018年12月12日
 *
 */
@Service
@Transactional(readOnly = false)
public class StudentServiceImpl {

	@Resource
	private StudentDaoImpl studentDaoImpl;

	/**
	 * 
	 * @Title: FindIdAndPwd
	 * @Description: 验证账号密码是否正确
	 * @param:@param id
	 * @param:@param pwd
	 * @param:@return (参数)
	 * @return:boolean(返回类型)
	 *
	 * @param id
	 * @param pwd
	 * @return
	 */
	public boolean FindIdAndPwd(String id, String pwd) {
		if (this.studentDaoImpl.SearchByIdAndPwd(id, pwd)) {
			return true;
		} else {
			return false;
		}
	}
}
