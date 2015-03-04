package edu.washington.ext;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LibraryTest {
	
	double la1Pay = 2025.00;
	double la1Hours = 138.00;
	double la1HourlyRate = 12.50;
	double la1CurrentSales = 15000.00;
	double la1CommisionRate = .02;
	
	double la2Pay = 2920.00;
	double la2Hours = 160.00;
	double la2HourlyRate = 14.50;
	double la2CurrentSales = 30000.00;
	double la2CommisionRate = .02;
	
	double la3Pay = 3750.00;
	double la3Hours = 160.00;
	double la3HourlyRate = 15.00;
	double la3CurrentSales = 45000.00;
	double la3CommisionRate = .03;
	
	
	double le1Pay = 1680.00;
	double le1Hours = 160.00;
	double le1HourlyRate = 10.50;
	double le1CurrentSales = 500.00;
	
	double librarianBasePay = 4000.00;
	double librarianCurrentSales = 10000.00;
	double librarianBonusRate = .005;
	double librarianPay = 4502.50;
	
	double currentLibraryUsedBookSales = 100500;
	
	Librarian librarian = new Librarian("Beth");
	
	LibraryAssociate LA1 = new LibraryAssociate("Peter");
	LibraryAssociate LA2 = new LibraryAssociate("Paul");
	LibraryAssociate LA3 = new LibraryAssociate("Mary");
	LibraryEmployee LE1 = new LibraryEmployee("Joan");
	
	Library library = new Library(1);
	
	

	@Before
	public void setUp() throws Exception {
		
		LA1.setHourlyRate(la1HourlyRate);
		LA1.setCurrentHours(la1Hours);
		LA1.setCurrentSales(la1CurrentSales);
		LA1.setCommisionRate(la1CommisionRate);
		
		LA2.setHourlyRate(la2HourlyRate);
		LA2.setCurrentHours(la2Hours);
		LA2.setCurrentSales(la2CurrentSales);
		LA2.setCommisionRate(la2CommisionRate);
		
		LA3.setHourlyRate(la3HourlyRate);
		LA3.setCurrentHours(la3Hours);
		LA3.setCurrentSales(la3CurrentSales);
		LA3.setCommisionRate(la3CommisionRate);
		
		LE1.setHourlyRate(le1HourlyRate);
		LE1.setCurrentHours(le1Hours);
		LE1.setCurrentSales(le1CurrentSales);
		
		Librarian.setBonusRate(librarianBonusRate);
		librarian.setCurrentLibrarianTotals(librarianCurrentSales);
		librarian.setBasePay(librarianBasePay);
		
		
	}

	
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testLibrary() {
		
		Library library = new Library(2);
		assertEquals(2, library.getLibraryNumber(), 0);
	}

	@Test
	public void testProcessPayroll() {
		List<PayrollRecord> payrollList = new ArrayList<PayrollRecord>();
		
		testAddEmployee();
		testSetLibrarian();
		payrollList = library.processPayroll();
		assertEquals(5, payrollList.size());
		
	}

	@Test
	public void testAddEmployee() {
		library.addEmployee(LA1);
		library.addEmployee(LA2);
		library.addEmployee(LA3);
		library.addEmployee(LE1);
		
	}

	@Test
	public void testGetCurrentUsedBookSales() {
		testAddEmployee();
		testSetLibrarian();
		assertEquals(currentLibraryUsedBookSales, library.getCurrentUsedBookSales(), .0);
	}

	@Test
	public void testSetLibrarian() {
		library.setLibrarian(librarian);
		assertEquals("Beth", librarian.getName());
	}

}
