package com.lti.junit;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class AnnotationE {

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	private ArrayList<String> list;
	@BeforeClass
	public static void m1() {
		System.out.println("using @Before class,executed before all test cases");
		
		
	}
@Before
public void m2() {
	list=new ArrayList<String>();
	System.out.println("using @Before annotations,executed before each test case");
	
}
@Test
public void m5() {
	list.add("test");
	assertFalse(list.isEmpty());
	assertEquals(1,list.size());
	System.out.println("we are in m5");
	
}
@Ignore
public void m6() {
	System.out.println("using @Ignore,this exec is ignored");
}
@Test(timeout=10)
public void m7() {
	System.out.println("using @Test(Timeout),it can be used to inforce timeout in junit 4 testcase");
}
@Test(expected=NoSuchMethodException.class)
public void m8() {
	System.out.println("using @Test(expected),it will check for specified exception during its execution");
}
}
