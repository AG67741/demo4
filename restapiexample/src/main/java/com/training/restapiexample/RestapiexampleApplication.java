package com.training.restapiexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class RestapiexampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestapiexampleApplication.class, args);
	}

}
