package com.example.ABCElectronic_smartDevice;

import org.slf4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
@EnableSwagger2
@SpringBootApplication
public class AbcElectronicSmartDeviceApplication {

	final static Logger logger = org.slf4j.LoggerFactory.getLogger(AbcElectronicSmartDeviceApplication.class);

	public static void main(String[] args) {
		System.out.println("application running");
		logger.info("Application iss Running...........");
		SpringApplication.run(AbcElectronicSmartDeviceApplication.class, args);

	}
	@Bean
	public Docket productApi() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.example.ABCElectronic_smartDevice")).build();
	}
}
//http://localhost:8081/swagger-ui.html#/ 