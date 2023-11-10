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

}
