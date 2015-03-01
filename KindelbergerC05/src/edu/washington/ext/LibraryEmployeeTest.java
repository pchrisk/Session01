package edu.washington.ext;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LibraryEmployeeTest {
	
	LibraryEmployee LE = new LibraryEmployee("bob");	
	double bobPay = 1680.00;
	double bobHours = 160.00;
	double bobHourlyRate = 10.50;
	double bobCurrentSales = 500.00;
	

	@Before
	public void setUpefore() throws Exception {
		
		LE.setHourlyRate(bobHourlyRate);
		LE.setCurrentHours(bobHours);
		LE.setCurrentSales(bobCurrentSales);
				
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testLibraryEmployee() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetName() {
		assertEquals("bob", LE.getName());
	}

	@Test
	public void testGetCurrentHours() {
		assertEquals(bobHours, LE.getCurrentHours(), .0);
	}

	@Test
	public void testSetCurrentHours() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetHourlyRate() {
		assertEquals(bobHourlyRate, LE.getHourlyRate(), .0);
	}

	@Test
	public void testSetHourlyRate() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetCurrentSales() {
		assertEquals(bobCurrentSales, LE.getCurrentSales(), .0);;
	}

	@Test
	public void testSetCurrentSales() {
		fail("Not yet implemented");
	}

	@Test
	public void testCalculatePay() {
		System.out.println(LE.getName());
		System.out.println(LE.getHourlyRate());
		System.out.println(LE.getCurrentHours());
		System.out.println(LE.calculatePay());

		assertEquals(bobPay, LE.calculatePay(), .0);
	}

}
