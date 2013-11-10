package com.sarvatra.dao.service;

import java.util.List;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import com.sarvatra.dao.GenericDao;
import com.sarvatra.dao.model.ProUser;

public class ProUserServiceDaoImpl extends GenericDao<ProUser> implements ProUserServiceDao{
	public ProUserServiceDaoImpl(EntityManagerFactory entityFactory) {
		super(entityFactory);
	}

	public ProUser isUserExists(String userName, String password){
		String queryStr = "select u from ProUser u where u.userName = :userName and u.password = :password";
		Query query = em.createQuery(queryStr);
		query.setParameter("userName", userName);
		query.setParameter("password", password);
		List<ProUser> proUsers = query.getResultList();
		if(proUsers != null && proUsers.size() == 1){
			return proUsers.get(0);
		}
		return null;
	}
}
