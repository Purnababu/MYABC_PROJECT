package com.example.ABCElectronic_smartDevice.services;

import java.util.List;

import com.example.ABCElectronic_smartDevice.entity.Client;
import com.example.ABCElectronic_smartDevice.entity.Complaint;
import com.example.ABCElectronic_smartDevice.entity.Engineer;
import com.example.ABCElectronic_smartDevice.entity.Product;

public interface IComplaintService 
{
	public boolean bookComplaint(int clientId, Complaint complaint, int modelNumber);
	
	public String changeComplaintStatus(Complaint complaint);
	
	public List<Complaint> getClientAllComplaints(Client client);
	
	public List<Complaint> getClientAllOpenComplaints(Client client);
	
	public Engineer getEngineer(int engineerId);
	
	public Product getProductByComplaint(int complaintId);
}
