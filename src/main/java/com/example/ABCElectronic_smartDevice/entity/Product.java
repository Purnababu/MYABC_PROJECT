package com.example.ABCElectronic_smartDevice.entity;

import java.time.LocalDate;

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
public class Product {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int modelNumber;
	private String productName;
	private  String CategoryName ;
	private LocalDate  dateofPurchase;
	private int warrentyyears;
	private LocalDate warrantyDate;
	
	@OneToOne
	private Client client;
	
}
