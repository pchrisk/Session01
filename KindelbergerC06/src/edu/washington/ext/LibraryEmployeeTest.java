package edu.washington.ext;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LibraryEmployeeTest {

	/** The le. */
	LibraryEmployee LE = new LibraryEmployee("bob");	
	
	/** The bob pay. */
	double bobPay = 1680.00;
	
	/** The bob hours. */
	double bobHours = 160.00;
	
	/** The bob hourly rate. */
	double bobHourlyRate = 10.50;
	
	/** The bob current sales. */
	double bobCurrentSales = 500.00;
	

	/**
	 * Sets the upefore.
	 *
	 * @throws Exception the exception
	 */
	@Before
	public void setUpefore() throws Exception {
		
		LE.setHourlyRate(bobHourlyRate);
		LE.setCurrentHours(bobHours);
		LE.setCurrentSales(bobCurrentSales);
				
	}

	/**
	 * Tear down.
	 *
	 * @throws Exception the exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test library employee.
	 */
	@Test
	public void testLibraryEmployee() {
		assertEquals("class edu.washington.ext.LibraryEmployee", LE.getClass().toString());
	}

	/**
	 * Test get name.
	 */
	@Test
	public void testGetName() {
		assertEquals("bob", LE.getName());
	}

	/**
	 * Test get current hours.
	 */
	@Test
	public void testGetCurrentHours() {
		assertEquals(bobHours, LE.getCurrentHours(), .0);
	}

	/**
	 * Test set current hours.
	 */
	@Test
	public void testSetCurrentHours() {
		assertEquals(bobHours, LE.getCurrentHours(), .0);
		LE.setCurrentHours(40);
		assertEquals(40, LE.getCurrentHours(), .0);
//		LE.setCurrentHours(-1);
//		assertEquals(40, LE.getCurrentHours(), .0);
//		LE.setCurrentHours(0);
//		assertEquals(0, LE.getCurrentHours(), .0);
	}

	/**
	 * Test get hourly rate.
	 */
	@Test
	public void testGetHourlyRate() {
		assertEquals(bobHourlyRate, LE.getHourlyRate(), .0);
	}

	/**
	 * Test set hourly rate.
	 */
	@Test
	public void testSetHourlyRate() {
		assertEquals(bobHourlyRate, LE.getHourlyRate(), .0);
		LE.setHourlyRate(20.75);
		assertEquals(20.75, LE.getHourlyRate(), .0);
//		LE.setHourlyRate(-1);
//		assertEquals(20.75, LE.getHourlyRate(), .0);
//		LE.setHourlyRate(0);
//		assertEquals(20.75, LE.getHourlyRate(), .0);
	}

	/**
	 * Test get current sales.
	 */
	@Test
	public void testGetCurrentSales() {
		assertEquals(bobCurrentSales, LE.getCurrentSales(), .0);
	}

	/**
	 * Test set current sales.
	 */
	@Test
	public void testSetCurrentSales() {
		assertEquals(bobCurrentSales, LE.getCurrentSales(), .0);
		LE.setCurrentSales(7500);
		assertEquals(7500, LE.getCurrentSales(), .0);
//		LE.setCurrentSales(-1);
//		assertEquals(7500, LE.getCurrentSales(), .0);
//		LE.setCurrentSales(0);
//		assertEquals(0, LE.getCurrentSales(), .0);
	}

	/**
	 * Test calculate pay.
	 */
	@Test
	public void testCalculatePay() {
		assertEquals(bobPay, LE.calculatePay(), .0);
	}


}
