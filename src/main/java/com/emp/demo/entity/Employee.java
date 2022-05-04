package com.emp.demo.entity;

public class Employee {
	private int employeeid;
	private String name;
	private int salary;
	
	 
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int employeeid, String name, int salary) {
		super();
		this.employeeid = employeeid;
		this.name = name;
		this.salary = salary;
	}
	public int getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getsalary() {
		return salary;
	}
	public void setAddresss(int salary) {
		this.salary = salary;
	}
	

}
