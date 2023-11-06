package com.example.ABCElectronic_smartDevice.services.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.ABCElectronic_smartDevice.entity.Complaint;
import com.example.ABCElectronic_smartDevice.entity.Engineer;
import com.example.ABCElectronic_smartDevice.entity.Product;
import com.example.ABCElectronic_smartDevice.exceptions.InValidModelNumberException;
import com.example.ABCElectronic_smartDevice.exceptions.OutOfWarrantyException;
import com.example.ABCElectronic_smartDevice.exceptions.ResourceNotFoundException;
import com.example.ABCElectronic_smartDevice.repository.IComplaintRepository;
import com.example.ABCElectronic_smartDevice.repository.IEngineerRepository;
import com.example.ABCElectronic_smartDevice.repository.IProductRepository;
import com.example.ABCElectronic_smartDevice.services.IProductServices;

@SuppressWarnings("unchecked")

public class IProductServiceImpl implements IProductServices {
	@Autowired
	private IProductRepository productrepository;
	@Autowired
	private IComplaintRepository complaintrepository;
	@Autowired
	private IEngineerRepository engineerrepository;

	@Override
	public void addproduct(Product product) throws ResourceNotFoundException {
		Optional<?> productname = productrepository.getProductByproductname(product.getProductname());
		if (productname.isPresent()) {
			throw new ResourceNotFoundException("product name already exist.......");
		} else {
			productrepository.save(product);
		}
	}

	@Override
	public void removeProducts(String modelnumber) throws ResourceNotFoundException {
		Product mnum = productrepository.getProductByModelnumber(modelnumber)
				.orElseThrow(() -> new ResourceNotFoundException("modelnumber not found:" + modelnumber));
		productrepository.delete(mnum);
	}

	@Override
	public List<Product> getProduct(String modelnumber) throws InValidModelNumberException {
		Product list1 = productrepository.getProductByModelnumber(modelnumber)
				.orElseThrow(() -> new InValidModelNumberException("modelnumber not found exception:" + modelnumber));
		return (List<Product>) productrepository.save(list1);

	}
	
	@Override
	public void updateProductWarrenty(String productname) throws OutOfWarrantyException {
		Product pwar = productrepository.getProductByproductname(productname)
				.orElseThrow(() -> new OutOfWarrantyException("out of warranty exception:" + productname));
		productrepository.save(pwar);
	}

	@Override
	public List<Engineer> getEngineerByProduct(String productname) throws ResourceNotFoundException {
		Product list3 = productrepository.getProductByproductname(productname)
				.orElseThrow(() -> new ResourceNotFoundException("product not found exception:" + productname));
		return (List<Engineer>) productrepository.save(list3);
		
	}

	@Override
	public List<Complaint> getProductComplients(String modelnumber) throws InValidModelNumberException {
	
		Product list2 = productrepository.getProductByModelnumber(modelnumber)
				.orElseThrow(() -> new InValidModelNumberException("modelnumber not found exception:" + modelnumber));
		return (List<Complaint>) productrepository.save(list2);
	}
	}

	
		
	

