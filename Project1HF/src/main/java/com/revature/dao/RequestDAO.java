package com.revature.dao;

import java.sql.Date;

import com.revature.domain.Employee;
import com.revature.domain.EventType;

public interface RequestDAO {

	public void createRequest(int requestID, Employee employee, Date requestDate, Date eventDate, String eventLocation,
			String description, double cost, double projectedReimbursment, EventType eventType, String status, boolean urgent);

}
