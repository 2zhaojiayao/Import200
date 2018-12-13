package com.bigdata.ant.register.service;

import java.util.Date;
import java.util.regex.Pattern;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bigdata.ant.entity.Monitor;
import com.bigdata.ant.entity.Student;
import com.bigdata.ant.login.dao.MonitorDaoImpl;
import com.bigdata.ant.utils.IncreaseTimeUtil;
import com.bigdata.ant.utils.MD5Util;
import com.bigdata.ant.utils.MailUtil;

@Service
@Transactional(readOnly = false)
public class MonitorServiceImpl {

	@Resource
	private MonitorDaoImpl monitorDaoImpl;

	/**
	 * 
	 * @Title: findStudentByEmail
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param:@param email
	 * @param:@return (参数)
	 * @return:Boolean(返回类型)
	 *
	 * @param email
	 * @return
	 */
	public Boolean findMonitorByEmail(String email) {
		try {
			Monitor monitor = monitorDaoImpl.get(email);
			if (monitor != null) {
				return true;// 该邮箱已经注册过班委
			} else {
				return false;// 不存在该班委
			}
		} catch (Exception e) {
			return false;
		}
	}

	/**
	 * 
	 * @Title: admitMonitorRegister
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param:@param monitor
	 * @param:@param college
	 * @param:@param profession
	 * @param:@param grade
	 * @param:@param classes
	 * @param:@param againpsd
	 * @param:@return (参数)
	 * @return:String(返回类型)
	 *
	 * @param monitor
	 * @param college
	 * @param profession
	 * @param grade
	 * @param classes
	 * @param againpsd
	 * @return
	 */
	public String admitMonitorRegister(Monitor monitor, String college, String profession, String grade, String classes,
			String againpsd) {
		if (monitor.getPassword() == null || monitor.getPassword().equals("")) {
			return "密码不能为空";
		}
		if (againpsd.equals("") || againpsd == null) {
			return "确认密码不能为空";
		}
		if (monitor.getEmail() == null) {
			return "邮箱不能为空";
		}
		Pattern pattern = Pattern.compile("^[a-zA-Z]\\w{5,17}$");
		if (!(pattern.matcher(monitor.getPassword()).matches())) {
			return "密码以字母开头，长度在6~18之间，只能包含字母、数字和下划线";
		}
		if (!(monitor.getPassword().equals(againpsd))) {
			return "确认密码填写不一致";
		}
		pattern = Pattern.compile("^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$");
		if (!(pattern.matcher(monitor.getEmail()).matches())) {
			return "请填写正确的邮箱地址";
		}
		if (findMonitorByEmail(monitor.getEmail()) == true) {
			return "该邮箱已经注册过一个班委了";
		}
		return "0";
	}

	/**
	 * 
	* @Title: saveMonitor  
	* @Description: TODO(这里用一句话描述这个方法的作用) 
	* @param:@param monitor (参数)
	* @return:void(返回类型)
	*
	 * @param monitor
	 */
	public void saveMonitor(Monitor monitor) {
		try {			
			monitorDaoImpl.save(monitor);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Monitor getMonitor(String email) {
		try {			
			return monitorDaoImpl.get(email);
		} catch (Exception e) {
			return null;
		}
	}
	/**
	 * 
	* @Title: processMonitorRegister  
	* @Description: TODO(这里用一句话描述这个方法的作用) 
	* @param:@param monitor
	* @param:@return (参数)
	* @return:String(返回类型)
	*
	 * @param monitor
	 * @return
	 */
	public String processMonitorRegister(Monitor monitor) {
		// 激活码由email产生
		String validateCode = MD5Util.encode2hex(monitor.getEmail());
		// 发送邮件
		StringBuffer sb = new StringBuffer("点击下面链接激活账号，1小时内有效，否则重新注册账号，链接只能使用一次，请尽快激活！</br>");
		sb.append("<a href=\"http://localhost:8080/ant/activeMonitor?email=").append(monitor.getEmail())
				.append("&validateCode=").append(validateCode).append("\">点此链接激活账户").append("</a>");
		MailUtil.send(monitor.getEmail(), sb.toString());
		monitor.setStatus(0);
		monitor.setValidateCode(validateCode);
		monitor.setRegisterTime(new Date());
		monitor.setPassword(MD5Util.encode2hex(monitor.getPassword()));// 密码加密
		saveMonitor(monitor);
		return validateCode;
	}
	
	public String VolidateMonitorRegister(String email,String validateCode) {
		Monitor monitor=getMonitor(email);
		if(monitor!=null) {
			if(monitor.getStatus()==0) {
				Date currentTime=new Date();
				//验证链接是否过期
				if(currentTime.before(IncreaseTimeUtil.addDateMinut(monitor.getRegisterTime(), 24))) {
					if(monitor.getValidateCode().equals(validateCode)) {
//						monitorDaoImpl.updateStatus();
						return "激活成功";
					}
				}else {
					return "激活码已过期";
				}
			}else {
				return "邮箱已激活，请登录";
			}
		}
		return "该邮箱未注册";
	}
}
