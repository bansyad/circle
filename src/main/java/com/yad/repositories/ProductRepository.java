package com.yad.repositories;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.yad.entities.ProductEntity;

@Repository
public class ProductRepository {
	private SessionFactory sessionFactory;
	
	
	public void save(ProductEntity product) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(product);
		session.getTransaction().commit();
		session.close();
		
		
	}
	public void update(ProductEntity product) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		session.merge(product);
		
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
