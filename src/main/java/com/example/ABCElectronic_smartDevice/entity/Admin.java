package com.example.ABCElectronic_smartDevice.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Admin {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int adminId;
	private String password;
	private long contactNumber;
	private String emailId;
	@OneToOne
	private Product product;

	public int getAdminid() {
		return adminId;
	}
	public void setAdminid(int adminid) {
		this.adminId = adminid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public long getContactnumber() {
		return contactNumber;
	}
	public void setContactnumber(long contactnumber) {
		this.contactNumber = contactnumber;
	}
	public String getEmailid() {
		return emailId;
	}
	public void setEmailid(String emailid) {
		this.emailId = emailid;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public Admin(int adminid, String password, long contactnumber, String emailid, Product product) {
		super();
		this.adminId = adminid;
		this.password = password;
		this.contactNumber = contactnumber;
		this.emailId = emailid;
		this.product = product;
	}
	public Admin() {
		super();
	}
	
	
}