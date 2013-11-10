package com.sarvatra.dao.service;

import com.sarvatra.dao.GenericDao;
import com.sarvatra.dao.model.ProUser;

public interface ProUserServiceDao extends GenericDao<ProUser> {
	public ProUser isUserExists(String userName, String password);
}
