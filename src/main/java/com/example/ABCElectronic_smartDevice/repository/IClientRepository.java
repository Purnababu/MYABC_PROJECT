package com.example.ABCElectronic_smartDevice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.ABCElectronic_smartDevice.entity.Client;
import com.google.common.base.Optional;

@Repository
public interface IClientRepository extends JpaRepository<Client, Integer> {
	@Query(value = "select e from Engineer e where e.engineerName=?1")
	public Optional<?> getEngineerName(String engineerName);
}
