package edu.washington.ext;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

// TODO: Auto-generated Javadoc
/**
 * The Class LibrarianTest.
 */
public class LibrarianTest {
	
	/** The librarian base pay. */
	double librarianBasePay = 4000.00;
	
	/** The librarian current sales. */
	double librarianCurrentSales = 10000.00;
	
	/** The librarian bonus rate. */
	double librarianBonusRate = .005;
	
	/** The librarian pay. */
	double librarianPay = 4502.50;
	
	/** The library current sales. */
	double libraryCurrentSales = 100500;
	
	/** The librarian. */
	Librarian librarian = new Librarian("Beth");
	

	/**
	 * Sets the up.
	 *
	 * @throws Exception the exception
	 */
	@Before
	public void setUp() throws Exception {
		Librarian.setBonusRate(librarianBonusRate);
		librarian.setCurrentLibrarianTotals(librarianCurrentSales);
		librarian.setBasePay(librarianBasePay);
		librarian.setCurrentLibraryTotals(libraryCurrentSales);
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
	 * Test librarian.
	 */
	@Test
	public void testLibrarian() {
		assertEquals("class edu.washington.ext.Librarian", librarian.getClass().toString());
	}

	/**
	 * Test get bonus rate.
	 */
	@Test
	public void testGetBonusRate() {
		assertEquals(librarianBonusRate, Librarian.getBonusRate(), 0);
	}

	/**
	 * Test set bonus rate.
	 */
	@Test
	public void testSetBonusRate() {
		assertEquals(librarianBonusRate, Librarian.getBonusRate(), 0);
		Librarian.setBonusRate(.004);
		assertEquals(.004, Librarian.getBonusRate(), 0);
		Librarian.setBonusRate(-.004);
		assertEquals(.004, Librarian.getBonusRate(), 0);
		Librarian.setBonusRate(0);
		assertEquals(.004, Librarian.getBonusRate(), 0);
	}

	/**
	 * Test get current library totals.
	 */
	@Test
	public void testGetCurrentLibraryTotals() {
		assertEquals(libraryCurrentSales, librarian.getCurrentLibraryTotals(), 0);
	}

	/**
	 * Test set current library totals.
	 */
	@Test
	public void testSetCurrentLibraryTotals() {
		assertEquals(libraryCurrentSales, librarian.getCurrentLibraryTotals(), 0);
		librarian.setCurrentLibraryTotals(400000);
		assertEquals(400000, librarian.getCurrentLibraryTotals(), 0);
	}

	/**
	 * Test get current librarian totals.
	 */
	@Test
	public void testGetCurrentLibrarianTotals() {
		assertEquals(librarianCurrentSales, librarian.getCurrentLibrarianTotals(), 0);
	}

	/**
	 * Test set current librarian totals.
	 */
	@Test
	public void testSetCurrentLibrarianTotals() {
		assertEquals(librarianCurrentSales, librarian.getCurrentLibrarianTotals(), 0);
		librarian.setCurrentLibrarianTotals(3000);
		assertEquals(3000, librarian.getCurrentLibrarianTotals(), 0);
	}

	/**
	 * Test get name.
	 */
	@Test
	public void testGetName() {
		assertEquals("Beth", librarian.getName());
	}

	/**
	 * Test calculate pay.
	 */
	@Test
	public void testCalculatePay() {
		assertEquals(librarianPay, librarian.calculatePay(), 0);
	}

}
