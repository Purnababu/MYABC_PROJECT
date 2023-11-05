package com.example.ABCElectronic_smartDevice.Controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ABCElectronic_smartDevice.entity.Client;
import com.example.ABCElectronic_smartDevice.entity.Complaint;
import com.example.ABCElectronic_smartDevice.entity.Engineer;
import com.example.ABCElectronic_smartDevice.exceptions.ResourceNotFoundException;
import com.example.ABCElectronic_smartDevice.services.IEngineerService;

@RestController
@RequestMapping("/api/engineer")
@Lazy
public class EngineerController {

	@Autowired
	private IEngineerService sr;

	@GetMapping("/getall-opencomplaints")
	public ResponseEntity<List<Complaint>> getAllOpenComplaints(Engineer engineer) {
		return new ResponseEntity<List<Complaint>>(sr.getAllOpenComplaints(engineer), HttpStatus.OK);
	}

	
	@GetMapping("/getall-resolvedcomplaints")
	public ResponseEntity<List<Complaint>> getResolvedComplaints(Engineer engineer) {
		return new ResponseEntity<List<Complaint>>(sr.getResolvedComplaints(engineer), HttpStatus.OK);

	}
	@GetMapping("/getall-resolvedbydate")
	public ResponseEntity<List<Complaint>> getResolvedComplaintsByDate(Engineer engineer, LocalDate date) {
		return new ResponseEntity<List<Complaint>>(sr.getResolvedComplaintsByDate(engineer, date), HttpStatus.OK);
	}
	@GetMapping("/getallcomplaints")
	public ResponseEntity<List<Complaint>> getComplaints(Engineer engineer, String complaintName) {
		return new ResponseEntity<List<Complaint>>(sr.getComplaints(engineer, complaintName), HttpStatus.OK);
	}

}
