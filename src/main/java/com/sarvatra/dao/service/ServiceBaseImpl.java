package com.sarvatra.dao.service;

import com.sarvatra.dao.DaoHelper;

public class ServiceBaseImpl implements ServiceBase{
	DaoHelper daoHelper;

	public DaoHelper getDaoHelper() {
		return daoHelper;
	}

	public void setDaoHelper(DaoHelper daoHelper) {
		this.daoHelper = daoHelper;
	}
}
