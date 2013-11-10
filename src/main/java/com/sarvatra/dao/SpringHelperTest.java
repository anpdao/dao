package com.sarvatra.dao;

import com.sarvatra.dao.model.ProUser;
import com.sarvatra.dao.service.ProUserServiceDao;

public class SpringHelperTest {
	public static void main(String[] args) {
		SpringHelper helper = new SpringHelper();
		ProUserServiceDao userServiceDao = helper.getUserServiceServiceDao();
		ProUser proUser = userServiceDao.isUserExists("pawan", "pawan");
		System.out.println("pro user : " + proUser.getUserName());
		System.out.println("pro password : " + proUser.getPassword());
	}
}
