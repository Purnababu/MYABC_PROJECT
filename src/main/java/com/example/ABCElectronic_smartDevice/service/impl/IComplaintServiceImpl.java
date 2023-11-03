package com.example.ABCElectronic_smartDevice.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ABCElectronic_smartDevice.entity.Client;
import com.example.ABCElectronic_smartDevice.entity.Complaint;
import com.example.ABCElectronic_smartDevice.entity.Engineer;
import com.example.ABCElectronic_smartDevice.entity.Product;
import com.example.ABCElectronic_smartDevice.exceptions.ResourceNotFoundException;
import com.example.ABCElectronic_smartDevice.repository.IComplaintRepository;
import com.example.ABCElectronic_smartDevice.repository.IEngineerRepository;
import com.example.ABCElectronic_smartDevice.repository.IProductRepository;
import com.example.ABCElectronic_smartDevice.services.IComplaintService;

@Service
public class IComplaintServiceImpl implements IComplaintService {

	@Autowired
	private IComplaintRepository cmr;

	@Autowired
	private IEngineerRepository erp;

	@Autowired
	private IProductRepository pr;

	///////// add complaint to the db//////////////
	@Override
	public boolean bookComplaint(Client client, Complaint complaint, Product product) {
		Optional<Complaint> existingComplaint = cmr.findById(complaint.getComplaintId());

		if (existingComplaint.isPresent()) {

			return false;
		} else {

			cmr.save(complaint);
			return true;
		}

	}

	/////////// getting Complaints List from db/////////
	@Override
	public List<Complaint> getClientAllComplaints(Client client) throws ResourceNotFoundException {
		List<Complaint> lf = cmr.findAll();
		if (lf.isEmpty()) {
			throw new ResourceNotFoundException("complaints not available in the database");
		} else {
			return lf;
		}

	}
	//////// get engineer by id from db//////

	@Override
	public Engineer getEngineer(int engineerId) throws ResourceNotFoundException {

		Engineer e = erp.findById(engineerId)
				.orElseThrow(() -> new ResourceNotFoundException("engineer not exists in db with this " + engineerId));
		return e;
	}

	@Override
	public String changeComplaintStatus(Complaint Complaint) {

		return null;
	}

	//// product model number is with in the table of complaint in db so complaint
	//// id isthe daniki sambandinchina product vasthundhi
	@Override
	public Product getProductByComplaint(int complaintId) {
		Optional<Complaint> exsists = cmr.findById(complaintId);
		if (exsists.isPresent()) {
			return exsists.get().getProduct();
		} else {

			return null;
		}

	}

	@Override
	public List<Complaint> getClientAllOpenComplaints(Client client) {
		// TODO Auto-generated method stub
		return null;
	}

}