package com.example.ABCElectronic_smartDevice.entity;

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

	private String clientId;
	private String password;
	private String address;
	private long phoneNumber;

	@OneToOne(cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
	private Product product;

	@OneToMany(cascade = CascadeType.MERGE, fetch = FetchType.LAZY, mappedBy = "client")
	private List<Complaint> complaints;


}
