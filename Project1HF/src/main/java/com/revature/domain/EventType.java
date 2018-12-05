package com.revature.domain;

public class EventType {
	private int eventID;
	private String eventName;
	private int coverage;
	private String gradingFormat;
	
	public EventType(int eventID, String eventName, int coverage, String gradingFormat) {
		super();
		this.eventID = eventID;
		this.eventName = eventName;
		this.coverage = coverage;
		this.gradingFormat = gradingFormat;
	}

	public int getEventID() {
		return eventID;
	}

	public void setEventID(int eventID) {
		this.eventID = eventID;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public int getCoverage() {
		return coverage;
	}

	public void setCoverage(int coverage) {
		this.coverage = coverage;
	}

	public String getGradingFormat() {
		return gradingFormat;
	}

	public void setGradingFormat(String gradingFormat) {
		this.gradingFormat = gradingFormat;
	}
	
	
	
	
	
	
	

}
