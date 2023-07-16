package com.calculator;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

@SuppressWarnings({ "deprecation", "unused" })
public class MyJunitTest {

	@Test
	public void testSum() {
		CalculatorApp calculator = new CalculatorApp();
		int result = calculator.sum(5,10);
		Assert.assertEquals(15,result);
	}
	@Test
	public void testSubstract() {
		CalculatorApp calculator = new CalculatorApp();
		int result = calculator.substraction(10,5);
		Assert.assertEquals(5,result);
	}
	@Test
	public void testMultiply() {
		CalculatorApp calculator = new CalculatorApp();
		int result = calculator.multiply(10,5);
		Assert.assertEquals(50,result);
	}
	@Test
	public void testDivide() {
		CalculatorApp calculator = new CalculatorApp();
		int result = calculator.divide(10,5);
		Assert.assertEquals(2,result);
	}

}
