package com.bigdata.ant.comprehensive.service;

import java.util.List;
import java.util.Set;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bigdata.ant.comprehensive.dao.ComprehensiveDaoImpl;
import com.bigdata.ant.comprehensive.dao.ComprehensiveMoralDaoImpl;
import com.bigdata.ant.comprehensive.dao.ComprehensiveStudyDaoImpl;
import com.bigdata.ant.entity.ActivitySum;
import com.bigdata.ant.entity.Comprehensive;
import com.bigdata.ant.entity.Monitor;
import com.bigdata.ant.entity.Student;

@Service
@Transactional(readOnly = false)
public class ComprehensiveServiceImpl {
	
	@Resource
	private ComprehensiveMoralDaoImpl comprehensiveMoralDaoImpl;
	@Resource
	private ComprehensiveStudyDaoImpl comprehensiveStudyDaoImpl;
	@Resource
	private ComprehensiveDaoImpl comprehensiveDaoImpl;
	/**
	 * 
	* @Title: getStudentByClass  
	* @Description: TODO(这里用一句话描述这个方法的作用) 通过班委获得该班级的学生集合
	* @param:@param monitor
	* @param:@return (参数)
	* @return:Set<Student>(返回类型)
	*
	 * @param monitor
	 * @return
	 */
	public Set<Student> getStudentByClass(Monitor monitor){
		return monitor.getClassInfo().getStudents();
	}
	/**
	 * 
	* @Title: getMoralAwardScoreByStudent  
	* @Description: TODO(这里用一句话描述这个方法的作用) 通过学生获得品德奖励分
	* @param:@param student
	* @param:@return (参数)
	* @return:float(返回类型)
	*
	 * @param student
	 * @return
	 */
	public float getMoralAwardScoreByStudent(Student student) {
		List<ActivitySum> list=student.getSumActivities();
//		System.out.println("学号"+student.getId());
//		System.out.println("size"+list.size());
		float sumMoralScore = 0;
		for (ActivitySum activitySum : list) {
			if(activitySum.getType().equals("品行表现")){
				sumMoralScore+=activitySum.getScore();
			}
		}
		sumMoralScore+=comprehensiveMoralDaoImpl.getMoralScore(student.getId());
		return sumMoralScore;
	}
	/**
	 * 
	* @Title: getStudyScoreByStudent  
	* @Description: TODO(这里用一句话描述这个方法的作用) 通过学生查找学业成绩
	* @param:@param student
	* @param:@return (参数)
	* @return:float(返回类型)
	*
	 * @param student
	 * @return
	 */
	public float getStudyScoreByStudent(Student student) {
		float sumStudyScore = 0;
		sumStudyScore+=comprehensiveStudyDaoImpl.getStudyScore(student.getId());
//		System.out.println("studyScore"+sumStudyScore);
		return sumStudyScore;
	}
	
	/**
	 * 
	* @Title: getAbilityAwardScoreByStudent  
	* @Description: TODO(这里用一句话描述这个方法的作用) 通过学生获得能力表现分数
	* @param:@param student
	* @param:@return (参数)
	* @return:float(返回类型)
	*
	 * @param student
	 * @return
	 */
	public float getAbilityAwardScoreByStudent(Student student) {
		List<ActivitySum> list=student.getSumActivities();
//		System.out.println("学号"+student.getId());
//		System.out.println("abilitySize"+list.size());
		float sumAbilityScore = 0;
		for (ActivitySum activitySum : list) {
			if(activitySum.getType().equals("能力表现")){
				sumAbilityScore+=activitySum.getScore();
			}
		}
		return sumAbilityScore;
	}
	/**
	 * 
	* @Title: getComprehensiveScore  
	* @Description: TODO(这里用一句话描述这个方法的作用) 获得综测成绩
	* @param:@param maxMoral
	* @param:@param maxStudy
	* @param:@param maxAbility
	* @param:@param student
	* @param:@return (参数)
	* @return:float(返回类型)
	*
	 * @param maxMoral
	 * @param maxStudy
	 * @param maxAbility
	 * @param student
	 * @return
	 */
	public float getComprehensiveScore(float maxMoral,float maxStudy,float maxAbility,Student student) {
		float moral=getMoralAwardScoreByStudent(student);
		float study=getStudyScoreByStudent(student);
		float ability=getAbilityAwardScoreByStudent(student);
		float comprehensiveScore=moral/maxMoral*30+study/maxStudy*50+ability/maxAbility*20;
		return comprehensiveScore;
	}
	
	/**
	 * 
	* @Title: insertScore  
	* @Description: TODO(这里用一句话描述这个方法的作用) 插入到数据库中
	* @param:@param monitor (参数)
	* @return:void(返回类型)
	*
	 * @param monitor
	 */
	public void insertScore(Monitor monitor) {
		float maxMoral=0;
		float maxStudy=0;
		float maxAbility=0;
		Set<Student> studentSet=monitor.getClassInfo().getStudents();
		System.out.println(monitor.getEmail());
		System.out.println(monitor.getClassInfo().getId());
		System.out.println(monitor.getClassInfo().getStudents().size());
		System.out.println(studentSet.size());
		for (Student student : studentSet) {
			float moral=getMoralAwardScoreByStudent(student);
			System.out.println(moral);
			if(maxMoral<moral) {
				maxMoral=moral;
			}
			
			float study=getStudyScoreByStudent(student);
			System.out.println(study);
			if(maxStudy<study) {
				maxStudy=study;
			}
			
			float ability=getAbilityAwardScoreByStudent(student);
			System.out.println(ability);
			if(maxAbility<ability) {
				maxAbility=ability;
			}			
		}
		System.out.println("maxMoral"+maxMoral);
		System.out.println("maxStudy"+maxStudy);
		System.out.println("maxAbility"+maxAbility);
		for (Student student : studentSet) {
			float comprehensiveScore=getComprehensiveScore(maxMoral, maxStudy, maxAbility, student);
			System.out.println("comprehensiveScore"+comprehensiveScore);
			Comprehensive comprehensive=comprehensiveDaoImpl.getComprehensive(student.getId());
			System.out.println(comprehensive!=null);
			if(comprehensive!=null) {
				System.out.println("comprehensive!=null");
				comprehensive.setScore(comprehensiveScore);
			}else {
				System.out.println("comprehensive==null");
				Comprehensive comprehensive1=new Comprehensive();
				comprehensive1.setId(student.getId());
				System.out.println("get"+comprehensive1.getId());
				
				comprehensive1.setScore(comprehensiveScore);
				System.out.println("get"+comprehensive1.getScore());
				System.out.println(comprehensive1!=null);
				comprehensiveDaoImpl.saveComprehensive(comprehensive1);
			}
		}
		
	}
}
