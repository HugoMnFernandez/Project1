package com.revature.domain;

public class Department {
	private int departmentid;
	private String name;
	private Employee departmentHead;
	
	
	
	public Department(int departmentid, String name, Employee departmentHead) {
		super();
		this.departmentid = departmentid;
		this.name = name;
		this.departmentHead = departmentHead;
	}
	
	
	public int getDepartmentid() {
		return departmentid;
	}
	public void setDepartmentid(int departmentid) {
		this.departmentid = departmentid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Employee getDepartmentHead() {
		return departmentHead;
	}
	public void setDepartmentHead(Employee departmentHead) {
		this.departmentHead = departmentHead;
	}
	
	
	

}
