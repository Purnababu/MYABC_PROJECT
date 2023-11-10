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

@RestController
@RequestMapping("/api/com")
public class ComplaintController {

	@Autowired
	private IComplaintService crs;

	@PostMapping("/bookcomplaint/{clientId}/{modelNumber}")
	public ResponseEntity<?> bookComplaint(@PathVariable int clientId, @RequestBody Complaint complaint,
			@PathVariable int modelNumber) throws ResourceNotFoundException {

		return new ResponseEntity<>(crs.bookComplaint(clientId, complaint, modelNumber), HttpStatus.CREATED);
	}

	@GetMapping("/viewcomplaints")
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