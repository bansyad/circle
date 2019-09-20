package com.yad.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="department")
public class DepartmentEntity {
     @Id
     @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
     
     @Column(name="name")
	private String name;
     
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

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Column(name="location")
	private String location;

	@Override
	public String toString() {
		return "DepartmentEntity [id=" + id + ", name=" + name + ", location=" + location + "]";
	}

	public DepartmentEntity getdepartmentByName(String string) {
		
		return null;
	}
	
	
	
}
