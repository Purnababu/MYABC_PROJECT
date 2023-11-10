package com.example.ABCElectronic_smartDevice.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ABCElectronic_smartDevice.entity.Engineer;
import com.example.ABCElectronic_smartDevice.entity.Product;
import com.example.ABCElectronic_smartDevice.services.IProductServices;

@RestController
@RequestMapping("api/product")
public class ProductController {
@Autowired
private IProductServices ps;

//private IProductRepository pr;
@PostMapping("/add-product")
public void addproduct(@RequestBody Product product) throws Exception {

	if (product==null) {
		throw new Exception("product is exist ");
	}else {
		ps.addproduct(product);
	}
	
}
@PutMapping("/update-productwarranty")
public ResponseEntity<Product> upadateProductWarranty(@RequestBody Product product) throws Exception {
	
	if (product==null) {
		throw new Exception("product out of warranty exception");
	}
	return new ResponseEntity<Product>(product,HttpStatus.OK);
	
}
@DeleteMapping("/remove-/{modelnumber}")
public ResponseEntity<Product>removeProduct(@PathVariable int modelNumber) throws Exception {
	
	if (modelNumber==0) {
		throw new Exception("modelNumber not found");
		
	}

		return new ResponseEntity<Product>(HttpStatus.OK);
	}
	


@GetMapping("/get-product/{modelNumber}")
public ResponseEntity<Product>getproduct(@PathVariable int modelNumber) throws Exception{
	if (modelNumber==0) {
		throw new Exception("product not found exception");
	}else {
	return new ResponseEntity<Product>((Product) ps.getProduct(modelNumber),HttpStatus.OK);	
	}
	
}
@GetMapping("/get-ProductComplaints/{modelnumber}")
public ResponseEntity<Product>getProductComplaints(@PathVariable int modelNumber) throws Exception{
	if (modelNumber==0) {
		throw new Exception("product complaints not found exception");
		
	}
		return new ResponseEntity<Product>((Product) ps.getProductComplients(modelNumber),HttpStatus.ACCEPTED);
	
}
@GetMapping("/get-EngineerByProduct/{modelnumber}")
public ResponseEntity<Engineer>getEngineerByProduct(@PathVariable int modelNumber) throws Exception{
	if (modelNumber==0) {
		throw new Exception("product complaints not found exception");
		
	}
		return new ResponseEntity<>(ps.getEngineerByProduct(modelNumber), HttpStatus.OK);
	}
}
