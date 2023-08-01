package com.deeksy.CareBook.classes;

import java.sql.Date;

public class Patient {

	private int uId;
	private String fname;
	private String lname;
	private Date dob;
	private int height;
	private int weight;
	private String gender;
	private String mobile;
	private String email;
	private String address;
	public int getuId() {
		return uId;
	}
	public void setuId(int uId) {
		this.uId = uId;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Patient(int uId, String fname, String lname, Date dob, int height, int weight, String gender, String mobile,
			String email, String address) {
		super();
		this.uId = uId;
		this.fname = fname;
		this.lname = lname;
		this.dob = dob;
		this.height = height;
		this.weight = weight;
		this.gender = gender;
		this.mobile = mobile;
		this.email = email;
		this.address = address;
	}
	
	
	
}
