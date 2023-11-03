package com.example.ABCElectronic_smartDevice.services;

import java.util.List;

import com.example.ABCElectronic_smartDevice.entity.Complaint;
import com.example.ABCElectronic_smartDevice.entity.Engineer;
import com.example.ABCElectronic_smartDevice.entity.Product;

public interface IProductService {

	public void addProduct(Product product);

	public void removeProducts(String  modelNumber);

	public List<Product> getProduct(String modelNumber);

	public void updateProductWarranty(String  modelNumber);

	public List<Engineer> getEngineersByProduct(int productId);
	public List<Complaint> getEngineersByProduct(String producName);

}
