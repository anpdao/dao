package com.sarvatra.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sarvatra.dao.model.TmpTest;

public class DaoHelper {

	EntityManagerFactory entityFactory = null;
	
	public EntityManagerFactory getEntityFactory() {
		return entityFactory;
	}
	public void setEntityFactory(EntityManagerFactory entityFactory) {
		this.entityFactory = entityFactory;
	}	
	public static void main(String[] args) {
		DaoHelper dao = new DaoHelper();
		dao.test();
	}
	private static TmpTest createTmpTest(String empName){
		TmpTest tmpTest = new TmpTest();
		tmpTest.setId(empName);
		tmpTest.setEmpName(empName);
		return tmpTest;
	}
	public <E> void save(List<E> objects){

		EntityManager em = entityFactory.createEntityManager();
		em.getTransaction().begin();
		for(E e : objects){
			em.persist(e);
		}
		em.getTransaction().commit();
		em.close();
	}
	public <T> void save(T t){
		ApplicationContext appContext = new ClassPathXmlApplicationContext("dao-application-context.xml");
		entityFactory = (EntityManagerFactory) appContext.getBean("entityManagerFactory");
		
		EntityManager em = entityFactory.createEntityManager();
		em.getTransaction().begin();
		em.persist(t);
		em.getTransaction().commit();
		em.close();
	}
	public void test(){
		ApplicationContext appContext = new ClassPathXmlApplicationContext("dao-application-context.xml");
		entityFactory = (EntityManagerFactory) appContext.getBean("entityManagerFactory");
		EntityManager entityManager = entityFactory.createEntityManager();
		entityManager.getTransaction().begin();
		entityManager.persist(createTmpTest("test11"));
		entityManager.persist(createTmpTest("test21"));
		entityManager.persist(createTmpTest("test31"));
		entityManager.getTransaction().commit();
		entityManager.close();
		
	}
}
