package com.example.ABCElectronic_smartDevice.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
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
	private String modelnumber;
	private String productname;
	private String productcategoryname;
	private LocalDate dateofpurchase;
	private LocalDate warrantydate;
	private int warrantyyear;
	@OneToMany
	private List<Complaint> complaints;
	public String getModelnumber() {
		return modelnumber;
	}
	public void setModelnumber(String modelnumber) {
		this.modelnumber = modelnumber;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public String getProductcategoryname() {
		return productcategoryname;
	}
	public void setProductcategoryname(String productcategoryname) {
		this.productcategoryname = productcategoryname;
	}
	public LocalDate getDateofpurchase() {
		return dateofpurchase;
	}
	public void setDateofpurchase(LocalDate dateofpurchase) {
		this.dateofpurchase = dateofpurchase;
	}
	public LocalDate getWarrantydate() {
		return warrantydate;
	}
	public void setWarrantydate(LocalDate warrantydate) {
		this.warrantydate = warrantydate;
	}
	public int getWarrantyyear() {
		return warrantyyear;
	}
	public void setWarrantyyear(int warrantyyear) {
		this.warrantyyear = warrantyyear;
	}
	
	
	public Product(String modelnumber, String productname, String productcategoryname, LocalDate dateofpurchase,
			LocalDate warrantydate, int warrantyyear, Client client) {
		super();
		this.modelnumber = modelnumber;
		this.productname = productname;
		this.productcategoryname = productcategoryname;
		this.dateofpurchase = dateofpurchase;
		this.warrantydate = warrantydate;
		this.warrantyyear = warrantyyear;
		
	
	}
	public List<Complaint> getComplaints() {
		return complaints;
	}
	public void setComplaints(List<Complaint> complaints) {
		this.complaints = complaints;
	}
	public Product(List<Complaint> complaints) {
		super();
		this.complaints = complaints;
	}
	public Product() {
		super();
	}
	@Override
	public String toString() {
		return "Product [modelnumber=" + modelnumber + ", productname=" + productname + ", productcategoryname="
				+ productcategoryname + ", dateofpurchase=" + dateofpurchase + ", warrantydate=" + warrantydate
				+ ", warrantyyear=" + warrantyyear + ", complaints=" + complaints + "]";
	}
	
	}
	
