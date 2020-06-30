package com.pms.controller.model;

public class Patient {
	private Integer patientId;
	private String patientName;
	private Integer wardNumber;
	private String phoneNumber;
	private  String disease;
	public Integer getPatientId() {
		return patientId;
	}
	public void setPatientId(Integer patientId) {
		this.patientId = patientId;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public Integer getWardNumber() {
		return wardNumber;
	}
	public void setWardNumber(Integer wardNumber) {
		this.wardNumber = wardNumber;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getDisease() {
		return disease;
	}
	public void setDisease(String disease) {
		this.disease = disease;
	}

	
}
