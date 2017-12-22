package com.njtech.struts.bean;

public class Employee {
	private int id;
	private Double salary;

	public Employee(int id, Double salary) {
		super();
		this.id = id;
		this.salary = salary;
	}
	public Employee() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	
}
