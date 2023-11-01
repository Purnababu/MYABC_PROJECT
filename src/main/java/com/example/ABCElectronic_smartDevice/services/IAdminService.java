package com.example.ABCElectronic_smartDevice.services;

import java.util.List;

import com.example.ABCElectronic_smartDevice.entity.Complaint;

public interface IAdminService {
	
	public void addEngineer();
	public void changeDomain(int String);
	public void removeEngineer(int id);
	public List<Complaint>getComplaintsByProducts(String com);
	public List<Complaint> getComplaintes(String string);
	public Complaint replaceEngineerFromComplaint(int employeeId );
	
	
	
	

}
