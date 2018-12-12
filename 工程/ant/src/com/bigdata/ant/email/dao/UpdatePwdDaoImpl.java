package com.bigdata.ant.email.dao;

import org.springframework.stereotype.Repository;

import com.bigdata.ant.entity.Student;
import com.bigdata.ant.utils.BaseDao;

/**
 * 
 * @ClassName:UpdatePwdDaoImpl
 * @Description:更改密码
 * @Author xujunmei
 * @Date:2018年12月10日
 *
 */
@Repository
public class UpdatePwdDaoImpl extends BaseDao<Student, Integer> {

	/**
	 * 
	 * @Title: UpdatePwd
	 * @Description: 修改密码
	 * @param:@param hql
	 * @param:@param email
	 * @param:@param pwd (参数)
	 * @return:void(返回类型)
	 *
	 * @param hql
	 * @param email
	 * @param pwd
	 */
	public void UpdatePwd(String hql, String email, String pwd) {
		try {
			Student s = this.findOne1(hql, email);
			s.setPassword(pwd);
			this.save(s);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
