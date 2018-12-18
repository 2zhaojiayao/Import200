package com.bigdata.ant.download.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.bigdata.ant.entity.ActivitySum;
import com.bigdata.ant.utils.BaseDao;

/**
 * 
 * @ClassName:DownloadDaoImpl
 * @Description:下载活动汇总表
 * @Author xujunmei
 * @Date:2018年12月18日
 *
 */
@Repository
public class DownloadDaoImpl extends BaseDao<ActivitySum, Integer> {

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
		try {
			return this.findAll();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

}
