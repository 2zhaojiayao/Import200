package com.bigdata.ant.update.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bigdata.ant.update.dao.UpdateDaoImpl;

/**
 * 
 * @ClassName:UpdateServiceImpl
 * @Description:修改报名表
 * @Author xujunmei
 * @Date:2018年12月24日
 *
 */
@Service
@Transactional(readOnly = false)
public class UpdateServiceImpl {

	@Resource
	private UpdateDaoImpl updateDaoImpl;

	/**
	 * 
	 * @Title: listId
	 * @Description:查出所有学号
	 * @param:@return (参数)
	 * @return:List(返回类型)
	 *
	 * @return
	 */
	public List listId() {
		return this.updateDaoImpl.listId();
	}
}
