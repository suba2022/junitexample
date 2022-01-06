package com.demo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestClassExample {
	UnitTesting1 ut = new UnitTesting1();
	
	@Test
	public void testcase1() {
		assertEquals(ut.calculate(100),10);
		
	}
	@Test
	public void testcase2() {
		assertEquals(ut.calculate(10),10);
		
	}
	

}
