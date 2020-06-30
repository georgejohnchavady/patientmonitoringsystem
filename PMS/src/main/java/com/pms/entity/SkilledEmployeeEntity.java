package com.pms.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "skilledemployee")
public class SkilledEmployeeEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer skilledstaffId;
	private String skilledstaffName;
	private String designation;
	private String phoneNumber;
	private String availableDays;
	private LocalDate createdDate;
	private LocalDate modifiedDate;
	private Integer modifiedBy;
	private Integer createdBy;
	public Integer getSkilledstaffId() {
		return skilledstaffId;
	}
	public String getSkilledstaffName() {
		return skilledstaffName;
	}
	public void setSkilledstaffName(String skilledstaffName) {
		this.skilledstaffName = skilledstaffName;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
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
	public LocalDate getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}
	public LocalDate getModifiedDate() {
		return modifiedDate;
	}
	public void setModifiedDate(LocalDate modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
	public Integer getModifiedBy() {
		return modifiedBy;
	}
	public void setModifiedBy(Integer modifiedBy) {
		this.modifiedBy = modifiedBy;
	}
	public Integer getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
	}
	public void setSkilledstaffId(Integer skilledstaffId) {
		this.skilledstaffId = skilledstaffId;
	}
	

}
