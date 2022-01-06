package com.demo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CaseConverterTest {
	CaseConverter c1 = new CaseConverter();
	
	@Test
	public void testconvertcase() {
		assertEquals(c1.convertcase("hello"), "HellO");
		}

	@Test
	public void testconvertcase2() {
		assertEquals(c1.convertcase("hello"), "Hello");
		}
	
	
	@Test
	public void testconvertcase3() {
		assertEquals(c1.convertcase(""), "");
		}
	
	@Test
	public void testconvertcase4() {
		assertEquals(c1.convertcase(""), "");
		}
	
	@Test
	public void testconvertcase5() {
		assertEquals(c1.convertcase("null"), "");
		}

	@Test
	public void testconvertcase6() {
		assertEquals(c1.convertcase("7"), "7");
		}
	
	
}
