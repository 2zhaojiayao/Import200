package com.bigdata.ant.organizationMine.service;


import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bigdata.ant.entity.Organization;
import com.bigdata.ant.organizationMine.dao.OrganizationMineActivityDaoImpl;
import com.bigdata.ant.utils.Page;

/**
 * 
 * @ClassName:OrganizationMineServiceImpl
 * @Description:TODO（用一句话描述这个类的作用）
 * @Author wangmengzhen
 * @Date:2018年12月19日
 *
 */
@Service
@Transactional(readOnly = true)
public class OrganizationMineServiceImpl {

	@Resource 
	private OrganizationMineActivityDaoImpl organizationMineActivityDaoImpl;
	
	/**
	 * 
	* @Title: countBeforeTime  
	* @Description: TODO(这里用一句话描述这个方法的作用) 得到未开始的活动数
	* @param:@return (参数)
	* @return:Long(返回类型)
	*
	 * @return
	 */
	public Long countBeforeTime(Organization organization) { 
		Long count=organizationMineActivityDaoImpl.countBeforeTime(organization);
		return count;
	}
	
	/**
	 * 
	* @Title: countInTime  
	* @Description: TODO(这里用一句话描述这个方法的作用) 得到进行中的活动数
	* @param:@param organization
	* @param:@return (参数)
	* @return:Long(返回类型)
	*
	 * @param organization
	 * @return
	 */
	public Long countInTime(Organization organization) { 
		Long count=organizationMineActivityDaoImpl.countInTime(organization);
		return count;
	}
	
	/**
	 * 
	* @Title: countAfterTime  
	* @Description: TODO(这里用一句话描述这个方法的作用) 得到已结束的活动数
	* @param:@param organization
	* @param:@return (参数)
	* @return:Long(返回类型)
	*
	 * @param organization
	 * @return
	 */
	public Long countAfterTime(Organization organization) { 
		Long count=organizationMineActivityDaoImpl.countAfterTime(organization);
		return count;
	}
	/**
	 * 
	* @Title: findPageByProjection  
	* @Description: TODO(这里用一句话描述这个方法的作用)分页显示所有活动的映射 
	* @param:@param pageNum
	* @param:@param organization
	* @param:@return (参数)
	* @return:Page<Object[]>(返回类型)
	*
	 * @param pageNum
	 * @param organization
	 * @return
	 */
	public Page<Object[]> findPageByProjection(int pageNum,Organization organization){
		return organizationMineActivityDaoImpl.findPageByProjection(pageNum, 6, organization);
	}
	
	/**
	 * 
	* @Title: findPageBeforeTime  
	* @Description: TODO(这里用一句话描述这个方法的作用) 分页显示未开始活动
	* @param:@param pageNum
	* @param:@param organization
	* @param:@return (参数)
	* @return:Page<Object[]>(返回类型)
	*
	 * @param pageNum
	 * @param organization
	 * @return
	 */
	public Page<Object[]> findPageBeforeTime(int pageNum,Organization organization){
		return organizationMineActivityDaoImpl.findPageBeforeTime(pageNum, 6, organization);
	}
	
	/**
	 * 
	* @Title: findPageInTime  
	* @Description: TODO(这里用一句话描述这个方法的作用) 分页显示进行中的活动
	* @param:@param pageNum
	* @param:@param organization
	* @param:@return (参数)
	* @return:Page<Object[]>(返回类型)
	*
	 * @param pageNum
	 * @param organization
	 * @return
	 */
	public Page<Object[]> findPageInTime(int pageNum,Organization organization){
		return organizationMineActivityDaoImpl.findPageInTime(pageNum, 6, organization);
	}
	/**
	 * 
	* @Title: findPageAfterTime  
	* @Description: TODO(这里用一句话描述这个方法的作用) 分页显示已完成的活动
	* @param:@param pageNum
	* @param:@param organization
	* @param:@return (参数)
	* @return:Page<Object[]>(返回类型)
	*
	 * @param pageNum
	 * @param organization
	 * @return
	 */
	public Page<Object[]> findPageAfterTime(int pageNum,Organization organization){
		return organizationMineActivityDaoImpl.findPageAfterTime(pageNum, 6, organization);
	}
	
}
