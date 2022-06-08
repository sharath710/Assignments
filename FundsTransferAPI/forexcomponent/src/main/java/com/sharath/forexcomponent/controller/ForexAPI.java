package com.sharath.forexcomponent.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.sharath.forexcomponent.dto.ForexRequest;
import com.sharath.forexcomponent.dto.ForexResponse;
import com.sharath.forexcomponent.service.ForexManager;

@RestController
@RequestMapping("api")
public class ForexAPI {

	
	@Autowired
	private ForexManager fxService;
	
	
	@PostMapping(value="/fx", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ForexResponse> getForexRates(@RequestBody ForexRequest fxReq){
		ForexResponse rs =  fxService.getRates(fxReq);
		
		return new ResponseEntity<ForexResponse>(rs, HttpStatus.OK);
		
	}
}
