package com.yad.repositories;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;


import com.yad.entities.EmployeeLoginEntity;

@Repository
public class EmployeeLoginRepository {
	
	private SessionFactory sessionFactory;
	
	
	public void save(EmployeeLoginEntity employeeLogin) {
	
	Session session=sessionFactory.openSession();
	session.beginTransaction();
	session.save(employeeLogin);
	session.getTransaction().begin();
	session.close();
	}
	public EmployeeLoginEntity getByUsername(String userid) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Query q= session.createQuery("From EmployeeLoginEntity cl where cl.username = :username");
		q.setParameter("username", userid);
		
		EmployeeLoginEntity loginEntity = (EmployeeLoginEntity) q.uniqueResult();
		session.getTransaction().commit();
		session.close();
		
		return loginEntity;
	}
	
	public void update(EmployeeLoginEntity employeeLogin) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		session.merge(employeeLogin);
		
		session.getTransaction().commit();
		session.close();
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}

