package com.sharath.moneyTransfer.dto;

public class PaymentResponse extends BaseModel {
	
private Boolean status;
	
	private String txnRefNumber;
	
	private String reqIdentifier;

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public String getTxnRefNumber() {
		return txnRefNumber;
	}

	public void setTxnRefNumber(String txnRefNumber) {
		this.txnRefNumber = txnRefNumber;
	}

	public String getReqIdentifier() {
		return reqIdentifier;
	}

	public void setReqIdentifier(String reqIdentifier) {
		this.reqIdentifier = reqIdentifier;
	}

}
