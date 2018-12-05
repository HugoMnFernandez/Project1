package com.revature.domain;

import java.sql.Date;

public class File {
	private int fileID;
	private Request request;
	private java.io.File file;
	private String description;
	private Date uploadDate;
	
	public File(int fileID, Request request, java.io.File file, String description, Date uploadDate) {
		super();
		this.fileID = fileID;
		this.request = request;
		this.file = file;
		this.description = description;
		this.uploadDate = uploadDate;
	}
	
	
	public int getFileID() {
		return fileID;
	}
	public void setFileID(int fileID) {
		this.fileID = fileID;
	}
	public Request getRequest() {
		return request;
	}
	public void setRequest(Request request) {
		this.request = request;
	}
	public java.io.File getFile() {
		return file;
	}
	public void setFile(java.io.File file) {
		this.file = file;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getUploadDate() {
		return uploadDate;
	}
	public void setUploadDate(Date uploadDate) {
		this.uploadDate = uploadDate;
	}
	
	
	
	
	

}
