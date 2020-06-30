package com.pms.model;

public class SkilledEmployee {
	private Integer skilledStaffID;
	private String  skilledstaffName;
	private String phoneNumber;
	private String availableDays;
	private String designation;
	public String getSkilledstaffName() {
		return skilledstaffName;
	}
	public void setSkilledstaffName(String skilledstaffName) {
		this.skilledstaffName = skilledstaffName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getAvailableDays() {
		return availableDays;
	}
	public void setAvailableDays(String availableDays) {
		this.availableDays = availableDays;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public Integer getSkilledStaffID() {
		return skilledStaffID;
	}
	public void setSkilledStaffID(Integer skilledStaffID) {
		this.skilledStaffID = skilledStaffID;
	}

}
