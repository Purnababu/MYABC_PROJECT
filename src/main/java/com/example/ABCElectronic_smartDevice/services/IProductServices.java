package com.example.ABCElectronic_smartDevice.services;

import java.util.List;

import com.example.ABCElectronic_smartDevice.entity.Complaint;
import com.example.ABCElectronic_smartDevice.entity.Engineer;
import com.example.ABCElectronic_smartDevice.entity.Product;
import com.example.ABCElectronic_smartDevice.exceptions.InValidModelNumberException;
import com.example.ABCElectronic_smartDevice.exceptions.OutOfWarrantyException;
import com.example.ABCElectronic_smartDevice.exceptions.ProductAllreadyExistException;
import com.example.ABCElectronic_smartDevice.exceptions.ResourceNotFoundException;

public interface IProductServices {

	
		public void addproduct(Product product) throws  ResourceNotFoundException;

		public void removeProducts(String modelnumber) throws ResourceNotFoundException ;

		public List<Product> getProduct(String modelnumber) throws InValidModelNumberException ;

		public List<Complaint> getProductComplients(String modelnumber) throws InValidModelNumberException;

		public void updateProductWarrenty(String productname) throws OutOfWarrantyException;

		public List<Engineer> getEngineerByProduct(String productname) throws ResourceNotFoundException;

		
	}
