package com.sharath.gatewayComponent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class GatewayComponentApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayComponentApplication.class, args);
	}

}
