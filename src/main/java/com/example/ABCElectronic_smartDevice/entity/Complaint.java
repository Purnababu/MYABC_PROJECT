package com.example.ABCElectronic_smartDevice.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Complaint {

	@Id
	private int complaintId;

	private String complaintName;
	private String status;
	@ManyToOne
	private Engineer engineer;

	
	 @ManyToOne 
	 private Client client;
	  
	/* @ManyToOne
	 private Product produ*/
	 
	public int getComplaintid() {
		return complaintId;
	}

	public void setComplaintid(int complaintid) {
		this.complaintId = complaintid;
	}

	public String getComplaintName() {
		return complaintName;
	}

	public void setComplaintName(String complaintName) {
		this.complaintName = complaintName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Engineer getEngineer() {
		return engineer;
	}

	public void setEngineer(Engineer engineer) {
		this.engineer = engineer;
	}

	
	 // public Client getClient() { return client; }
	  
//	  public void setClient(Client client) { this.client = client; }
	 

	public Complaint(int complaintid, String complaintName, String status, Engineer engineer, Client client) {
		super();
		this.complaintId = complaintid;
		this.complaintName = complaintName;
		this.status = status;
		this.engineer = engineer;
	//	this.client = client;

	}

	
	public Complaint() {
		super();
	}

	

	

}
