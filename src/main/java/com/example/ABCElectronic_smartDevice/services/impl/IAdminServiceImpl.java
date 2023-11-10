package com.example.ABCElectronic_smartDevice.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ABCElectronic_smartDevice.entity.Complaint;
import com.example.ABCElectronic_smartDevice.entity.Engineer;
import com.example.ABCElectronic_smartDevice.entity.Product;
import com.example.ABCElectronic_smartDevice.exceptions.InValidComplaintIdException;
import com.example.ABCElectronic_smartDevice.exceptions.InValidEngineerIdException;
import com.example.ABCElectronic_smartDevice.exceptions.InValidModelNumberException;
import com.example.ABCElectronic_smartDevice.exceptions.ResourceNotFoundException;
import com.example.ABCElectronic_smartDevice.repository.IComplaintRepository;
import com.example.ABCElectronic_smartDevice.repository.IEngineerRepository;
import com.example.ABCElectronic_smartDevice.repository.IProductRepository;
import com.example.ABCElectronic_smartDevice.services.IAdminService;

@Service
public class IAdminServiceImpl implements IAdminService
{
	@Autowired
	private IEngineerRepository engineerRepository;
	@Autowired
	private IComplaintRepository complaintRepository;
	@Autowired
	private IProductRepository productRepository;
	@Override
	public void addEngineer(Engineer engineer) throws ResourceNotFoundException 
	{
		Optional<?> engineerName = engineerRepository.getEngineerName(engineer.getEngineerName());
		if(engineerName.isPresent())
		{
			throw new ResourceNotFoundException("Engineer name already exists ...!!!");
		}
		else
		{
			engineerRepository.save(engineer);
		}
	}

	@Override
	public void changeDomain(int engineerId, String domain) throws InValidEngineerIdException 
	{
		Engineer eId = engineerRepository.findById(engineerId).orElseThrow(()-> 
					new InValidEngineerIdException("Engineer Id doesnot exists with Id :"+engineerId));
		eId.setDomain(domain);
		engineerRepository.save(eId);
	}

	@Override
	public void removeEngineer(int engineerId) throws InValidEngineerIdException 
	{
		Engineer eId = engineerRepository.findById(engineerId).orElseThrow(()-> 
					new InValidEngineerIdException("Engineer Id doesnot exists with Id:"+engineerId));	
		engineerRepository.delete(eId);
	}

	@Override
	public List<Complaint> getComplaintsByProducts(int modelNumber) throws InValidModelNumberException, ResourceNotFoundException 
	{
		Product pr = productRepository.findById(modelNumber).orElseThrow(()-> 
					new InValidModelNumberException("Model Number Doesnot exists...!!"));
		return pr.getComplaints();
	}

	@Override
	public List<Complaint> getComplaints(String complaintName, int modelNumber) throws InValidModelNumberException, ResourceNotFoundException
	{
		Product c = productRepository.findById(modelNumber).orElseThrow(()-> 
			new InValidModelNumberException("Model Number doesnot exists with :"+modelNumber));
		return c.getComplaints();
	}

	@Override
	public Complaint replaceEngineerFromComplaint(int complaintId) throws InValidComplaintIdException 
	{
		Complaint cId = complaintRepository.findById(complaintId).orElseThrow(()->
				new InValidComplaintIdException("Complaint Id doesnot Exists with Id :"+complaintId));
				/*
				 * complaintRepository.deleteById(cId.getEngineer().getEngineerId()); return
				 * cId;
				 */
		return null;
	}
	
}
