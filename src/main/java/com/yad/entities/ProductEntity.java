package com.yad.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class ProductEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="description")
	private String description;
	
	
	@Column(name="created_at")
	private Date createdAt;
	
	@Column(name="brand")
	private String brand;
	

	@Column(name="category_id")
	private Date categoryId;
	
	@Column(name="price")
	private double price;
	
	@ManyToOne
	@JoinColumn(name="department_id")
	private DepartmentEntity department;

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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Date getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Date categoryId) {
		this.categoryId = categoryId;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public DepartmentEntity getDepartment() {
		return department;
	}

	public void setCategory(DepartmentEntity department) {
		this.department = department;
	}

	
	public String toString() {
		return "ProductEntity [id=" + id + ", name=" + name + ", description=" + description + ", createdAt="
				+ createdAt + ", brand=" + brand + ", categoryId=" + categoryId + ", price=" + price + ", department="
				+ department + "]";
	}
	

}
