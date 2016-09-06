package com.amex.itag.model;

public class ITagData {
	private long id;
	private String taskCreated;
	private String taskJson;
	private String taskStatus;

	public ITagData() {
	}

	public ITagData(long id) {
		this.id = id;
	}

	public ITagData(String taskCreated, String taskJson, String taskStatus) {
		this.taskCreated = taskCreated;
		this.taskJson = taskJson;
		this.taskStatus = taskStatus;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTaskCreated() {
		return taskCreated;
	}

	public void setTaskCreated(String taskCreated) {
		this.taskCreated = taskCreated;
	}

	public String getTaskJson() {
		return taskJson;
	}

	public void setTaskJson(String taskJson) {
		this.taskJson = taskJson;
	}

	public String getTaskStatus() {
		return taskStatus;
	}

	public void setTaskStatus(String taskStatus) {
		this.taskStatus = taskStatus;
	}
}
