package edu.washington.ext;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LibraryAssociateTest {
	
	double trishPay = 2025.00;
	double trishHours = 138.00;
	double trishHourlyRate = 12.50;
	double trishCurrentSales = 15000.00;
	double trishCommisionRate = .02;
	
	
	LibraryAssociate LA = new LibraryAssociate("Trish");
	
	

	@Before
	public void setUp() throws Exception {
		LA.setHourlyRate(trishHourlyRate);
		LA.setCurrentHours(trishHours);
		LA.setCurrentSales(trishCurrentSales);
		LA.setCommisionRate(trishCommisionRate);
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCalculatePay() {
		assertEquals(trishPay, LA.calculatePay(), .0);
	}

	@Test
	public void testLibraryAssociate() {
		assertEquals("class edu.washington.ext.LibraryAssociate", LA.getClass().toString());
	}

	@Test
	public void testGetCommisionRate() {
		assertEquals(trishCommisionRate, LA.getCommisionRate(), 0);
	}

	@Test
	public void testSetCommisionRate() {
		assertEquals(trishCommisionRate, LA.getCommisionRate(), 0);
		LA.setCommisionRate(.03);
		assertEquals(.03, LA.getCommisionRate(), 0);
		LA.setCommisionRate(-.01);
		assertEquals(.03, LA.getCommisionRate(), 0);
		LA.setCommisionRate(0);
		assertEquals(.03, LA.getCommisionRate(), 0);
		
	}

	
	@Test
	public void testGetName() {
		assertEquals("Trish", LA.getName());
	}

	@Test
	public void testGetCurrentHours() {
		assertEquals(trishHours, LA.getCurrentHours(), .0);
	}

	@Test
	public void testSetCurrentHours() {
		assertEquals(trishHours, LA.getCurrentHours(), .0);
		LA.setCurrentHours(50);
		assertEquals(50, LA.getCurrentHours(), .0);
		LA.setCurrentHours(-50);
		assertEquals(50, LA.getCurrentHours(), .0);
		LA.setCurrentHours(0);
		assertEquals(0, LA.getCurrentHours(), .0);
	}

	@Test
	public void testGetHourlyRate() {
		assertEquals(trishHourlyRate, LA.getHourlyRate(), .0);
	}

	@Test
	public void testSetHourlyRate() {
		assertEquals(trishHourlyRate, LA.getHourlyRate(), .0);
		LA.setHourlyRate(15.00);
		assertEquals(15.00, LA.getHourlyRate(), 0);
		LA.setHourlyRate(-.01);
		assertEquals(15.00, LA.getHourlyRate(), 0);
		LA.setHourlyRate(0);
		assertEquals(15.00, LA.getHourlyRate(), 0);
	}

	@Test
	public void testGetCurrentSales() {
		assertEquals(trishCurrentSales, LA.getCurrentSales(), .0);
	}

	@Test
	public void testSetCurrentSales() {
		assertEquals(trishCurrentSales, LA.getCurrentSales(), .0);
		LA.setCurrentSales(50000);
		assertEquals(50000, LA.getCurrentSales(), .0);
		LA.setCurrentSales(-1);
		assertEquals(50000, LA.getCurrentSales(), .0);
		LA.setCurrentSales(0);
		assertEquals(0, LA.getCurrentSales(), .0);
	}

}
