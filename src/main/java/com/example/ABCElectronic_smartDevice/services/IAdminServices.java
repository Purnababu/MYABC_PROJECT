package com.example.ABCElectronic_smartDevice.services;

import com.example.ABCElectronic_smartDevice.entity.Complaint;
import com.example.ABCElectronic_smartDevice.entity.Engineer;

public interface IAdminServices {

	public void addEngineer(Engineer engineer);

	public void changeDomain(int engineerId, String domain);

	public void removeEngineer(int engineerId);

	public java.util.List<Complaint> getComplientsByProducts(int modelNumber);

	public java.util.List<Complaint> getComplients(String complaintName, int modelNumber);

	public Complaint replaceEngineerFromComplient(int ComplientId); 

}
