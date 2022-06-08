package com.sunil.Credit.Credit.payload;

public class FundsTransferRequest extends BaseModel {
	
	private int id;
	
	private double amount;
	
	private String sender;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getSender() {
		return sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	@Override
	public String toString() {
		return "FundsTransferRequest [id=" + id + ", amount=" + amount + ", sender=" + sender + "]";
	}

}
