package com.revature.service;

import com.revature.dao.EmployeeDAO;
import com.revature.dao.EmployeeDAOPostgres;
import com.revature.dao.TestEmployeeDAO;
import com.revature.domain.Employee;

public class AuthService {
	EmployeeDAO udao = new TestEmployeeDAO();
	public Employee validateUser(String username,String password) {
		
		Employee employee = udao.getEmployeeByUsername(username);
		
		
		if(employee == null|| !employee.getPassword().equals(password)) {
			System.out.println("null employee returned");
			return null;
		}
		
		System.out.println(employee.getUsername());
		
		return employee;
		
	}

}
