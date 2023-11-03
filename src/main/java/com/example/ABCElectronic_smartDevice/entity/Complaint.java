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
	private int complaintId;

	private String complaintName;
	private String status;

	@ManyToOne()
	private Engineer engineer;

	@ManyToOne()
	private Client client;

	@OneToOne(cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
	private Product product;

}
