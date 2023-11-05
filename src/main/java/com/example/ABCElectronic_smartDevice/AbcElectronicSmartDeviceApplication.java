package com.example.ABCElectronic_smartDevice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration

@SpringBootApplication
public class AbcElectronicSmartDeviceApplication {
	private static final Logger logger = LoggerFactory.getLogger(AbcElectronicSmartDeviceApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(AbcElectronicSmartDeviceApplication.class, args);
		logger.info("Application is Running...........");
	}

	@Bean
	public Docket productApi() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.example.ABCElectronic_smartDevice"))
				.paths(PathSelectors.any()).build();
	}

}
