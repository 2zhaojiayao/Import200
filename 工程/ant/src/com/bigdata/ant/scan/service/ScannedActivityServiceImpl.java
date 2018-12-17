package com.bigdata.ant.scan.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bigdata.ant.entity.Activity;
import com.bigdata.ant.scan.dao.ScannedActivityDaoImpl;
/**
 * 
 * @ClassName:ScannedActivityServiceImpl
 * @Description:通过将controller中得到的学生id传给Dao，得到浏览过的活动list
 * @Author zhaojiayao
 * @Date:2018年12月13日
 *
 */
@Service
@Transactional(readOnly=true)
public class ScannedActivityServiceImpl {
	@Resource
	private ScannedActivityDaoImpl sannedActivityDaoImpl;
	/**
	 * 
	* @Title: findScannedActivityList  
	* @Description: 将controller中得到的学生id传给Dao，得到浏览过的活动list
	* @param:@param stuId
	* @param:@return (参数)
	* @return:List<Activity>(返回类型)
	*
	 * @param stuId
	 * @return
	 */
	public List<Activity> findScannedActivityList(String stuId){
		List<Activity> actList = this.sannedActivityDaoImpl.findScannedActivityList(stuId);
		return actList;
	}
}
