package com.lti.junit;

public class JunitTC {
	private Calculator calc;
	@Before
	public void setUp() throws Exception{
		calc=new Calculator();
	}
@After
public void tearDown() throws Exception{
	calc=null;
	
}
@Test
public void testAdd() {
	double result=calc.add(10.5, 20.32);
	assertEquals(30.82,result,0);
	
}
@Test
public void testSubtract() {
	double result=calc.subtract(20.2, 10.6);
	assertEquals(9.6,result,0);
}
@Test
public void testMultiply() {
	double result=calc.multiply(2.5, 100);
	assertEquals(25,result,0);
}
@Test
public void testDivide() {
	double result=calc.divide(100,0);
	assertEquals(10,result,0.001);
}
@Test(expected=ArithmeticException.class)
public void testDivideByZero() {
	double result=calc.divide(100.5, 0);
	calc.divide(100.5,0);
}

}
