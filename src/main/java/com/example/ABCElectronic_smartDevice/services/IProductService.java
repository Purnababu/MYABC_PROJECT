package com.example.ABCElectronic_smartDevice.services;

import java.util.List;
import com.example.ABCElectronic_smartDevice.entity.Complaint;
import com.example.ABCElectronic_smartDevice.entity.Engineer;
import com.example.ABCElectronic_smartDevice.entity.Product;

import com.example.ABCElectronic_smartDevice.exceptions.InValidModelNumberException;
import com.example.ABCElectronic_smartDevice.exceptions.OutOfWarrantyException;
import com.example.ABCElectronic_smartDevice.exceptions.ResourceNotFoundException;

public interface IProductService {

	public void addProduct(Product product) throws ResourceNotFoundException;

	public void removeProducts(int modelNumber) throws ResourceNotFoundException;

	public List<Product> getProduct(int modelNumber) throws InValidModelNumberException;

	public List<Complaint> getProductComplients(int modelNumber) throws InValidModelNumberException;

	public void updateProductWarrenty(Product product) throws OutOfWarrantyException;

	public Engineer getEngineerByProduct(int modelNumber) throws ResourceNotFoundException;
}
