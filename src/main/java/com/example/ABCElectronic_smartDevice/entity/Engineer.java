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
public class Engineer {

	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int employeeId;
	private String password;
	private String engineerName;
	private String domain;
	
	
}
