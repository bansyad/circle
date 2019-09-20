package com.yad.repositories;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import org.hibernate.Query;

import com.yad.entities.EmployeeEntity;

import java.util.List;

@Repository
public class EmployeeRepository {
	private SessionFactory sessionFactory;
	
	public void save(EmployeeEntity employee) {
		Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(employee);
        session.getTransaction().commit();
        session.close();
	} 
        public List<EmployeeEntity> getEmployeeByName(String name){
        	
        
        Session session=sessionFactory.openSession();
        session.beginTransaction();
        Query query=
        		session.createQuery("from EmployeeEntity e from e.name=:name");
        query.setParameter("name", name);
        List<EmployeeEntity> employeeList=query.list();
        
        session.beginTransaction().commit();
        session.close();
        return employeeList;
        
       }
        public void update(EmployeeEntity employee) {
    		Session session = sessionFactory.openSession();
    		session.beginTransaction();
    		
    		session.merge(employee);
    		
    		session.getTransaction().commit();
    		session.close();
    	}

    	public SessionFactory getSessionFactory() {
    		return sessionFactory;
    	}

    	public void setSessionFactory(SessionFactory sessionFactory) {
    		this.sessionFactory = sessionFactory;
    	}
		public EmployeeEntity getEmployeeById(long l) {
			// TODO Auto-generated method stub
			return null;
		}

    }


