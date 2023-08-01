package com.deeksy.CareBook.classes;

import java.sql.Date;
import java.sql.Time;

public class Appoinment {
	private int pId;
	private int dId;
	private Date date;
	private Time time;
	private String type;
	private String symptoms;
	private String status;
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public int getdId() {
		return dId;
	}
	public void setdId(int dId) {
		this.dId = dId;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Time getTime() {
		return time;
	}
	public void setTime(Time time) {
		this.time = time;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getSymptoms() {
		return symptoms;
	}
	public void setSymptoms(String symptoms) {
		this.symptoms = symptoms;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Appoinment(int pId, int dId, Date date, Time time, String type, String symptoms, String status) {
		super();
		this.pId = pId;
		this.dId = dId;
		this.date = date;
		this.time = time;
		this.type = type;
		this.symptoms = symptoms;
		this.status = status;
	}
	
	
	
}
