package com.loxasoft.employesservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@Configuration
public class EmployesServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployesServiceApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate(){
		return restTemplate();
	}

}
