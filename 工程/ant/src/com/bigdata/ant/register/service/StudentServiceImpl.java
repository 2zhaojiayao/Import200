package com.bigdata.ant.register.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.regex.Pattern;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bigdata.ant.entity.College;
import com.bigdata.ant.entity.Student;
import com.bigdata.ant.register.dao.CollegeDaoImpl;
import com.bigdata.ant.register.dao.StudentDaoImpl;
import com.bigdata.ant.utils.IncreaseTimeUtil;
import com.bigdata.ant.utils.MD5Util;
import com.bigdata.ant.utils.MailUtil;

@Service
@Transactional(readOnly = false)
public class StudentServiceImpl {
	
	@Resource
	private StudentDaoImpl studentDaoImpl;
	@Resource
	private CollegeDaoImpl collegeDaoImpl;
	
	/**
	 * 
	* @Title: findCollege  
	* @Description: TODO(这里用一句话描述这个方法的作用) 查找到所有学院
	* @param:@return (参数)
	* @return:List<College>(返回类型)
	*
	 * @return
	 */
	public List<College> findCollege(){
		try {
			return collegeDaoImpl.findAll();
		} catch (Exception e) {
			return null;
		}
	}
	/**
	 * 
	* @Title: findClasses  
	* @Description: TODO(这里用一句话描述这个方法的作用) 可以选择的班级信息
	* @param:@return (参数)
	* @return:List<Integer>(返回类型)
	*
	 * @return
	 */
	public List<Integer> findClasses() {
		List<Integer> list=new ArrayList<Integer>();
		for (int i = 1; i <= 12; i++) {
			list.add(i);
		}
		return list;
	}
	/**
	 * 
	* @Title: findStudentById  
	* @Description: TODO(这里用一句话描述这个方法的作用) 通过学号能否查到该学生，若存在该学生，返回true，否则返回false
	* @param:@param student_id
	* @param:@return (参数)
	* @return:Boolean(返回类型)
	*
	 * @param student_id
	 * @return boolean
	 */
	public Boolean findStudentById (String student_id) {
		try {
			Student student=studentDaoImpl.get(student_id);
			if(student!=null) {
				return true;//可以找到该学生
			}else {
				return false;//不存在该学生
			}			
		} catch (Exception e) {
			return false;
		}
	}
	
	/**
	 * 
	* @Title: admitStudentRegister  
	* @Description: TODO(这里用一句话描述这个方法的作用) 验证该学生所填的信息是否完整，能否注册
	* @param:@param student
	* @param:@param admitStudentRegister
	* @param:@return (参数)
	* @return:Boolean(返回类型)
	*
	 * @param student
	 * @param admitStudentRegister
	 * @return
	 */
	public String admitStudentRegister(Student student,String againpsd) {
		if(student.getId()==null||student.getId().equals("")) {
			return "学号不能为空";
		}
		if(student.getName()==null||student.getName().equals("")) {
			return "姓名不能为空";
		}
		if(student.getPassword()==null||student.getPassword().equals("")) {
			return "密码不能为空";
		}
		if(againpsd.equals("")||againpsd==null) {
			return "确认密码不能为空";
		}
		if(student.getEmail()==null) {
			return "邮箱不能为空";
		}
		Pattern pattern = Pattern.compile("^\\d{10}$");
        if(!(pattern.matcher(student.getId()).matches())) {
        	return "学号必须由10位数字组成";
        }
        pattern = Pattern.compile("[\\u4e00-\\u9fa5]{2,20}|[a-zA-Z\\.\\s]{1,20}");
        if(!(pattern.matcher(student.getName()).matches())) {
        	return "请填写您的真实姓名，长度在20个字符以内";
        }
        pattern = Pattern.compile("^[a-zA-Z]\\w{5,17}$");
        if(!(pattern.matcher(student.getPassword()).matches())) {
        	return "密码以字母开头，长度在6~18之间，只能包含字母、数字和下划线";
        }
        if(!(student.getPassword().equals(againpsd))) {
        	return "确认密码填写不一致";
        }
        pattern = Pattern.compile("^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$");
        if(!(pattern.matcher(student.getEmail()).matches())) {
        	return "请填写正确的邮箱地址";
        }
        if(true==findStudentById(student.getId())){
        	return "该学号已经注册过了";
        }
        return "0";        		
	}
	
	/**
	 * 
	* @Title: saveStudent  
	* @Description: TODO(这里用一句话描述这个方法的作用) 通过学号查找到该学生
	* @param:@param id (参数)
	* @return:void(返回类型)
	*
	 * @param id
	 */
	public void saveStudent(Student student) {
		try {			
			studentDaoImpl.save(student);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 * 
	* @Title: processRegister  
	* @Description: TODO(这里用一句话描述这个方法的作用) 处理注册,发送邮件
	* @param:@param email (参数)
	* @return:void(返回类型)
	*
	 * @param email
	 */
	public String processRegister(Student student) {
		//激活码由email产生
		String validateCode=MD5Util.encode2hex(student.getEmail());		
		//发送邮件
		StringBuffer sb = new StringBuffer("点击下面链接激活账号，1小时内有效，否则重新注册账号，链接只能使用一次，请尽快激活！</br>");
		sb.append("<a href=\"http://localhost:8080/ant/activeStudent?email=")
			.append(student.getEmail())
			.append("&validateCode=")
			.append(validateCode)
			.append("\">点此链接激活账户")
			.append("</a>");
		MailUtil.send(student.getEmail() , sb.toString());
		student.setStatus(0);
		student.setValidateCode(validateCode);
		student.setRegisterTime(new Date());
		student.setPassword(MD5Util.encode2hex(student.getPassword()));//密码加密
		saveStudent(student);
		return validateCode;			
	}
	
	/**
	 * 
	* @Title: VolidateRegister  
	* @Description: TODO(这里用一句话描述这个方法的作用) 激活验证码
	* @param:@param student
	* @param:@param id
	* @param:@return (参数)
	* @return:String(返回类型)
	*
	 * @param student
	 * @param id
	 * @return
	 */
	public String VolidateRegister(String email,String validateCode) {
		Student student=studentDaoImpl.findByEmail(email);
		if(student!=null) {
			if(student.getStatus()==0) {
				Date currentTime=new Date();
				//验证链接是否过期
				if(currentTime.before(IncreaseTimeUtil.addDateMinut(student.getRegisterTime(), 24))) {
					if(student.getValidateCode().equals(validateCode)) {
						studentDaoImpl.updateStatus();
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
