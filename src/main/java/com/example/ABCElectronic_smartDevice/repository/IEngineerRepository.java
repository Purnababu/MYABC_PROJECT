package com.example.ABCElectronic_smartDevice.repository;

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
}
