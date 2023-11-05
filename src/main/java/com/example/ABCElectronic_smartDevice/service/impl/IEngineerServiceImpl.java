package com.example.ABCElectronic_smartDevice.service.impl;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import com.example.ABCElectronic_smartDevice.entity.Complaint;
import com.example.ABCElectronic_smartDevice.entity.Engineer;
import com.example.ABCElectronic_smartDevice.services.IComplaintService;
import com.example.ABCElectronic_smartDevice.services.IEngineerService;

@Service
@Lazy
public class IEngineerServiceImpl implements IEngineerService {

	private IEngineerService engineerservice;

	@Autowired
	public void setEngineerService(IEngineerService engineerservice) {
		this.engineerservice = engineerservice;
	}

	private IComplaintService complaintservice;

	@Autowired
	public void setComplaintService(IComplaintService complaintservice) {
		this.complaintservice = complaintservice;
	}

	@Autowired
	public void setengineerservice(IEngineerService engineerservice) {
		this.engineerservice = engineerservice;
	}

	@Override
	public List<Complaint> getResolvedComplaintsByDate(Engineer engineer, LocalDate date) {
		return (engineerservice.getResolvedComplaintsByDate(engineer, date));

	}

	@Override
	public List<Complaint> getResolvedComplaints(Engineer engineer) {
		// Use the injected services to fetch the resolved complaints for the engineer.
		List<Complaint> resolvedComplaints = engineerservice.getResolvedComplaints(engineer);
		return resolvedComplaints;
	}

	@Override
	public List<Complaint> getAllOpenComplaints(Engineer engineer) {
		List<Complaint> openComplaints = complaintservice.getClientAllOpenComplaints(engineer);
		return openComplaints;
	}

	@Override
	public List<Complaint> getComplaints(Engineer engineer, String complaintName) {
		List<Complaint> complaints = engineerservice.getComplaints(engineer, complaintName);
		return complaints;

	}
}