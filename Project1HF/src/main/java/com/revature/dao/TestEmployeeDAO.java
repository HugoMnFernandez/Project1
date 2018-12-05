package com.revature.dao;

import com.revature.domain.Employee;

public class TestEmployeeDAO implements EmployeeDAO {

	@Override
	public Employee getEmployeeByUsername(String username) {
		if("test".equals(username))
			return new Employee(0, username, "prout", "fname", "lname", 1000, 0, 0);
		else 
			return null;
	}

}
