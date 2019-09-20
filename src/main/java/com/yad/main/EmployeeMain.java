package com.yad.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.yad.entities.EmployeeEntity;
import com.yad.repositories.EmployeeRepository;

public class EmployeeMain {

	public static void main(String[] args) {

		EmployeeEntity emp = new EmployeeEntity();
		emp.setName("yadav");
		emp.setEmail("justice4luvnwar@gmail.com");
		emp.setPhone(1122334l);

		ApplicationContext cxt = new ClassPathXmlApplicationContext("application-context.xml");
		EmployeeRepository employeeRepository = (EmployeeRepository) cxt.getBean("employeeRepository");
		employeeRepository.save(emp);

		System.out.println("**************************");
		List<EmployeeEntity> employees = employeeRepository.getEmployeeByName("yadav");
		for (EmployeeEntity e : employees) {
			System.out.println(e.toString());
		}

		System.out.println();
		System.out.println("**************************");

//		EmployeeEntity employee1 = employeeRepository.getEmployeeById(4l);
//		System.out.println(employee1.toString());
//
//		System.out.println("******* update example*********");
//		EmployeeEntity empUpdate = employeeRepository.getEmployeeById(5l);
//		empUpdate.setEmail("updatedneweamil@gmail.com");
//		empUpdate.setPhone(10000000l);
//		employeeRepository.update(empUpdate);
//
	}

}
