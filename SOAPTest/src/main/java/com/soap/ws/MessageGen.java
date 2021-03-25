package com.soap.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface MessageGen {
	@WebMethod
	String getMessage();
	
	@WebMethod
	Double getTotal(int a, int b);
}
