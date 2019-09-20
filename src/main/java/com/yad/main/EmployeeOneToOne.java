package com.yad.main;

import java.util.Date; 

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yad.entities.EmployeeEntity;
import com.yad.entities.EmployeeLoginEntity;
import com.yad.repositories.EmployeeLoginRepository;



public class EmployeeOneToOne {
	
	public static void main(String[] args) {
     EmployeeLoginEntity employeeLogin = new EmployeeLoginEntity();
     employeeLogin.setName("abcde");
		String password = DigestUtils.sha256Hex("1234567");
		employeeLogin.setPassword(password);
		employeeLogin.setCreatedAt(new Date());
		
		
		EmployeeEntity emp=new EmployeeEntity();
		emp.setName("sony");
		emp.setEmail("sony@gmail.com");
		emp.setPhone(2222222l);
		
		employeeLogin.setEmployee(emp);
		ApplicationContext ctx = new ClassPathXmlApplicationContext("application-context.xml");

		
		EmployeeLoginRepository employeeLoginRepository=(EmployeeLoginRepository)
		ctx .getBean("employeeLoginRepository");
		employeeLoginRepository.save(employeeLogin);

	}

}
