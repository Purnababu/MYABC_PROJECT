package com.example.ABCElectronic_smartDevice.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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
	private int adminid;
	private String password;
	private long contactnumber;
	private String emailid;
	public int getAdminid() {
		return adminid;
	}
	public void setAdminid(int adminid) {
		this.adminid = adminid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public long getContactnumber() {
		return contactnumber;
	}
	public void setContactnumber(long contactnumber) {
		this.contactnumber = contactnumber;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public Admin(int adminid, String password, long contactnumber, String emailid) {
		super();
		this.adminid = adminid;
		this.password = password;
		this.contactnumber = contactnumber;
		this.emailid = emailid;
	}
	public Admin() {
		super();
	}
	@Override
	public String toString() {
		return "Admin [adminid=" + adminid + ", password=" + password + ", contactnumber=" + contactnumber
				+ ", emailid=" + emailid + "]";
	}

}
