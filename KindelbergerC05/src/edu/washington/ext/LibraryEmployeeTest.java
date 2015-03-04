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
		assertEquals("class edu.washington.ext.LibraryEmployee", LE.getClass().toString());
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
		assertEquals(bobHours, LE.getCurrentHours(), .0);
		LE.setCurrentHours(40);
		assertEquals(40, LE.getCurrentHours(), .0);
		LE.setCurrentHours(-1);
		assertEquals(40, LE.getCurrentHours(), .0);
		LE.setCurrentHours(0);
		assertEquals(0, LE.getCurrentHours(), .0);
	}

	@Test
	public void testGetHourlyRate() {
		assertEquals(bobHourlyRate, LE.getHourlyRate(), .0);
	}

	@Test
	public void testSetHourlyRate() {
		assertEquals(bobHourlyRate, LE.getHourlyRate(), .0);
		LE.setHourlyRate(20.75);
		assertEquals(20.75, LE.getHourlyRate(), .0);
		LE.setHourlyRate(-1);
		assertEquals(20.75, LE.getHourlyRate(), .0);
		LE.setHourlyRate(0);
		assertEquals(20.75, LE.getHourlyRate(), .0);
	}

	@Test
	public void testGetCurrentSales() {
		assertEquals(bobCurrentSales, LE.getCurrentSales(), .0);
	}

	@Test
	public void testSetCurrentSales() {
		assertEquals(bobCurrentSales, LE.getCurrentSales(), .0);
		LE.setCurrentSales(7500);
		assertEquals(7500, LE.getCurrentSales(), .0);
		LE.setCurrentSales(-1);
		assertEquals(7500, LE.getCurrentSales(), .0);
		LE.setCurrentSales(0);
		assertEquals(0, LE.getCurrentSales(), .0);
	}

	@Test
	public void testCalculatePay() {
		assertEquals(bobPay, LE.calculatePay(), .0);
	}

}
