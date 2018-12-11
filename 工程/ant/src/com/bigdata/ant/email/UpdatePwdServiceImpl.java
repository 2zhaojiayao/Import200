package com.bigdata.ant.email;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 
 * @ClassName:UpdatePwdServiceImpl
 * @Description:修改密码
 * @Author xujunmei
 * @Date:2018年12月10日
 *
 */
@Service
@Transactional(readOnly = false)
public class UpdatePwdServiceImpl {

	@Resource
	private UpdatePwdDaoImpl updatePwdDaoImpl;

	public void ChangePwd(String hql, String email, String pwd) {
		this.updatePwdDaoImpl.UpdatePwd(hql, email, pwd);
		return;
	}
}
