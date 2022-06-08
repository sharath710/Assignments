package com.sharath.forexcomponent.service;

import com.sharath.forexcomponent.dto.ForexRequest;
import com.sharath.forexcomponent.dto.ForexResponse;

public interface ForexManager {
	
public ForexResponse getRates(ForexRequest req);

}
