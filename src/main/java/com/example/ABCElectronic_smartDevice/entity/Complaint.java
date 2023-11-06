package com.example.ABCElectronic_smartDevice.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Complaint {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int complaintid;

	private String complaintName;
	private String status;
	@ManyToOne()
	private Engineer engineer;

	@ManyToOne()
	private Client client;

	@ManyToOne()
	private Product product;

	public int getComplaintid() {
		return complaintid;
	}

	public void setComplaintid(int complaintid) {
		this.complaintid = complaintid;
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

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Complaint(int complaintid, String complaintName, String status, Engineer engineer, Client client,
			Product product) {
		super();
		this.complaintid = complaintid;
		this.complaintName = complaintName;
		this.status = status;
		this.engineer = engineer;
		this.client = client;
		this.product = product;
	}

	public Complaint() {
		super();
	}

	@Override
	public String toString() {
		return "Complaint [complaintid=" + complaintid + ", complaintName=" + complaintName + ", status=" + status
				+ ", engineer=" + engineer + ", client=" + client + ", product=" + product + "]";
	}
	
}
