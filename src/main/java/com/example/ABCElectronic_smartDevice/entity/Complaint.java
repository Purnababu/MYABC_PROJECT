package com.example.ABCElectronic_smartDevice.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
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
	@GeneratedValue
	private int complaintId;
	private String productModelNumber;
	private String complaintName;
	private String status;
	@OneToOne(cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
	private Engineer engineer;
	@OneToOne(cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
	private Client client;

}
