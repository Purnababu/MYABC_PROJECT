package com.example.ABCElectronic_smartDevice.services;

import java.util.List;
import com.example.ABCElectronic_smartDevice.entity.Client;
import com.example.ABCElectronic_smartDevice.entity.Complaint;
import com.example.ABCElectronic_smartDevice.entity.Engineer;
import com.example.ABCElectronic_smartDevice.entity.Product;
import com.example.ABCElectronic_smartDevice.exceptions.ResourceNotFoundException;

public interface IComplaintService 
{
	public boolean bookComplaint(int clientId, Complaint complaint, int modelNumber);
	
	public String changeComplaintStatus(Complaint complaint);
	
	public List<Complaint> getClientAllComplaints(Client client) throws ResourceNotFoundException;
	
	public List<Complaint> getClientAllOpenComplaints(Client client);
	
	public Engineer getEngineer(int engineerId) throws ResourceNotFoundException;
	
	public Product getProductByComplaint(int complaintId);

}
