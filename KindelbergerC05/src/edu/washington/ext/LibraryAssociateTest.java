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
		fail("Not yet implemented");
	}

	@Test
	public void testGetCommisionRate() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetCommisionRate() {
		fail("Not yet implemented");
	}

	@Test
	public void testLibraryEmployee() {
		fail("Not yet implemented");
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
		fail("Not yet implemented");
	}

	@Test
	public void testGetHourlyRate() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetHourlyRate() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetCurrentSales() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetCurrentSales() {
		fail("Not yet implemented");
	}

}
