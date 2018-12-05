package com.revature.domain;

import java.sql.Date;
import java.time.LocalDate;

public class Request {
	private int requestID;
	private Employee employee;
	private String eventName;
	private Date requestDate;
	private Date eventDate;
	private String eventLocation;
	private String description;
	private double cost;
	private double projectedReimbursment;
	private EventType eventType;
	private String status;
	private boolean urgent;

	public Request(int requestID, Employee employee, String eventName, Date requestDate, Date eventDate,
			String eventLocation, String description, double cost, double projectedReimbursment, EventType eventType,
			String status, boolean urgent) {
		super();
		this.requestID = requestID;
		this.employee = employee;
		this.requestDate = requestDate;
		this.eventDate = eventDate;
		this.eventLocation = eventLocation;
		this.description = description;
		this.cost = cost;
		this.projectedReimbursment = projectedReimbursment;
		this.eventType = eventType;
		this.status = status;
		this.urgent = urgent;
	}

	public Request(String eventName, Employee employee, String location, Date eventDate, String eventLocation,
			String description, double cost, EventType eventType) {
		super();
		this.eventName = eventName;
		this.employee = employee;
		this.eventLocation = location;
		this.eventDate = eventDate;
		this.eventLocation = eventLocation;
		this.description = description;
		this.cost = cost;
		this.eventType = eventType;
		this.requestDate = new Date(requestID);
		
	}

	public int getRequestID() {
		return requestID;
	}

	public void setRequestID(int requestID) {
		this.requestID = requestID;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Date getRequestDate() {
		return requestDate;
	}

	public void setRequestDate(Date requestDate) {
		this.requestDate = requestDate;
	}

	public Date getEventDate() {
		return eventDate;
	}

	public void setEventDate(Date eventDate) {
		this.eventDate = eventDate;
	}

	public String getEventLocation() {
		return eventLocation;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public void setEventLocation(String eventLocation) {
		this.eventLocation = eventLocation;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public double getProjectedReimbursment() {
		return projectedReimbursment;
	}

	public void setProjectedReimbursment(double projectedReimbursment) {
		this.projectedReimbursment = projectedReimbursment;
	}

	public EventType getEventType() {
		return eventType;
	}

	public void setEventType(EventType eventType) {
		this.eventType = eventType;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public boolean isUrgent() {
		return urgent;
	}

	public void setUrgent(boolean urgent) {
		this.urgent = urgent;
	}

}
