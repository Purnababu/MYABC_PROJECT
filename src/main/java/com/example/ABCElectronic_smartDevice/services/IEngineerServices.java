package com.example.ABCElectronic_smartDevice.services;

import java.time.LocalDate;
import java.util.List;

import com.example.ABCElectronic_smartDevice.entity.Complaint;
import com.example.ABCElectronic_smartDevice.entity.Engineer;
import com.example.ABCElectronic_smartDevice.exceptions.ResourceNotFoundException;

public interface IEngineerServices {
	public List<Complaint> getAllOpenComplients(Engineer engineer) throws ResourceNotFoundException;

	public List<Complaint> getResolvedComplients(Engineer engineer);

	public List<Complaint> getResolvedComplientsByDate(Engineer engineer, LocalDate localdate);

	public List<Complaint> getComplients(Engineer engineer, String Complientname);

	public String changeComplientStatus(int complientid);
}
