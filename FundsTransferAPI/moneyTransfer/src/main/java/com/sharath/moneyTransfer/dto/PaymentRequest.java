package com.sharath.moneyTransfer.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class PaymentRequest extends BaseModel {
	
	private String sourceAcc;
	private String destAcc;
	
	private int amount;
	
	private String currency;
	
	@JsonFormat(pattern="yyyyy-mm-dd")
	private Date ts;

	public String getSourceAcc() {
		return sourceAcc;
	}

	public void setSourceAcc(String sourceAcc) {
		this.sourceAcc = sourceAcc;
	}

	public String getDestAcc() {
		return destAcc;
	}

	public void setDestAcc(String destAcc) {
		this.destAcc = destAcc;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public Date getTs() {
		return ts;
	}

	public void setTs(Date ts) {
		this.ts = ts;
	}

}
