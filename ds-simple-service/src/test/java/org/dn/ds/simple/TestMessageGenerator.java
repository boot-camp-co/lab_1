package org.dn.ds.simple;


import static org.junit.Assert.*;
import junit.framework.Assert;

import org.dn.ds.simple.message.MessageGenerator;
import org.junit.Test;
 
public class TestMessageGenerator {

	String expectedMsg = "Goodbye";
	String expectedFirstMsg = "Hello Component";
	String expectedSubMessage = "Hello Again";


	    @Test
	    public void testHelloMsg() {
	    	
	    	MessageGenerator msgGenerator = new MessageGenerator();
	    	assertEquals(msgGenerator.getHelloGreeting(),expectedFirstMsg);
	    	assertEquals(msgGenerator.getHelloGreeting(),expectedSubMessage);
	    }
	    
	    @Test
	    public void testGoodbyeMsg() {

	    	MessageGenerator msgGenerator = new MessageGenerator();
	    	assertEquals(msgGenerator.getGoodbyeGreeting(),expectedMsg);
	    	assertEquals(msgGenerator.getHelloGreeting(),expectedSubMessage);
	    }

	}