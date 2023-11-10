package com.example.ABCElectronic_smartDevice.services;

import java.util.List;

import com.example.ABCElectronic_smartDevice.entity.Client;
import com.example.ABCElectronic_smartDevice.entity.Complaint;
import com.example.ABCElectronic_smartDevice.entity.Engineer;
import com.example.ABCElectronic_smartDevice.exceptions.InValidComplaintIdException;
import com.example.ABCElectronic_smartDevice.exceptions.InValidDomainException;
import com.example.ABCElectronic_smartDevice.exceptions.InValidEngineerIdException;
import com.example.ABCElectronic_smartDevice.exceptions.ResourceNotFoundException;

public interface IClientService 
{
	public void saveClient(Client client) throws ResourceNotFoundException;
	
	public Client getClientByClientId(int clientId) throws ResourceNotFoundException;
	
	public Engineer getEngineerById(int engineerId) throws InValidEngineerIdException;
	
	public List<Engineer> getEngineerByDomains(String domain) throws InValidDomainException;
	
	public String changeStatusOfComplaint(Complaint complaint) throws InValidComplaintIdException;
	
	public Client signIn(Client client);
	
	public Client signOut(Client client);
}
