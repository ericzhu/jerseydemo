package com.jersey.demo.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Activity {

	private String description;
	private int duration;

	public Activity() {
	}
	
	public Activity(String description, int duration) {
		super();
		this.description = description;
		this.duration = duration;
	}

	@XmlElement(name="desc")
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
