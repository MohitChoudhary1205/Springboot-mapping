package com.mappingtest.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long addid;

	private String location;

	private String city;
	@ManyToOne
	@JoinColumn(name = "emp_id") 
	@JsonBackReference
	private Employee employee;
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public Address(Long addid, String location, String city, Employee employee) {
		super();
		this.addid = addid;
		this.location = location;
		this.city = city;
		this.employee = employee;
	}
	
public Address() {}
}
