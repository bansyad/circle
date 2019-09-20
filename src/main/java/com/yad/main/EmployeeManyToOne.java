package com.yad.main;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yad.entities.DepartmentEntity;
import com.yad.entities.ProductEntity;
import com.yad.repositories.DepartmentRepository;
import com.yad.repositories.ProductRepository;

public class EmployeeManyToOne {

	public static void main(String[] args) {
		ApplicationContext cxt=new ClassPathXmlApplicationContext("application-context.xml");
		
		DepartmentRepository departmentRepository=(DepartmentRepository) cxt.getBean("departmentRepository");
	System.out.println("*************creating product****");

	System.out.println("***** creating product*****");
	ProductEntity product1 = new ProductEntity();
	product1.setName("Mac book");
	product1.setBrand("Apple");
	product1.setDescription("thi is a macbook");
	product1.setPrice(1500d);
	product1.setCreatedAt(new Date());
	
	DepartmentEntity departmentElectronics = DepartmentElectronics.getdepartmentByName("Electronics");
	
	product1.setCategory(departmentElectronics);
	
	
	//ProductRepository productRepository = (ProductRepository) ctx.getBean("productRepository");
	//productRepository.save(product1);
	
}
	
	}

