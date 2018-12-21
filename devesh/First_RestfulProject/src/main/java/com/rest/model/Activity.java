package com.rest.model;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Activity {
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public String getActivityId() {
		return activityId;
	}
	public void setActivityId(String string) {
		this.activityId = string;
	}
	private String destination;
	private int duration;
	private String activityId;



}
