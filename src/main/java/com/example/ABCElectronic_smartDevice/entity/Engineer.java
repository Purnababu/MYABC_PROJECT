package com.example.ABCElectronic_smartDevice.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Engineer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int employeeid;
	private String password;
	private String engineername;
	private String domain;
	@OneToMany(cascade = CascadeType.MERGE, fetch = FetchType.LAZY, mappedBy = "engineer")
	private List<Complaint> complaints;
	public int getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEngineername() {
		return engineername;
	}
	public void setEngineername(String engineername) {
		this.engineername = engineername;
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
		this.employeeid = employeeid;
		this.password = password;
		this.engineername = engineername;
		this.domain = domain;
		this.complaints = complaints;
	}
	public Engineer() {
		super();
	}
	@Override
	public String toString() {
		return "Engineer [employeeid=" + employeeid + ", password=" + password + ", engineername=" + engineername
				+ ", domain=" + domain + ", complaints=" + complaints + "]";
	}
	
}
