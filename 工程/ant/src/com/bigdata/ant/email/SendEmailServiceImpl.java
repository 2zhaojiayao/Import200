package com.bigdata.ant.email;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bigdata.ant.entity.Student;
import com.bigdata.ant.utils.BaseDao;

/**
 * 
 * @ClassName:SendEmailServiceImpl
 * @Description:忘记密码，邮箱找回
 * @Author xujunmei
 * @Date:2018年12月10日
 *
 */
@Service
@Transactional(readOnly = false)
public class SendEmailServiceImpl {
	@Resource
	private SendEmailDaoImpl sendEmailDaoImpl;

	public boolean FindEmail(String hql, Object[] params) {
		if (this.sendEmailDaoImpl.SearchByEmail(hql, params)) {
			return true;
		} else {
			return false;
		}
	}

	public void SendEmail(String email) {
		this.sendEmailDaoImpl.SendEmail(email);
		return ;
	}
}
