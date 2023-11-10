package com.example.ABCElectronic_smartDevice.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.ABCElectronic_smartDevice.entity.Engineer;
@Repository
public interface IEngineerRepository  extends JpaRepository<Engineer , Integer>
{
	@Query(value="select e from Engineer e where e.engineerName=?1")
	public Optional<?> getEngineerName(String engineerName);
	
	@Query(value = "select e from Engineer e where e.domain=?1")
	public List<Engineer> getEngineersByDomain(String domain);
}
