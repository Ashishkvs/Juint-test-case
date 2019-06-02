package com.imagegrafia.calculator;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TestCalculator {
	Calculator cal=null;
	
	@Before
	public void setUp() {
		cal=new Calculator();
	}
	@Test
	public void testAdd() {
		assertEquals(10, cal.add(4, 6));
		assertEquals(2, cal.add(-4, 6));
		assertEquals(-10, cal.add(-4, -6));
	}
//	@Test(expected=Exception.class)  //failure
	@Test
	public void testDivide() {
		assertEquals(2, cal.divide(4, 2));
		assertEquals(10, cal.divide(0, 4));
	}
}
