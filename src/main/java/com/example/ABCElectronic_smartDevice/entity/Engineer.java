package com.example.ABCElectronic_smartDevice.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Engineer {

	@Id

	private int employeeId;
	private String password;
	private String engineerName;
	private String domain;
	@OneToMany(cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
	private List<Complaint> complaints;

	public int getEmployeeid() {
		return employeeId;
	}

	public void setEmployeeid(int employeeid) {
		this.employeeId = employeeid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEngineername() {
		return engineerName;
	}

	public void setEngineername(String engineername) {
		this.engineerName = engineername;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public List<Complaint> getComplaints() {
		return complaints;
	}

	public void setComplaints(List<Complaint> complaints) {
		this.complaints = complaints;
	}

	public Engineer(int employeeid, String password, String engineername, String domain, List<Complaint> complaints) {
		super();
		this.employeeId = employeeid;
		this.password = password;
		this.engineerName = engineername;
		this.domain = domain;
		this.complaints = complaints;
	}

	public Engineer() {
		super();
	}

	
}
