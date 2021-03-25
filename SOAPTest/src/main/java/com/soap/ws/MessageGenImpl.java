package com.soap.ws;

import java.util.Scanner;

import javax.jws.WebService;

@WebService(endpointInterface = "com.soap.ws.MessageGen", serviceName = "messageGenService")
public class MessageGenImpl implements MessageGen {

	private Scanner scan;

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Hello Dell";
	}

	@Override
	public Double getTotal(int a, int b) {
		double ans = a + b;
		return ans;
	}

}
