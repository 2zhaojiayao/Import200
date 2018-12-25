//package com.bigdata.ant.download.dao;
//
//import java.util.List;
//import java.util.Set;
//
//import org.springframework.stereotype.Repository;
//
//import com.bigdata.ant.entity.ActivitySum;
//import com.bigdata.ant.entity.Student;
//import com.bigdata.ant.utils.BaseDao;
//
///**
// * 
// * @ClassName:DownloadDaoImpl
// * @Description:下载活动汇总表
// * @Author xujunmei
// * @Date:2018年12月18日
// *
// */
//@Repository
//public class DownloadDaoImpl extends BaseDao<ActivitySum, Integer> {
//
//	/**
//	 * 
//	 * @Title: listAll
//	 * @Description: 查询活动汇总表中的所有数据
//	 * @param:@return (参数)
//	 * @return:List<ActivitySum>(返回类型)
//	 *
//	 * @return
//	 */
//	public List<ActivitySum> listAll(Set<Student> s) {
//		try {
//			return this.findAll();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//			return null;
//		}
//	}
//
//	/**
//	 * 
//	 * @Title: getIdList
//	 * @Description: 查询相同学号的记录集合
//	 * @param:@param id
//	 * @param:@return (参数)
//	 * @return:List<ActivitySum>(返回类型)
//	 *
//	 * @param id
//	 * @return
//	 */
//	public List<ActivitySum> getIdList(String id) {
//		String hql = "from ActivitySum a where a.studentId = ?0";
//		List<ActivitySum> list = null;
//		try {
//			list = this.find0(hql, id);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return list;
//	}
//
//}
