package com.example.ABCElectronic_smartDevice.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.ABCElectronic_smartDevice.entity.Complaint;

@Repository
public interface IComplaintRepository extends JpaRepository<Complaint,Integer> 
{
	@Query(value = "select c from Complaint c where c.complaintName=?1")
	public Optional<?> getComplaintName(String complaintName);
}
