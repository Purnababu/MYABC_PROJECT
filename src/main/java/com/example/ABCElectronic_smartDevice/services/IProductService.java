package com.example.ABCElectronic_smartDevice.services;

import java.util.List;
import com.example.ABCElectronic_smartDevice.entity.Complaint;
import com.example.ABCElectronic_smartDevice.entity.Engineer;
import com.example.ABCElectronic_smartDevice.entity.Product;

public interface IProductService {

	public void addProduct(Product product);

	public void removeProducts(int modelNumber);

	public List<Product> getProduct(int modelNumber);

	public List<Complaint> getProductComplients(int modelNumber);

	public void updateProductWarrenty(Product product);

	public Engineer getEngineerByProduct(int modelNumber);

}
