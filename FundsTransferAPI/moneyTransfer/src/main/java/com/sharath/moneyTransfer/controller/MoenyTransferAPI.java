package com.sharath.moneyTransfer.controller;

import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sharath.moneyTransfer.dto.PaymentRequest;
import com.sharath.moneyTransfer.dto.PaymentResponse;

@RestController
@RequestMapping("api")
public class MoenyTransferAPI {
	
	@PostMapping(value="/payment",produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<PaymentResponse> doPayments(@RequestBody PaymentRequest req ){
		
		PaymentResponse res =  new PaymentResponse();
		res.setStatus(true);
		res.setTxnRefNumber(UUID.randomUUID().toString());
		
		return new ResponseEntity<PaymentResponse>(res, HttpStatus.OK);
	}
	
	
	

}
