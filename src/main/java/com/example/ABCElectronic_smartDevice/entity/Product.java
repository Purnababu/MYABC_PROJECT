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
	private LocalDate warrantyDate;
	private int warrantyYear;

	@OneToMany(cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
	private List<Complaint> complaints;
	@OneToOne(cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
	private Engineer engineer;
	public int getModelNumber() {
		return modelNumber;
	}
	public void setModelNumber(int modelNumber) {
		this.modelNumber = modelNumber;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductCategoryName() {
		return productCategoryName;
	}
	public void setProductCategoryName(String productCategoryName) {
		this.productCategoryName = productCategoryName;
	}
	public LocalDate getDateOfPurchase() {
		return dateOfPurchase;
	}
	public void setDateOfPurchase(LocalDate dateOfPurchase) {
		this.dateOfPurchase = dateOfPurchase;
	}
	public LocalDate getWarrantyDate() {
		return warrantyDate;
	}
	public void setWarrantyDate(LocalDate warrantyDate) {
		this.warrantyDate = warrantyDate;
	}
	public int getWarrantyYear() {
		return warrantyYear;
	}
	public void setWarrantyYear(int warrantyYear) {
		this.warrantyYear = warrantyYear;
	}
	public List<Complaint> getComplaints() {
		return complaints;
	}
	public void setComplaints(List<Complaint> complaints) {
		this.complaints = complaints;
	}
	public Engineer getEngineer() {
		return engineer;
	}
	public void setEngineer(Engineer engineer) {
		this.engineer = engineer;
	}
	public Product(int modelNumber, String productName, String productCategoryName, LocalDate dateOfPurchase,
			LocalDate warrantyDate, int warrantyYear, List<Complaint> complaints, Engineer engineer) {
		super();
		this.modelNumber = modelNumber;
		this.productName = productName;
		this.productCategoryName = productCategoryName;
		this.dateOfPurchase = dateOfPurchase;
		this.warrantyDate = warrantyDate;
		this.warrantyYear = warrantyYear;
		this.complaints = complaints;
		this.engineer = engineer;
	}
	public Product() {
		super();
	}

	
	

	
	}

