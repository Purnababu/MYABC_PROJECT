package com.example.ABCElectronic_smartDevice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
public class AbcElectronicSmartDeviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AbcElectronicSmartDeviceApplication.class, args);

	}

	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.example.ABCElectronic_smartDevice"))
				.paths(PathSelectors.any()).build();
	}
}
//http://localhost:8080/swagger-ui.html#/