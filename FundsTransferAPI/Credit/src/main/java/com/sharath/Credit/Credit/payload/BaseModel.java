package com.sunil.Credit.Credit.payload;

import java.io.Serializable;

public class BaseModel implements Serializable {
	
	private String correId;
	
	public String getCorreId() {
		return correId;
	}

	public void setCorreeId(String correId) {
		this.correId=correId;
	}
}
