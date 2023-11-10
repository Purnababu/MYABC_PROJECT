package com.example.ABCElectronic_smartDevice.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Admin 
{	  
	@Id
	private int adminId;
	private String password;
	private long contactNumber;
	private String emailId;	
}
