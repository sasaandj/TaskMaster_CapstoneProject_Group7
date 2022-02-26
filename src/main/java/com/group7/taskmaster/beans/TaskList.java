package com.group7.taskmaster.beans;

import java.util.Date;

public abstract class TaskList {
	
	private int listID; 
	private String listName;
	private String listDescription;
	private Date listCreatedDate;
	
	public TaskList() { 
		
	}
	
	public TaskList(int listID, String listName, String listDescription, Date listCreatedDate) { 
		this.listID = listID;
		this.listName = listName;
		this.listDescription = listDescription;
		this.listCreatedDate = listCreatedDate;
	}
	
	
	public int getListID() {
		return listID;
	}

	public void setListID(int listID) {
		this.listID = listID;
	}

	public String getListName() {
		return listName;
	}

	public void setListName(String listName) {
		this.listName = listName;
	}

	public String getListDescription() {
		return listDescription;
	}

	public void setListDescription(String listDescription) {
		this.listDescription = listDescription;
	}

	public Date getListCreatedDate() {
		return listCreatedDate;
	}

	public void setListCreatedDate(Date listCreatedDate) {
		this.listCreatedDate = listCreatedDate;
	}
	

}
