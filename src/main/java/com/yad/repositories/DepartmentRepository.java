package com.yad.repositories;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.yad.entities.DepartmentEntity;

@Repository
public class DepartmentRepository {
	private SessionFactory sessionFactory;
	
	public void save(DepartmentEntity department) {
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		session.save(department);
		session.getTransaction().commit();
		session.close();
		
	}
	
	public void update(DepartmentEntity department) {
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		session.save(department);
		session.getTransaction().commit();
		session.close();
	}
	public DepartmentEntity  getcategoryByName(String name) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		Query query = 
				session.createQuery("from DepartmentEntity d where .name =:name");
		query.setParameter("name", name);
		DepartmentEntity department = (DepartmentEntity) query.uniqueResult();
		
		session.getTransaction().commit();
		session.close();
		return department;
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}


}
