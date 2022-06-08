package com.sharath.moneyTransfer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.sharath.moneyTransfer.config.FeignConfig;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;



@FeignClient(name= ForexServiceRemoteClient.SERVICE_NAME,configuration=FeignConfig.class)
public interface ForexServiceRemoteClient {
	
String SERVICE_NAME = "forex-service"; // wHAT THE NAME WE GAVE IN EUREKA SERVER HRE IN SMALL  LETTERS
	
	//fEIGN CLINENT WILL BE APBLE TO IDENLTY WHICH api IT NEEDS TO COMMUNICATE....
	
	//@PostMapping(value="/fx", produces = MediaType.APPLICATION_JSON_VALUE)
	@RequestMapping(method=RequestMethod.POST,value="api/fx")
	@CircuitBreaker(name=SERVICE_NAME)
	public ForexResponse getForexRates(@RequestBody ForexRequest fxReq);

}
