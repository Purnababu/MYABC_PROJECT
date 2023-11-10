package com.example.ABCElectronic_smartDevice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ABCElectronic_smartDevice.entity.Client;
import com.example.ABCElectronic_smartDevice.entity.Complaint;
import com.example.ABCElectronic_smartDevice.entity.Engineer;
import com.example.ABCElectronic_smartDevice.services.IClientService;

@RestController
@RequestMapping("/api/client")
public class ClientController 
{
	@Autowired
	private IClientService clientService;
	
	@PostMapping("/addClient")
	public void saveClient(@RequestBody Client client) throws Exception
	{
		if(client==null) {throw new Exception("Client Object is Empty");}
		else {clientService.saveClient(client);}
	}
	
	@GetMapping("/getClient/{clientId}")
	public ResponseEntity<Client> getClientByClientId(@PathVariable int clientId) throws Exception
	{
		if(clientId==0) {throw new Exception("Client id cant be Zero..!!!");}
		else {return new ResponseEntity<>(clientService.getClientByClientId(clientId),HttpStatus.OK);}
	}
	
	@GetMapping("/getEngineer/{engineerId}")
	public ResponseEntity<Engineer> getEngineerById(@PathVariable int engineerId) throws Exception
	{
		if(engineerId==0) {throw new Exception("Engineer Id cant be Zero");}
		else {return new ResponseEntity<>(clientService.getEngineerById(engineerId),HttpStatus.OK);}
	}
	
	@GetMapping("/getEngineerByDomain/{domain}")
	public ResponseEntity<List<Engineer>> getEngineerByDomains(@PathVariable String domain) throws Exception
	{
		if(domain==null) {throw new Exception("Domain cant be Empty");}
		else {return new ResponseEntity<>(clientService.getEngineerByDomains(domain),HttpStatus.OK);}
	}
	
	@PutMapping("/changeStatus")
	public ResponseEntity<String> changeStatusOfComplaint(@RequestBody Complaint complaint) throws Exception
	{
		if(complaint==null) {throw new Exception("Complaint Object cant be Null");}
		else {return new ResponseEntity<>(clientService.changeStatusOfComplaint(complaint),HttpStatus.OK);}
	}
}
