package com.yad.entities;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "employee_login")
public class EmployeeLoginEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "username")
	private String name;

	@Column(name = "password")
	private String password;

	@Column(name = "created_at")
	private Date createdAt;

	@Column(name = "updated_at")
	private Date upDatedAt;

	//@Column(name = "last_signed_on_at")
//	private Date signedOnAt;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpDatedAt() {
		return upDatedAt;
	}

	public void setUpDatedAt(Date upDatedAt) {
		this.upDatedAt = upDatedAt;
	}

//	public Date getSignedOnAt() {
//		return signedOnAt;
//	}
//
//	public void setSignedOnAt(Date signedOnAt) {
//		this.signedOnAt = signedOnAt;
//	}

	public EmployeeEntity getEmployee() {
		return employee;
	}

	public void setEmployee(EmployeeEntity employee) {
		this.employee = employee;
	}

	

	@Override
	public String toString() {
		return "EmployeeLoginEntity [id=" + id + ", name=" + name + ", password=" + password + ", createdAt="
				+ createdAt + ", upDatedAt=" + upDatedAt + ", employee=" + employee + "]";
	}


	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "employee_id", referencedColumnName = "id")
	private EmployeeEntity employee;

}
