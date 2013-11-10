package com.sarvatra.dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sarvatra.dao.service.ProUserServiceDao;

public class SpringHelper{
	public ProUserServiceDao getUserServiceServiceDao(){
		ApplicationContext appContext = new ClassPathXmlApplicationContext("dao-application-context.xml");
		return (ProUserServiceDao)appContext.getBean(Constant.USER_SERVICE_DAO);
	}
}
