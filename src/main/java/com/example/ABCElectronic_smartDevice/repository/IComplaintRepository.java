package com.example.ABCElectronic_smartDevice.repository;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.ABCElectronic_smartDevice.entity.Complaint;
import com.example.ABCElectronic_smartDevice.entity.Engineer;

@Repository
public interface IComplaintRepository extends JpaRepository<Complaint, Integer> {
	@Query(value = "select c from Complaint c where c.complaintName=?1")
	public Optional<?> getComplaintName(String complaintName);

	@Query("SELECT c FROM Complaint c WHERE c.engineer = :engineer AND c.status = 'Open'")
	public List<Complaint> findOpenComplaintsByEngineer(@Param("engineer") Engineer engineer);

	@Query("SELECT c FROM Complaint c WHERE c.engineer = :engineer AND c.status = 'OPEN'")
	List<Complaint> getClientAllOpenComplaints(@Param("engineer") Engineer engineer);
}
