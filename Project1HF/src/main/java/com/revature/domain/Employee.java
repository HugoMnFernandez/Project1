package com.revature.domain;

public class Employee {
	private int employeeID;
	private String username;
	private String password;
	private String fname;
	private String laname;
	private double avaiblableReimbursment;
	private int supervisorID;
	private int departmentID;
	
	
	
	
	
	
	public Employee(int employeeID, String username, String password, String fname, String laname,
			double avaiblableReimbursment, int supervisorID, int departmentID) {
		super();
		this.employeeID = employeeID;
		this.username = username;
		this.password = password;
		this.fname = fname;
		this.laname = laname;
		this.avaiblableReimbursment = avaiblableReimbursment;
		this.supervisorID = supervisorID;
		this.departmentID = departmentID;
	}
	
	
	
	public Employee() {
		super();
	}



	public int getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLaname() {
		return laname;
	}
	public void setLaname(String laname) {
		this.laname = laname;
	}
	public double getAvaiblableReimbursment() {
		return avaiblableReimbursment;
	}
	public void setAvaiblableReimbursment(double avaiblableReimbursment) {
		this.avaiblableReimbursment = avaiblableReimbursment;
	}
	public int getSupervisorID() {
		return supervisorID;
	}
	public void setSupervisorID(int supervisorID) {
		this.supervisorID = supervisorID;
	}
	public int getDepartmentID() {
		return departmentID;
	}
	public void setDepartmentID(int departmentID) {
		this.departmentID = departmentID;
	}
	
	
	
	
}
