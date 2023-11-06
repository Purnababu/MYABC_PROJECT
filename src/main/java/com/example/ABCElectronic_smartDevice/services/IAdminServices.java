package com.example.ABCElectronic_smartDevice.services;

import com.example.ABCElectronic_smartDevice.entity.Complaint;
import com.example.ABCElectronic_smartDevice.entity.Engineer;

public interface IAdminServices {

	public void addEngineer(Engineer engineer);

	public void changeDomain(int engineerid, String domain);

	public void removeEngineer(int Integerid);

	public java.util.List<Complaint> getComplientsByProducts(String modelnumber);

	public java.util.List<Complaint> getComplients(String complientname, int modelnumber);

	public Complaint replaceEngineerFromComplient(int Complientid); 

}
