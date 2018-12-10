package com.bigdata.ant.email;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

	/**
	 * 
	 * @Title: FindEmail
	 * @Description:通过email找到用户，找到为true，找不到为false
	 * @param:@param hql
	 * @param:@param params
	 * @param:@return (参数)
	 * @return:boolean(返回类型)
	 *
	 * @param hql
	 * @param email
	 * @return
	 */
	public boolean FindEmail(String hql, String email) {
		if (this.sendEmailDaoImpl.SearchByEmail(hql, email)) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * 
	 * @Title: SendEmail
	 * @Description: 发送邮件
	 * @param:@param email (参数)
	 * @return:void(返回类型)
	 *
	 * @param email
	 */
	public void SendEmail(String email) {
		this.sendEmailDaoImpl.SendEmail(email);
		return;
	}
}
