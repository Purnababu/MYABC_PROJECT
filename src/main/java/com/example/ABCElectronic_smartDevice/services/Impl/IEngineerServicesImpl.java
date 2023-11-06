package com.example.ABCElectronic_smartDevice.services.Impl;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.ABCElectronic_smartDevice.entity.Complaint;
import com.example.ABCElectronic_smartDevice.entity.Engineer;
import com.example.ABCElectronic_smartDevice.exceptions.ResourceNotFoundException;
import com.example.ABCElectronic_smartDevice.repository.IComplaintRepository;
import com.example.ABCElectronic_smartDevice.repository.IEngineerRepository;
import com.example.ABCElectronic_smartDevice.services.IEngineerServices;

public class IEngineerServicesImpl implements IEngineerServices{
@Autowired
private IEngineerRepository ery;
@Autowired
private IComplaintRepository cry;

	@Override
	public List<Complaint> getAllOpenComplients(Engineer engineer){
 List<Engineer> eng=ery.
 throw new 
		return null;
	}

	@Override
	public List<Complaint> getResolvedComplients(Engineer engineer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Complaint> getResolvedComplientsByDate(Engineer engineer, LocalDate localdate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Complaint> getComplients(Engineer engineer, String Complientname) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String changeComplientStatus(int complientid) {
		// TODO Auto-generated method stub
		return null;
	}

}
