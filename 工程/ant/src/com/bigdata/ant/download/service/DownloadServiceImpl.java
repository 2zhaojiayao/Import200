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

	public List<ActivitySum> listAll() {
		return this.downloadDaoImpl.listAll();
	}

}
