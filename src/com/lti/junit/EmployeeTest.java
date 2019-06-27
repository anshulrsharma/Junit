package com.lti.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class EmployeeTest {

	@Test
	public void test() {
		fail("Not yet implemented");
	}

	@Test
	public void mySimpleEqualsTest() {
		String expectedName="Anshul";
		assertEquals(expectedName,Employee.getEmployeeNameWithHighestSalary());
		
	}
	
	@Test
	public void myObjectEqualsTest() {
		Employee expectedEmpObj=new Employee(1,"an",15000);
assertEquals(expectedEmpObj, Employee.getHighestPaidEmployee());		
	}
}
