package com.example.ABCElectronic_smartDevice.services;

import java.util.List;

import com.example.ABCElectronic_smartDevice.entity.Client;
import com.example.ABCElectronic_smartDevice.entity.Engineer;

public interface IClientService 
{
	public void saveClient(Client client);
	
	public Client getClientByClientId(String clientId);
	
	public Engineer getEngineerById(int engineerId);
	
	public List<Engineer> getEngineerByDomains(String domain);
	
	public String changeStatusOfComplaint(int complaintId);
	
	public Client signIn(Client client);
	
	public Client signOut(Client client);
}
