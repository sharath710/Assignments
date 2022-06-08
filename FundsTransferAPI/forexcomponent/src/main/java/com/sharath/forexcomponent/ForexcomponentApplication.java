package com.sharath.forexcomponent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient

public class ForexcomponentApplication {

	public static void main(String[] args) {
		SpringApplication.run(ForexcomponentApplication.class, args);
	}

}
