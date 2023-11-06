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

	private String clientid;
	private String password;
	private String address;
	private long phonenumber;
	@OneToOne(cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
	private Product product;

	@OneToMany(cascade = CascadeType.MERGE, fetch = FetchType.LAZY, mappedBy = "client")
	private List<Complaint> complaint;

	public String getClientid() {
		return clientid;
	}

	public void setClientid(String clientid) {
		this.clientid = clientid;
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
		return phonenumber;
	}

	public void setPhonenumber(long phonenumber) {
		this.phonenumber = phonenumber;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public List<Complaint> getComplaint() {
		return complaint;
	}

	public void setComplaint(List<Complaint> complaint) {
		this.complaint = complaint;
	}

	public Client(String clientid, String password, String address, long phonenumber, Product product,
			List<Complaint> complaint) {
		super();
		this.clientid = clientid;
		this.password = password;
		this.address = address;
		this.phonenumber = phonenumber;
		this.product = product;
		this.complaint = complaint;
	}

	public Client() {
		super();
	}

	@Override
	public String toString() {
		return "Client [clientid=" + clientid + ", password=" + password + ", address=" + address + ", phonenumber="
				+ phonenumber + ", product=" + product + ", complaint=" + complaint + "]";
	}

}
