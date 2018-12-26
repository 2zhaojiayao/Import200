package com.bigdata.ant.comprehensive.dao;

import org.springframework.stereotype.Repository;

import com.bigdata.ant.entity.BasicScore;
import com.bigdata.ant.utils.BaseDao;

@Repository
public class ComprehensiveStudyDaoImpl extends BaseDao<BasicScore, String>{
	public float getStudyScore(String id) {
		try {
			BasicScore basicScore=get(id);
			return (float)basicScore.getStudyScore();
		} catch (Exception e) {
			return 0;
		}
		
	}
}
