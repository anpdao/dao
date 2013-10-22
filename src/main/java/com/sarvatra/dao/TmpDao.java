package com.sarvatra.dao;

import javax.persistence.EntityManager;

import com.sarvatra.dao.model.TmpTest;

public class TmpDao extends GenericDao<TmpTest> {
	public TmpDao(EntityManager entityManager) {
		super(entityManager);
	}
	public void test() {
		create(createTest("test1"));
	}

	public TmpTest createTest(String empName) {
		TmpTest test = new TmpTest();
		test.setEmpName(empName);
		return test;
	}	
}
