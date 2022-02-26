package com.group7.taskmaster.beans;

import java.util.Date;

public class Task extends TaskList {
	
	private int taskID;
	private String taskName;
	private String taskStatus;
	private Date targetDate;
	

	public Task() {
		super();
	}
	
	
	public Task(int taskID, String taskName, String taskStatus, Date targetDate) { 
		this.taskID = taskID;
		this.taskName = taskName;
		this.taskStatus = taskStatus;
		this.targetDate = targetDate;
	}

	public int getTaskID() {
		return taskID;
	}

	public void setTaskID(int taskID) {
		this.taskID = taskID;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public String getTaskStatus() {
		return taskStatus;
	}

	public void setTaskStatus(String taskStatus) {
		this.taskStatus = taskStatus;
	}
	
	public Date getTargetDate() {
		return targetDate;
	}

	public void setTargetDate(Date targetDate) {
		this.targetDate = targetDate;
	}
}
