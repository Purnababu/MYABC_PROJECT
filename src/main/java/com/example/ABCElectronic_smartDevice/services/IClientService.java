package com.example.ABCElectronic_smartDevice.services;

import java.util.List;

import com.example.ABCElectronic_smartDevice.entity.Client;
import com.example.ABCElectronic_smartDevice.entity.Engineer;

public interface IClientService {
	
	public void saveClient(Client client);
	public Client getClientByCLientId(int clientId);
	public Engineer getEngineerById(int engineerId );
	public List<Engineer> getEngineerByDomain(String domain);
	public String changestatusOfcomplaint(int complaintId );
	public Client signIn(Client client);
	public Client signOut(Client client);
	



}
