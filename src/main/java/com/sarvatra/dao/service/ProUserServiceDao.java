package com.sarvatra.dao.service;

import com.sarvatra.dao.model.ProUser;

public interface ProUserServiceDao {
	public ProUser isUserExists(String userName, String password);
}
