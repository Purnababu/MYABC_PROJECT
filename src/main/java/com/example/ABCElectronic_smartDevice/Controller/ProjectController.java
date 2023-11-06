package com.example.ABCElectronic_smartDevice.Controller;

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

import com.example.ABCElectronic_smartDevice.entity.Product;
import com.example.ABCElectronic_smartDevice.services.IProductServices;

@RestController
@RequestMapping("api/product")
public class ProjectController {

private IProductServices ps;
@PostMapping("/add-product")
public ResponseEntity<Product> addproduct(@RequestBody Product product) throws Exception {
	if (product==null) {
		throw new Exception("product is exist ");
	}
	return new ResponseEntity<Product>(HttpStatus.OK);
}
@PutMapping("/update-productwarranty")
public ResponseEntity<Product> upadateProductWarranty(@RequestBody Product product) throws Exception {
	if (product==null) {
		throw new Exception("product out of warranty exception");
	}
	return new ResponseEntity<Product>(HttpStatus.OK);
	
}
@DeleteMapping("/remove-/{modelnumber}")
public ResponseEntity<Product>removeProduct(@PathVariable(name="modelnumber")String modelnumber) throws Exception {
	if (modelnumber==null) {
		throw new Exception("modelnumber not found");
		
	}else {

		return new ResponseEntity<Product>(HttpStatus.OK) ;	
	}
	

}
@GetMapping("/get-product/{modelnumber}")
public ResponseEntity<Product>getproduct(@PathVariable String modelnumber) throws Exception{
	if (modelnumber==null) {
		throw new Exception("product not found exception");
	}else {
	return new ResponseEntity<Product>((Product) ps.getProduct(modelnumber),HttpStatus.OK);	
	}
	
}
@GetMapping("/get-ProductComplaints/{modelnumber}")
public ResponseEntity<Product>getProductComplaints(@PathVariable String modelnumber) throws Exception{
	if (modelnumber==null) {
		throw new Exception("product complaints not found exception");
		
	}else {
		return new ResponseEntity<Product>((Product) ps.getProductComplients(modelnumber),HttpStatus.ACCEPTED);
	
	}
	
}
@GetMapping("/get-EngineerByProduct/{productname}")
public ResponseEntity<Product>getEngineerByProduct(@PathVariable String productname) throws Exception{
	if (productname==null) {
		throw new Exception("product complaints not found exception");
		
	}else {
		return new ResponseEntity<Product>((Product) ps.getEngineerByProduct(productname),HttpStatus.OK);
	}
	}
}
