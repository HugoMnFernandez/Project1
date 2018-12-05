package com.revature.domain;

public class Message {
	
	private int messageID;
	private Employee source;
	private Employee destination;
	private Request request;
	private String message;
	
	
	public Message(int messageID, Employee source, Employee destination, Request request, String message) {
		super();
		this.messageID = messageID;
		this.source = source;
		this.destination = destination;
		this.request = request;
		this.message = message;
	}
	
	
	public int getMessageID() {
		return messageID;
	}
	public void setMessageID(int messageID) {
		this.messageID = messageID;
	}
	public Employee getSource() {
		return source;
	}
	public void setSource(Employee source) {
		this.source = source;
	}
	public Employee getDestination() {
		return destination;
	}
	public void setDestination(Employee destination) {
		this.destination = destination;
	}
	public Request getRequest() {
		return request;
	}
	public void setRequest(Request request) {
		this.request = request;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	

}
