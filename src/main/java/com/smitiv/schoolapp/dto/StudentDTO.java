package com.smitiv.schoolapp.dto;

import java.io.Serializable;

public class StudentDTO implements Serializable {

	private Long stEnroll;
	private String stName;
	private String stAddress;
	private String branch;
	private String phNo;
	public Long getStEnroll() {
		return stEnroll;
	}
	public void setStEnroll(Long stEnroll) {
		this.stEnroll = stEnroll;
	}
	public String getStName() {
		return stName;
	}
	public void setStName(String stName) {
		this.stName = stName;
	}
	public String getStAddress() {
		return stAddress;
	}
	public void setStAddress(String stAddress) {
		this.stAddress = stAddress;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getPhNo() {
		return phNo;
	}
	public void setPhNo(String phNo) {
		this.phNo = phNo;
	}
	
	
	@Override
	public String toString() {
		return "StudentDTO [stEnroll=" + stEnroll + ", stName=" + stName + ", stAddress=" + stAddress + ", branch="
				+ branch + ", phNo=" + phNo + "]";
	}
	
	
}
