package com.example.ABCElectronic_smartDevice.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.ABCElectronic_smartDevice.entity.Client;
import com.example.ABCElectronic_smartDevice.entity.Complaint;
import com.example.ABCElectronic_smartDevice.entity.Engineer;
@Repository
public interface IEngineerRepository  extends JpaRepository<Engineer , Integer>
{
	@Query(value="select e from Engineer e where e.engineerName=?1")
	public Optional<?> getEngineerName(String engineerName);
	 @Query("SELECT c FROM Complaint c WHERE c.client = :client AND c.status = 'Open'")
	    List<Complaint> findOpenComplaintsByClient(@Param("client") Client client);
	}


