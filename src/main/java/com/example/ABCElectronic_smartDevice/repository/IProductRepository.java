package com.example.ABCElectronic_smartDevice.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.ABCElectronic_smartDevice.entity.Product;

@Repository
public interface IProductRepository  extends JpaRepository<Product ,Integer>{
	@Query()
public Optional<Product>getProductByproductname(String productname);

	public Optional<Product> getProductByModelnumber(String modelnumber);


}
