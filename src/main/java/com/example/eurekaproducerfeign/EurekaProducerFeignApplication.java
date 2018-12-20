package com.example.eurekaproducerfeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class EurekaProducerFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaProducerFeignApplication.class, args);
	}

}

