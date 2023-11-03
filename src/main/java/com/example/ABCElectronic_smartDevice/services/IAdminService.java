package com.example.ABCElectronic_smartDevice.services;


import java.util.List;

import com.example.ABCElectronic_smartDevice.entity.Complaint;
import com.example.ABCElectronic_smartDevice.entity.Engineer;
import com.example.ABCElectronic_smartDevice.exceptions.InValidComplaintIdException;
import com.example.ABCElectronic_smartDevice.exceptions.InValidEngineerIdException;
import com.example.ABCElectronic_smartDevice.exceptions.InValidModelNumberException;
import com.example.ABCElectronic_smartDevice.exceptions.ResourceNotFoundException;

public interface IAdminService 
{
	public void addEngineer(Engineer engineer) throws ResourceNotFoundException;
	
	public void changeDomain(int engineerId,String domain) throws InValidEngineerIdException;
	
	public void removeEngineer(int engineerId) throws InValidEngineerIdException;
	
	public List<Complaint> getComplaintsByProducts(int modelNumber) throws InValidModelNumberException, ResourceNotFoundException;
	
	public List<Complaint> getComplaints(String complaintName, int modelNumber) throws InValidModelNumberException, ResourceNotFoundException;
	
	public Complaint replaceEngineerFromComplaint(int complaintId) throws InValidComplaintIdException;
}
