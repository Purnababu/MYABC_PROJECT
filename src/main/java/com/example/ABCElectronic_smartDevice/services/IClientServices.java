package com.example.ABCElectronic_smartDevice.services;

import java.util.List;

import com.example.ABCElectronic_smartDevice.entity.Engineer;

import ch.qos.logback.core.net.server.Client;

public interface IClientServices {
	public void saveClient(Client client);

	public Client getClientByClientid(String clientid);

	public Engineer getEngineerByid(int engineerid);

	public List<Engineer> getEngineerByDomain(String domin);

	public String changeStatusofComplient(int complientid);

	public Client SignOut(Client client);

	public Client SignIn(Client client);

}
