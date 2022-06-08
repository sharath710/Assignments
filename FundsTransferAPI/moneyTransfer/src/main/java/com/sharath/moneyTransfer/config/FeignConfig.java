package com.sharath.moneyTransfer.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.sharath.moneyTransfer.service.MyForexFallBack;

import feign.Feign;
import io.github.resilience4j.circuitbreaker.CircuitBreaker;
import io.github.resilience4j.feign.FeignDecorators;
import io.github.resilience4j.feign.Resilience4jFeign;
import io.github.resilience4j.ratelimiter.RateLimiter;



@Configuration
public class FeignConfig {
	
	@Autowired
	private CircuitBreaker registary;
	
	@Autowired
	private MyForexFallBack fallBack; 
	
	@Bean
	@Scope("Prototype")
	public Feign.Builder feignBuilder(){
		
		CircuitBreaker circuitBreaker =  CircuitBreaker.ofDefaults("forex-service");
	RateLimiter rateLimiter =  RateLimiter.ofDefaults("forex-service");
	FeignDecorators decorators =  FeignDecorators.builder()
			.withRateLimiter(rateLimiter)
			.withCircuitBreaker(circuitBreaker)
			.withFallback(fallBack)
			.build();
	
	return Resilience4jFeign.builder(decorators);

}
}
