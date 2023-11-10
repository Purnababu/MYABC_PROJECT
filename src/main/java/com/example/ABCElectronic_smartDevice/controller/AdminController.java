package com.example.ABCElectronic_smartDevice.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ABCElectronic_smartDevice.entity.Complaint;
import com.example.ABCElectronic_smartDevice.entity.Engineer;
import com.example.ABCElectronic_smartDevice.services.IAdminService;

@RestController
@RequestMapping("/api/admin")
public class AdminController 
{
	@Autowired
	IAdminService adminService;
	
	@PostMapping("/addEngineer")
	public void addEngineer(@RequestBody Engineer engineer) throws Exception
	{
		if(engineer==null) {throw new Exception("Object is null");}
		else {adminService.addEngineer(engineer);}
	}
	
	@PutMapping("/changeDomain/{engineerId}/{domain}")
	public void changeDomain(@PathVariable int engineerId, String domain) throws Exception
	{
		if(engineerId==0) {throw new Exception("Engineer Id cant be Zero");}
		else {adminService.changeDomain(engineerId, domain);}
	}
	
	@DeleteMapping("/removeEngineer/{engineerId}")
	public void removeEngineer(@PathVariable int engineerId) throws Exception
	{
		if(engineerId==0) {throw new Exception("Engineer Id cant be Zero");}
		else {adminService.removeEngineer(engineerId);}
	}
	
	@GetMapping("/getComplaintsByProducts/{modelNumber}")
	public ResponseEntity<List<Complaint>> getComplaintsByProducts(@PathVariable int modelNumber) throws Exception
	{
		if(modelNumber==0) {throw new Exception("Model Number cant be Zero");}
		else {return new ResponseEntity<>(adminService.getComplaintsByProducts(modelNumber),HttpStatus.OK);}
	}
	
	@GetMapping("/getComplaints/{complaintName}/{modelNumber}")
	public ResponseEntity<List<Complaint>> getComplaints(@PathVariable String complaintName,@PathVariable int modelNumber) throws Exception
	{
		if(modelNumber==0) {throw new Exception("Model Number cant be Zero..!!");}
		else {return new ResponseEntity<>(adminService.getComplaints(complaintName, modelNumber),HttpStatus.OK);}
	}
	
	@DeleteMapping("/replaceEngineer/{complaintId}")
	public ResponseEntity<Complaint> replaceEngineerFromComplaint(@PathVariable int complaintId) throws Exception
	{
		if(complaintId==0) {throw new Exception("Complaint Id cant be Zero");}
		else {return new ResponseEntity<>(adminService.replaceEngineerFromComplaint(complaintId),HttpStatus.OK);}
	}
}
