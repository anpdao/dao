package com.sarvatra.dao;

import javax.persistence.EntityManagerFactory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sarvatra.dao.model.TmpTest;

public class DaoHelperTest {
	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("dao-application-context.xml");
		DaoHelper dao = (DaoHelper) appContext.getBean("daoHelper");
		dao.save(create("value1"));
	}
	public static TmpTest create(String value){
		TmpTest test = new TmpTest();
		test.setEmpName(value);
		test.setId(value);
		return test;
	}
}
