package com.revature.dao;

import com.revature.domain.Employee;

public class FakeEmployeeDAO  implements EmployeeDAO{
	
	public Employee getEmployeeByUsername(String username) {
		if("Nick".equals(username)) {
			Employee ret = new Employee();
			ret.setFname("Nick");
			ret.setLaname("J");
			ret.setUsername("Nick");
			ret.setPassword("1234");
			return ret;
		}
		return null;
	}

}
