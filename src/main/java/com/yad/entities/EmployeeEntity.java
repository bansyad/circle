package com.yad.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Columns;
import org.hibernate.annotations.Generated;

;

@Entity
@Table(name="employee")
public class EmployeeEntity {
	

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="email")
	private String email;
	
	@Column(name="phone")
	private Long phone;
	
	@OneToOne(mappedBy = "employee", 
			fetch= FetchType.EAGER, cascade= CascadeType.ALL)
	private EmployeeLoginEntity employeeLoginEntity;

	public Long getIdl() {
		return id;
	}

	public void setIdl(Long idl) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getPhone() {
		return phone;
	}

	public void setPhone(Long phone) {
		this.phone = phone;
	}

	public EmployeeLoginEntity getEmployeeLoginEntity() {
		return employeeLoginEntity;
	}

	public void setEmployeeLoginEntity(EmployeeLoginEntity employeeLoginEntity) {
		this.employeeLoginEntity = employeeLoginEntity;
	}

	@Override
	public String toString() {
		return "EmployeeEntity [id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone
				+  "]";
	}
	

}
