package com.example.ABCElectronic_smartDevice.services;

import java.util.List;
import com.example.ABCElectronic_smartDevice.entity.Complaint;
import com.example.ABCElectronic_smartDevice.entity.Engineer;
import com.example.ABCElectronic_smartDevice.entity.Product;

public interface IProductService 
{
	public void addProduct(Product product);
	
	public void removeProduct(String modelNumber);
	
	public List<Product> getProducts(String modelNumber);
	
	public void updateProductWarranty(String modelNumber);
	
	public List<Complaint> getProductComplaints(String productName);
	
	public List<Engineer> getEngineersByProduct(String productName);

}
