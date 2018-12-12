package com.bigdata.ant.login.dao;

import org.springframework.stereotype.Repository;

import com.bigdata.ant.entity.Student;
import com.bigdata.ant.utils.BaseDao;

/**
 * 
 * @ClassName:StudentDaoImpl
 * @Description:学生登录验证
 * @Author xujunmei
 * @Date:2018年12月12日
 *
 */
@Repository
public class StudentDaoImpl extends BaseDao<Student, Integer> {

	/**
	 * 
	 * @Title: SearchByIdAndPwd
	 * @Description: 验证账户与密码是否正确
	 * @param:@param id
	 * @param:@param pwd
	 * @param:@return (参数)
	 * @return:boolean(返回类型)
	 *
	 * @param id
	 * @param pwd
	 * @return
	 */
	public boolean SearchByIdAndPwd(String id, String pwd) {
		Student s = null;
		String hql = "from Student s where s.id = ?0 and s.password = ?1";
		try {
			s = this.findOne1(hql, id, pwd);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (s != null) {
			return true;
		} else {
			return false;
		}
	}
}
