package com.example.ABCElectronic_smartDevice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ABCElectronic_smartDevice.entity.Engineer;
@Repository
public interface IEngineerRepository  extends JpaRepository<Engineer , Integer>{

}
