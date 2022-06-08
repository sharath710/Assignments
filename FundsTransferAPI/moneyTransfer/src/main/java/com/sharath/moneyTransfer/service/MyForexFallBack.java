package com.sharath.moneyTransfer.service;



public class MyForexFallBack {
	public ForexResponse getForxRates(ForexRequest fxReq) {
		
		
		ForexResponse res =  new ForexResponse();
		
		res.setRate(0);
		res.setReqId(fxReq.getReqId());
		
		// TODO Auto-generated method stub
		return res;
	}

}
