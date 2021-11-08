package com.ELEC5620.facemanage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@ComponentScan(basePackages = "com.ELEC5620.facemanage.service.imp")
public class FacemanageApplication {

	public static void main(String[] args) {
		SpringApplication.run(FacemanageApplication.class, args);
	}

}
