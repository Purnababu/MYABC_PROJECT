package com.example.ABCElectronic_smartDevice.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Client {

	@Id
	private int clientId;
	private String password;
	private String address;
	private long phoneNumber;
	@OneToOne(cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
	private Product product;

	@OneToMany(cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
	private List<Complaint> complaints;

	public int getClientid() {
		return clientId;
	}

	public void setClientid(int clientid) {
		this.clientId = clientid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getPhonenumber() {
		return phoneNumber;
	}

	public void setPhonenumber(long phonenumber) {
		this.phoneNumber = phonenumber;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public List<Complaint> getComplaint() {
		return getComplaint();
	}

	public void setComplaint(List<Complaint> complaint) {
		this.complaints = complaint;
	}

	public Client(int clientid, String password, String address, long phonenumber, Product product,
			List<Complaint> complaint) {
		super();
		this.clientId = clientid;
		this.password = password;
		this.address = address;
		this.phoneNumber = phonenumber;
		this.product = product;
		this.complaints = complaint;
	}

	public Client() {
		super();
	}

	

}
