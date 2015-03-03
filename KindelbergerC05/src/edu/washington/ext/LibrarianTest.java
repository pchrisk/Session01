package edu.washington.ext;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LibrarianTest {
	
	double librarianBasePay = 4000.00;
	double librarianCurrentSales = 10000.00;
	double librarianBonusRate = .005;
	double librarianPay = 4502.50;
	
	Librarian librarian = new Librarian("Beth");
	

	@Before
	public void setUp() throws Exception {
		Librarian.setBonusRate(librarianBonusRate);
		librarian.setCurrentLibrarianTotals(librarianCurrentSales);
		librarian.setBasePay(librarianBasePay);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testLibrarian() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetBonusRate() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetBonusRate() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetCurrentLibraryTotals() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetCurrentLibraryTotals() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetCurrentLibrarianTotals() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetCurrentLibrarianTotals() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetName() {
		fail("Not yet implemented");
	}

	@Test
	public void testCalculatePay() {
		fail("Not yet implemented");
	}

}
