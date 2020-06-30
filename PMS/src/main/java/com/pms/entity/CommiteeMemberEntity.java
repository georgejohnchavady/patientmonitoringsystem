package com.pms.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "commitee_member")
public class CommiteeMemberEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer commiteeMember_id;
	private String commiteeMember_name;
	private Integer wardNumber;
	private String phoneNumber;
	private LocalDate createdDate;
	private LocalDate modifiedDate;
	private Integer modifiedBy;
	private Integer createdBy;
	
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
	public Integer getCommiteeMember_id() {
		return commiteeMember_id;
	}
	public void setCommiteeMember_id(Integer commiteeMember_id) {
		this.commiteeMember_id = commiteeMember_id;
	}
	public String getCommiteeMember_name() {
		return commiteeMember_name;
	}
	public void setCommiteeMember_name(String commiteeMember_name) {
		this.commiteeMember_name = commiteeMember_name;
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
	


}
