package com.bigdata.ant.register.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bigdata.ant.register.dao.RegisterOrganizationDaoImpl;

@Service
@Transactional(readOnly = false)
public class RegisterOrganizationServiceImpl {

	@Resource
	private RegisterOrganizationDaoImpl registerOrganizationDaoImpl;
}
