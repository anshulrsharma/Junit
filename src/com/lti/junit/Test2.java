package com.lti.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test2 {

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void createAndSetName() {
		String actual="Y";
		String expected="Y";
		assertEquals(expected,actual);
		System.out.println("test2 is successfull"+actual);
	}

}
