package edu.washington.ext;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The Class LibraryAssociateTest.
 */
public class LibraryAssociateTest {
	
	/** The trish pay. */
	double trishPay = 2025.00;
	
	/** The trish hours. */
	double trishHours = 138.00;
	
	/** The trish hourly rate. */
	double trishHourlyRate = 12.50;
	
	/** The trish current sales. */
	double trishCurrentSales = 15000.00;
	
	/** The trish commission rate. */
	double trishCommissionRate = .02;
	
	
	/** The la. */
	LibraryAssociate LA = new LibraryAssociate("Trish");
	
	

	/**
	 * Sets the up.
	 *
	 * @throws Exception the exception
	 */
	@Before
	public void setUp() throws Exception {
		LA.setHourlyRate(trishHourlyRate);
		LA.setCurrentHours(trishHours);
		LA.setCurrentSales(trishCurrentSales);
		LA.setCommissionRate(trishCommissionRate);
		
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
	 * Test calculate pay.
	 */
	@Test
	public void testCalculatePay() {
		assertEquals(trishPay, LA.calculatePay(), .0);
	}

	/**
	 * Test library associate.
	 */
	@Test
	public void testLibraryAssociate() {
		assertEquals("class edu.washington.ext.LibraryAssociate", LA.getClass().toString());
	}

	/**
	 * Test get commision rate.
	 */
	@Test
	public void testGetCommissionRate() {
		assertEquals(trishCommissionRate, LA.getCommissionRate(), 0);
	}

	/**
	 * Test set commision rate.
	 */
	@Test
	public void testSetCommissionRate() {
		assertEquals(trishCommissionRate, LA.getCommissionRate(), 0);
		LA.setCommissionRate(.03);
		assertEquals(.03, LA.getCommissionRate(), 0);
		LA.setCommissionRate(-.01);
		assertEquals(.03, LA.getCommissionRate(), 0);
		LA.setCommissionRate(0);
		assertEquals(.03, LA.getCommissionRate(), 0);
		
	}

	
	/**
	 * Test get name.
	 */
	@Test
	public void testGetName() {
		assertEquals("Trish", LA.getName());
	}

	/**
	 * Test get current hours.
	 */
	@Test
	public void testGetCurrentHours() {
		assertEquals(trishHours, LA.getCurrentHours(), .0);
	}

	/**
	 * Test set current hours.
	 */
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

	/**
	 * Test get hourly rate.
	 */
	@Test
	public void testGetHourlyRate() {
		assertEquals(trishHourlyRate, LA.getHourlyRate(), .0);
	}

	/**
	 * Test set hourly rate.
	 */
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

	/**
	 * Test get current sales.
	 */
	@Test
	public void testGetCurrentSales() {
		assertEquals(trishCurrentSales, LA.getCurrentSales(), .0);
	}

	/**
	 * Test set current sales.
	 */
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
