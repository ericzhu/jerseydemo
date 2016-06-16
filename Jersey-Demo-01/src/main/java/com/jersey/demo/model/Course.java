package com.jersey.demo.model;


public class Course {

	private String description;
	private int duration;

	public Course() {
	}
	
	public Course(String description, int duration) {
		super();
		this.description = description;
		this.duration = duration;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

}
