package com.sharath.forexcomponent.service;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import com.sharath.forexcomponent.dto.ForexRequest;
import com.sharath.forexcomponent.dto.ForexResponse;

public class BaseForex {
protected Map<String, BigDecimal> getRatesFeed() {
		
		Map<String,BigDecimal> rates = new HashMap<>();
	rates.put("INRUSD", new BigDecimal("762.56"));
	rates.put("INREUR", new BigDecimal("172.56"));
		
	return rates;
}


}
