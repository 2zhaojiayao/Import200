package com.bigdata.ant.download.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bigdata.ant.download.dao.DownloadDaoImpl;
import com.bigdata.ant.entity.ActivitySum;

@Service
@Transactional(readOnly = false)
public class DownloadServiceImpl {

	@Resource
	private DownloadDaoImpl downloadDaoImpl;

	/**
	 * 
	 * @Title: listAll
	 * @Description: 查询活动汇总表中的所有数据
	 * @param:@return (参数)
	 * @return:List<ActivitySum>(返回类型)
	 *
	 * @return
	 */
	public List<ActivitySum> listAll() {
		return this.downloadDaoImpl.listAll();
	}

	/**
	 * 
	 * @Title: getIdList
	 * @Description: 查出id相同的集合
	 * @param:@param id
	 * @param:@return (参数)
	 * @return:List(返回类型)
	 *
	 * @param id
	 * @return
	 */
	public List getIdList(String id) {
		return this.downloadDaoImpl.getIdList(id);
	}

}
