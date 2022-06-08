package com.sharath.moneyTransfer.service;

import com.sharath.moneyTransfer.dto.BaseModel;

public class ForexResponse extends BaseModel {
	
private String reqId;
	
	private float rate;

	public String getReqId() {
		return reqId;
	}

	public void setReqId(String reqId) {
		this.reqId = reqId;
	}

	public float getRate() {
		return rate;
	}

	public void setRate(float rate) {
		this.rate = rate;
	}

}
