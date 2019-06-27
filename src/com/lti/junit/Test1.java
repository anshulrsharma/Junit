package com.lti.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test1 {

	@Test
	public void test() {
		fail("Not yet implemented");
	}
public String message="Raj";
JunitMessage junitMessage=new JunitMessage(message);
@Test
public void testJunitMessage() {
	System.out.println("jUnitMessage is printing");
	junitMessage.printMessage();
}
@Test
public void testJunitHiMessage() {
	
	message ="Hi "+message;
	System.out.println("jUnit Hi message is printing");
	assertEquals(message,junitMessage.printMessage());
	System.out.println("test 1 is successfull"+message);
}
}
