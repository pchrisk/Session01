package edu.washington.ext;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LibraryEmployeeTest {
	
	LibraryEmployee LE = new LibraryEmployee("bob");	
	double bobPay = 1680.00;

	@Before
	public void setUpefore() throws Exception {
		
		LE.setHourlyRate(10.50);
		LE.setCurrentHours(160.00);
		LE.setCurrentSales(500.00);
		
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
		fail("Not yet implemented");
	}

	@Test
	public void testGetCurrentHours() {
		fail("Not yet implemented");
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

	@Test
	public void testCalculatePay() {
		System.out.println(LE.getName());
		assertEquals(bobPay, LE.calculatePay());
	}

}
