package com.sharath.forexcomponent.dto;

public class ForexRequest extends BaseModel {

private String srcCCY;
	
	private String desCCY;
	
	private String reqId;

	public String getSrcCCY() {
		return srcCCY;
	}

	public void setSrcCCY(String srcCCY) {
		this.srcCCY = srcCCY;
	}

	public String getDesCCY() {
		return desCCY;
	}

	public void setDesCCY(String desCCY) {
		this.desCCY = desCCY;
	}

	public String getReqId() {
		return reqId;
	}

	public void setReqId(String reqId) {
		this.reqId = reqId;
	}


}
