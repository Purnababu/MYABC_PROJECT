package com.example.ABCElectronic_smartDevice;

import org.slf4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class AbcElectronicSmartDeviceApplication {

	final static Logger logger = org.slf4j.LoggerFactory.getLogger(AbcElectronicSmartDeviceApplication.class);

	public static void main(String[] args) {
		System.out.println("application running");
		logger.info("Application iss Running...........");
		SpringApplication.run(AbcElectronicSmartDeviceApplication.class, args);

	}

}
