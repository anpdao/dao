package com.sarvatra.dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sarvatra.dao.service.LoginService;

public class SpringHelper{
	public LoginService getLoginService(){
		ApplicationContext appContext = new ClassPathXmlApplicationContext("dao-application-context.xml");
		return (LoginService)appContext.getBean(Constant.BEAN_LOGIN_SERVICE);
	}
}
