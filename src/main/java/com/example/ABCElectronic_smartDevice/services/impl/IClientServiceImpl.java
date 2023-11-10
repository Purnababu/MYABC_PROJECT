package com.example.ABCElectronic_smartDevice.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ABCElectronic_smartDevice.entity.Client;
import com.example.ABCElectronic_smartDevice.entity.Complaint;
import com.example.ABCElectronic_smartDevice.entity.Engineer;
import com.example.ABCElectronic_smartDevice.exceptions.InValidComplaintIdException;
import com.example.ABCElectronic_smartDevice.exceptions.InValidDomainException;
import com.example.ABCElectronic_smartDevice.exceptions.InValidEngineerIdException;
import com.example.ABCElectronic_smartDevice.exceptions.ResourceNotFoundException;
import com.example.ABCElectronic_smartDevice.repository.IClientRepository;
import com.example.ABCElectronic_smartDevice.repository.IComplaintRepository;
import com.example.ABCElectronic_smartDevice.repository.IEngineerRepository;
import com.example.ABCElectronic_smartDevice.services.IClientService;

@Service
public class IClientServiceImpl implements IClientService
{
	@Autowired
	IClientRepository clientRepository;
	
	@Autowired
	IEngineerRepository engineerRepository;
	
	@Autowired
	IComplaintRepository complaintRepository;
	
	@Override
	public void saveClient(Client client) throws ResourceNotFoundException
	{
		Optional<Client> id = clientRepository.findById(client.getClientId());
		if(id.isPresent())
		{
			throw new ResourceNotFoundException("Id Already Exists with :"+id);
		}
		else
		{
			clientRepository.save(client);
		}
	}

	@Override
	public Client getClientByClientId(int clientId) throws ResourceNotFoundException 
	{
		return clientRepository.findById(clientId).orElseThrow(()-> 
				new ResourceNotFoundException("Client Id doesnot exists with Id :"+clientId));
	}

	@Override
	public Engineer getEngineerById(int engineerId) throws InValidEngineerIdException 
	{
		Engineer id = engineerRepository.findById(engineerId).orElseThrow(()-> 
				new InValidEngineerIdException("Engineer Id doesnot exists with Id :"+engineerId));
		return id;
	}

	@Override
	public List<Engineer> getEngineerByDomains(String domain) throws InValidDomainException 
	{
		List<Engineer> engineersByDomain = engineerRepository.getEngineersByDomain(domain);
		if(engineersByDomain.isEmpty()) {throw new InValidDomainException("No Engineers Found..!!!");}
		return engineersByDomain;
	}

	@Override
	public String changeStatusOfComplaint(Complaint complaint) throws InValidComplaintIdException 
	{
		Complaint cId = complaintRepository.findById(complaint.getComplaintId()).orElseThrow(()-> 
					new InValidComplaintIdException("Complaint Id doesnot exists..!!"));		
		cId.setStatus(complaint.getStatus());
		complaintRepository.save(cId);
		return cId.getStatus();
	}

	@Override
	public Client signIn(Client client) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Client signOut(Client client) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
