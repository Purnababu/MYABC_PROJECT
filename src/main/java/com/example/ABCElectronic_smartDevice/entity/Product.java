package com.example.ABCElectronic_smartDevice.entity;

import java.time.LocalDate;
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
public class Product {
	@Id
	private int modelNumber;
	private String productName;
	private String productCategoryName;
	private LocalDate dateOfPurchase;
	private int warrantyYears;
	private LocalDate warrantyDate;

	@OneToMany(cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
	private List<Complaint> complaints;

	@OneToOne(cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
	private Engineer engineer;

}
