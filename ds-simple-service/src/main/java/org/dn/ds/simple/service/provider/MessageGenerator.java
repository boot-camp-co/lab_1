package org.dn.ds.simple.service.provider;

public class MessageGenerator {
	
	private boolean invoked = false;

	public String getHelloGreeting() {
		String msg;
		if(!invoked) msg = "Hello Component";
		else msg = "Hello Again";
		invoked = true;
		return msg;
	}

	public String getGoodbyeGreeting() {
		invoked = true;
		return "Goodbye";
	}

}