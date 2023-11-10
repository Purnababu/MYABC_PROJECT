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
import com.example.ABCElectronic_smartDevice.repository.IClientRepository;
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
	
	@Autowired
	private IClientRepository ice;

	@Override
	public boolean bookComplaint(int clientId, Complaint complaint, int modelNumber) throws ResourceNotFoundException {
		Client c = ice.findById(clientId).orElseThrow(() -> new ResourceNotFoundException("client not exsits"));
		Product p = pr.findById(modelNumber).orElseThrow(() -> new ResourceNotFoundException("product not exsits"));
		complaint.setClient(c);
		//complaint.setProduct(p);

		cmr.save(complaint);
		return true;

	}

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
		Optional<Client> exsists = ice.findById(complaintId);
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