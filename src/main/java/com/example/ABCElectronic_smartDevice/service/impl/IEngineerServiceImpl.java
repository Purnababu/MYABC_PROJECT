package com.example.ABCElectronic_smartDevice.service.impl;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ABCElectronic_smartDevice.entity.Complaint;
import com.example.ABCElectronic_smartDevice.entity.Engineer;
import com.example.ABCElectronic_smartDevice.repository.IComplaintRepository;
import com.example.ABCElectronic_smartDevice.repository.IEngineerRepository;
import com.example.ABCElectronic_smartDevice.services.IEngineerService;

@Service
public class IEngineerServiceImpl implements IEngineerService {

	private IEngineerRepository engineerrepo;

	@Autowired
	public void setEngi(IEngineerRepository engineerrepo) {
		this.engineerrepo = engineerrepo;
	}

	private IComplaintRepository complaintrepo;

	@Autowired
	public void setComp(IComplaintRepository complaintrepo) {
		this.complaintrepo = complaintrepo;
	}

	@Override
	public List<Complaint> getAllOpenComplaints(Engineer engineer) {
		List<Complaint> openComplaints = complaintrepo.getClientAllOpenComplaints(engineer);
		return openComplaints;
	}

	@Override
	public List<Complaint> getResolvedComplaints(Engineer engineer) {
		// Use the injected services to fetch the resolved complaints for the engineer.
		List<Complaint> resolvedComplaints = engineerrepo.getResolvedComplaints(engineer);
		return resolvedComplaints;
	}

	@Override
	public List<Complaint> getResolvedComplaintsByDate(Engineer engineer, LocalDate date) {
		return (engineerrepo.getResolvedComplaintsByDate(engineer, date));

	}

	@Override
	public List<Complaint> getComplaints(Engineer engineer, String complaintName) {
		List<Complaint> complaints = engineerrepo.getComplaints(engineer, complaintName);
		return complaints;
	}

	@Override
	public String changeComplaintStatus(int complaintId) {
		// Find the complaint by its ID (you need to implement your repository method)
		Optional<Complaint> complaintOptional = complaintrepo.findById(complaintId);

		if (complaintOptional.isPresent()) {
			Complaint complaint = complaintOptional.get();

			// Update the complaint status
			complaint.setStatus("Resolved"); // You should update this based on your domain model

			// Save the updated complaint
			complaintrepo.save(complaint);

			return "Complaint status changed to 'Resolved' for complaint with ID " + complaintId;
		} else {
			return "Complaint with ID " + complaintId + " not found";
		}
	}
}
