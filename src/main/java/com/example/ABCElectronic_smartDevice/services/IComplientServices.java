package com.example.ABCElectronic_smartDevice.services;

import java.util.List;

import com.example.ABCElectronic_smartDevice.entity.Client;
import com.example.ABCElectronic_smartDevice.entity.Complaint;
import com.example.ABCElectronic_smartDevice.entity.Engineer;
import com.example.ABCElectronic_smartDevice.entity.Product;

public interface IComplientServices {
public boolean bookComplient(Client client, Complaint complaint, Product product);

public String changeComplientStatus(Complaint complient);

public List<Complaint>getClientAllComplients(Client client);

public List<Complaint>getClientAllOpenComplients(Client client);

public Engineer getEngineer(int engineerid);

public Product getProductByComplient(int complaintid);



}
