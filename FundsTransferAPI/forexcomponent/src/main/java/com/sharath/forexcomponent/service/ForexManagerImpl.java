package com.sharath.forexcomponent.service;

import java.math.BigDecimal;
import java.util.Map;

import com.sharath.forexcomponent.dto.ForexRequest;
import com.sharath.forexcomponent.dto.ForexResponse;



public class ForexManagerImpl extends BaseForex implements ForexManager {

	@Override
	public ForexResponse getRates(ForexRequest req) {
		// TODO Auto-generated method stub
		
		
		String key = req.getSrcCCY().concat(req.getDesCCY());
		Map<String, BigDecimal> rates = this.getRatesFeed();
		ForexResponse fxRes =  new ForexResponse();
if(rates.containsKey(key)) {
	BigDecimal bdRates = rates.get(key);
	
	
	fxRes.setReqId(req.getReqId());
	fxRes.setRate(bdRates.floatValue());
	
	// TODO Auto-generated method stub
	
		}else {
			fxRes.setReqId(req.getReqId());
			fxRes.setRate(0);
		}
		//BigDecimal bdRates = rates.get(req.getSrcCCY().concat(req.getDesCCY()));
return fxRes;
	}
	
	
	
	
}	
	
	

