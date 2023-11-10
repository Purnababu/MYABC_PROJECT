package com.example.ABCElectronic_smartDevice.service.impl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ABCElectronic_smartDevice.entity.Complaint;
import com.example.ABCElectronic_smartDevice.entity.Engineer;
import com.example.ABCElectronic_smartDevice.entity.Product;
import com.example.ABCElectronic_smartDevice.exceptions.InValidModelNumberException;
import com.example.ABCElectronic_smartDevice.exceptions.OutOfWarrantyException;
import com.example.ABCElectronic_smartDevice.exceptions.ResourceNotFoundException;
import com.example.ABCElectronic_smartDevice.repository.IComplaintRepository;
import com.example.ABCElectronic_smartDevice.repository.IEngineerRepository;
import com.example.ABCElectronic_smartDevice.repository.IProductRepository;
import com.example.ABCElectronic_smartDevice.services.IProductService;

@Service
public class IProductServiceImpl implements IProductService {
	@Autowired
	private IProductRepository productRepository;
	@Autowired
	private IComplaintRepository complaintRepository;
	@Autowired
	private IEngineerRepository engineerRepository;

	@Override
	public void addProduct(Product product) throws ResourceNotFoundException {
		Optional<Product> existproduct = productRepository.findById(product.getModelNumber());
		if (existproduct.isPresent()) {
			throw new ResourceNotFoundException("product modelnumber already exist.......");
		} else {
			product.setDateOfPurchase(LocalDate.now());
			product.setWarrantyDate(LocalDate.of(2026, 8, 1));
			productRepository.save(product);
		}
	}

	@Override
	public void removeProducts(int modelNumber) throws ResourceNotFoundException {
		Product mnum = productRepository.findById(modelNumber)
				.orElseThrow(() -> new ResourceNotFoundException("modelnumber not found:" + modelNumber));
		productRepository.delete(mnum);
	}

	@Override
	public List<Product> getProduct(int modelNumber) throws InValidModelNumberException {
		Product product1 = productRepository.findById(modelNumber)
				.orElseThrow(() -> new InValidModelNumberException("modelnumber not found exception:" + modelNumber));
		 List<Product> productList = new ArrayList<>();
		    productList.add(product1);

		    return productList;

	}
	
	@Override
	public void updateProductWarrenty(Product product) throws OutOfWarrantyException {
		Product Pwarnty= productRepository.findById(product.getModelNumber())
				.orElseThrow(() -> new OutOfWarrantyException("out of warranty exception:" + product.getModelNumber()));
		Pwarnty.setWarrantyDate(product.getWarrantyDate());
		productRepository.save(Pwarnty);
	}

	@Override
	public Engineer getEngineerByProduct(int modelNumber) throws ResourceNotFoundException {

		
		  Product product = productRepository.findById(modelNumber)
		  .orElseThrow(() -> new ResourceNotFoundException("Product not found: " +
		  modelNumber));
		  
		 Engineer engineers = product.getEngineer();
		  
		  if(engineers==null) { throw new
		  ResourceNotFoundException("No engineers found for product: " + modelNumber);
		  }
		 
	    return engineers;
	}

	@Override
	public List<Complaint> getProductComplients(int modelNumber) throws InValidModelNumberException {
	
		Product product = productRepository.findById(modelNumber)
				.orElseThrow(() -> new InValidModelNumberException("modelnumber not found exception:" + modelNumber));
		List<Complaint> complaints = product.getComplaints();

	    if (complaints.isEmpty()) {
	        throw new InValidModelNumberException("No complaints found for model number: " + modelNumber);
	    }

	    return complaints;
	}
	}

	
		
	



