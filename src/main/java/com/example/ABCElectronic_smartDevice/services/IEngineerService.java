package com.example.ABCElectronic_smartDevice.services;

import java.time.LocalDate;
import java.util.List;



import com.example.ABCElectronic_smartDevice.entity.Complaint;
import com.example.ABCElectronic_smartDevice.entity.Engineer;

public interface IEngineerService {
	
	public List<Complaint> getAllOpenComplaints(Engineer engineer);
	public List<Complaint> getResolvedComplaints(Engineer engineer);
	public List<Complaint> getResolvedComplaintsByDate(Engineer engineer,LocalDate  date);
	public List<Complaint> getComplaints(Engineer engineer, String complaintName);
	public String changeComplaintStatus(int complaintId);
	
}

