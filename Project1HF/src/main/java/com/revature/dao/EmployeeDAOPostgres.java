package com.revature.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import com.revature.domain.Employee;
import com.revature.util.ConnectionFactory;

public class EmployeeDAOPostgres implements EmployeeDAO{
	Connection conn = ConnectionFactory.getConnectionFactory().createConnection();
	
	
	
	@Override
	public Employee getEmployeeByUsername(String username) {
		String sql = "Select * from employee where username = ?";
		try {
			PreparedStatement preparedStatement = conn.prepareStatement(sql);
			preparedStatement.setString(1, username);
			ResultSet rs = preparedStatement.executeQuery();

			if (rs.next()) {
				Employee emp = new Employee(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
											rs.getString(5),rs.getDouble(6),rs.getInt(7),  rs.getInt(8));
				return emp;
			}
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return null;
	}

}
