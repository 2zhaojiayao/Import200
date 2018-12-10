package com.bigdata.ant.email;

import java.util.Date;
import java.util.Map;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.annotation.Resource;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import org.springframework.stereotype.Repository;

import com.bigdata.ant.entity.Student;
import com.bigdata.ant.utils.BaseDao;

/**
 * 
 * @ClassName:SendEmailDaoImpl
 * @Description:忘记密码，邮箱找回
 * @Author xujunmei
 * @Date:2018年12月10日
 *
 */
@Repository
public class SendEmailDaoImpl extends BaseDao<Student, Integer> {

	/**
	 * 
	 * @Title: SearchByEmail
	 * @Description: 通过email找到用户
	 * @param:@param hql
	 * @param:@param params
	 * @param:@return (参数)
	 * @return:boolean(返回类型)
	 *
	 * @param hql
	 * @param params
	 * @return
	 */
	public boolean SearchByEmail(String hql, String[] email) {
		try {
			if (this.findOne(hql, email) != null) {
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
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
		Properties props = System.getProperties();
		props.put("mail.smtp.host", "smtp.163.com");
		props.put("mail.smtp.auth", "true");
		Session session = Session.getInstance(props, new Authenticator() {
			public PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication("15226567668@163.com", "123456xjm");
			}
		});
		MimeMessage message = new MimeMessage(session);

		try {
			message.setFrom(new InternetAddress("15226567668@163.com"));
			message.addRecipients(Message.RecipientType.TO, new InternetAddress().parse(email));
			message.setSubject("找回密码");
			MimeBodyPart mimeBodyPart = new MimeBodyPart();
			mimeBodyPart.setContent("<a href='three_resetpassword.jsp?email=" + email + "'}'>点此链接，重置密码</a>",
					"text/html;charset=GB2312");

			MimeMultipart mimeMultipart = new MimeMultipart();
			mimeMultipart.addBodyPart(mimeBodyPart);
			message.setContent(mimeMultipart);

			message.setHeader("忘记密码", "smtpsend");
			message.setSentDate(new Date());
			Transport.send(message);
		} catch (AddressException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return;
	}
}
