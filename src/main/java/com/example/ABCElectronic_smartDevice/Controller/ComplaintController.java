package com.example.ABCElectronic_smartDevice.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ABCElectronic_smartDevice.entity.Client;
import com.example.ABCElectronic_smartDevice.entity.Complaint;
import com.example.ABCElectronic_smartDevice.entity.Engineer;
import com.example.ABCElectronic_smartDevice.entity.Product;
import com.example.ABCElectronic_smartDevice.exceptions.ResourceNotFoundException;
import com.example.ABCElectronic_smartDevice.services.IComplaintService;
import com.example.ABCElectronic_smartDevice.services.IEngineerService;

@RestController
@RequestMapping("/api/complaint")
public class ComplaintController {
    
	@Autowired
	private IComplaintService crs;

	@PostMapping("/api/bookcomplaint")
	public ResponseEntity<?> bookComplaint(@RequestBody Client client, Complaint complaint, Product product) {

		boolean b = crs.bookComplaint(client, complaint, product);
		return new ResponseEntity<>(b, HttpStatus.CREATED);
	}

	@GetMapping(value = "//viweall-complaints", produces = "application/json")
	public ResponseEntity<List<Complaint>> getClientAllComplaints(Client client) throws ResourceNotFoundException {
		return new ResponseEntity<List<Complaint>>(crs.getClientAllComplaints(client), HttpStatus.OK);
	}

	@GetMapping("/getengineer/{id}")
	public ResponseEntity<Engineer> getEngineer(@PathVariable int engineerId) throws Exception {
		if (engineerId == 0) {
			throw new Exception("enginerr id is invalid");
		}
		return new ResponseEntity<Engineer>(crs.getEngineer(engineerId), HttpStatus.OK);
	}

}