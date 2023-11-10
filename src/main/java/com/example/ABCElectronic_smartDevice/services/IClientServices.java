package com.example.ABCElectronic_smartDevice.services;

import java.util.List;

import com.example.ABCElectronic_smartDevice.entity.Complaint;
import com.example.ABCElectronic_smartDevice.entity.Engineer;

import ch.qos.logback.core.net.server.Client;

public interface IClientServices {
	public void saveClient(Client client);

	public Client getClientByClientid(int clientId);

	public Engineer getEngineerByid(int engineerId);

	public List<Engineer> getEngineerByDomain(String domin);

	public String changeStatusofComplient(Complaint complaint);

	public Client SignOut(Client client);

	public Client SignIn(Client client);

}
