package edu.washington.ext;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * The Class LibraryTest.
 */
public class LibraryTest {

	/** The zero. */
	double zero = 0;

	/** The neg. */
	double neg = -1;

	/** The la1 name. */
	String la1Name = "Peter";

	/** The la1 pay. */
	double la1Pay = 2025.00;

	/** The la1 hours. */
	double la1Hours = 138.00;

	/** The la1 hourly rate. */
	double la1HourlyRate = 12.50;

	/** The la1 current sales. */
	double la1CurrentSales = 15000.00;

	/** The la1 commission rate. */
	double la1CommissionRate = .02;

	/** The la2 name. */
	String la2Name = "Paul";

	/** The la2 pay. */
	double la2Pay = 2920.00;

	/** The la2 hours. */
	double la2Hours = 160.00;

	/** The la2 hourly rate. */
	double la2HourlyRate = 14.50;

	/** The la2 current sales. */
	double la2CurrentSales = 30000.00;

	/** The la2 commission rate. */
	double la2CommissionRate = .02;

	/** The la3 name. */
	String la3Name = "Mary";

	/** The la3 pay. */
	double la3Pay = 3750.00;

	/** The la3 hours. */
	double la3Hours = 160.00;

	/** The la3 hourly rate. */
	double la3HourlyRate = 15.00;

	/** The la3 current sales. */
	double la3CurrentSales = 45000.00;

	/** The la3 commission rate. */
	double la3CommissionRate = .03;

	/** The le1 name. */
	String le1Name = "Joan";

	/** The le1 pay. */
	double le1Pay = 1680.00;

	/** The le1 hours. */
	double le1Hours = 160.00;

	/** The le1 hourly rate. */
	double le1HourlyRate = 10.50;

	/** The le1 current sales. */
	double le1CurrentSales = 500.00;

	/** The librarian name. */
	String librarianName = "Beth";

	/** The librarian base pay. */
	double librarianBasePay = 4000.00;

	/** The librarian current sales. */
	double librarianCurrentSales = 10000.00;

	/** The librarian bonus rate. */
	double librarianBonusRate = .005;

	/** The librarian pay. */
	double librarianPay = 4502.50;

	/** The current library used book sales. */
	double currentLibraryUsedBookSales = 100500;

	/** The total commission. */
	double totalCommission = 2752.50;

	/** The librarian. */
	Librarian librarian = new Librarian(librarianName);

	/** The L a1. */
	LibraryAssociate LA1 = new LibraryAssociate(la1Name);

	/** The L a2. */
	LibraryAssociate LA2 = new LibraryAssociate(la2Name);

	/** The L a3. */
	LibraryAssociate LA3 = new LibraryAssociate(la3Name);

	/** The L e1. */
	LibraryEmployee LE1 = new LibraryEmployee(le1Name);

	/** The library. */
	Library library = new Library(1);

	/** The library. */
	Library libraryNoEmployees = new Library(2);

	/**
	 * Sets the up.
	 *
	 * @throws Exception
	 *             the exception
	 */
	@Before
	public void setUp() throws Exception {

		LA1.setHourlyRate(la1HourlyRate);
		LA1.setCurrentHours(la1Hours);
		LA1.setCurrentSales(la1CurrentSales);
		LA1.setCommissionRate(la1CommissionRate);

		LA2.setHourlyRate(la2HourlyRate);
		LA2.setCurrentHours(la2Hours);
		LA2.setCurrentSales(la2CurrentSales);
		LA2.setCommissionRate(la2CommissionRate);

		LA3.setHourlyRate(la3HourlyRate);
		LA3.setCurrentHours(la3Hours);
		LA3.setCurrentSales(la3CurrentSales);
		LA3.setCommissionRate(la3CommissionRate);

		LE1.setHourlyRate(le1HourlyRate);
		LE1.setCurrentHours(le1Hours);
		LE1.setCurrentSales(le1CurrentSales);

		Librarian.setcommissionRate(librarianBonusRate);
		librarian.setCurrentSales(librarianCurrentSales);
		librarian.setBasePay(librarianBasePay);

		library.addEmployee(LA1);
		library.addEmployee(LA2);
		library.addEmployee(LA3);
		library.addEmployee(LE1);

		library.setLibrarian(librarian);
		libraryNoEmployees.setLibrarian(librarian);

	}

	/**
	 * Tear down.
	 *
	 * @throws Exception
	 *             the exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test process payroll.
	 *
	 * @throws LibraryException
	 *             the library exception
	 */
	@Test
	public void testProcessPayroll() throws LibraryException {

		List<PayrollRecord> payroll = library.processPayroll();
		assertEquals(5, payroll.size());
		for (PayrollRecord payRec : payroll) {
			if (librarianName.equals(payRec.getEmployeeName())) {
				assertEquals(librarianPay, payRec.getCurrentPay(), 0);
			} else if (le1Name.equals(payRec.getEmployeeName())) {
				assertEquals(le1Pay, payRec.getCurrentPay(), 0);
			} else if (la1Name.equals(payRec.getEmployeeName())) {
				assertEquals(la1Pay, payRec.getCurrentPay(), 0);
			} else if (la2Name.equals(payRec.getEmployeeName())) {
				assertEquals(la2Pay, payRec.getCurrentPay(), 0);
			} else if (la3Name.equals(payRec.getEmployeeName())) {
				assertEquals(la3Pay, payRec.getCurrentPay(), 0);
			} else {
				fail("Unknown employee!");
			}
		}

	}

	/** The exception. */
	@Rule
	public ExpectedException exception = ExpectedException.none();

	/**
	 * Test process payroll.
	 *
	 * @throws LibraryException
	 *             the library exception
	 */
	@Test
	public void testProcessPayrollWithException() throws LibraryException {

		LA1.setCommissionRate(2);
		exception.expect(LibraryException.class);

		List<PayrollRecord> payroll = library.processPayroll();
		assertEquals(5, payroll.size());
		for (PayrollRecord payRec : payroll) {
			if (librarianName.equals(payRec.getEmployeeName())) {
				assertEquals(librarianPay, payRec.getCurrentPay(), 0);
			} else if (le1Name.equals(payRec.getEmployeeName())) {
				assertEquals(le1Pay, payRec.getCurrentPay(), 0);
			} else if (la1Name.equals(payRec.getEmployeeName())) {
				assertEquals(la1Pay, payRec.getCurrentPay(), 0);
			} else if (la2Name.equals(payRec.getEmployeeName())) {
				assertEquals(la2Pay, payRec.getCurrentPay(), 0);
			} else if (la3Name.equals(payRec.getEmployeeName())) {
				assertEquals(la3Pay, payRec.getCurrentPay(), 0);
			} else {
				fail("Unknown employee!");
			}
		}

	}

	/**
	 * Test process payroll.
	 *
	 * @throws LibraryException
	 *             the library exception
	 */
	@Test
	public void testProcessPayrollWithException2() throws LibraryException {

		exception.expect(LibraryException.class);

		List<PayrollRecord> payroll = libraryNoEmployees.processPayroll();
		assertEquals(5, payroll.size());
		for (PayrollRecord payRec : payroll) {
			if (librarianName.equals(payRec.getEmployeeName())) {
				assertEquals(librarianPay, payRec.getCurrentPay(), 0);
			} else if (le1Name.equals(payRec.getEmployeeName())) {
				assertEquals(le1Pay, payRec.getCurrentPay(), 0);
			} else if (la1Name.equals(payRec.getEmployeeName())) {
				assertEquals(la1Pay, payRec.getCurrentPay(), 0);
			} else if (la2Name.equals(payRec.getEmployeeName())) {
				assertEquals(la2Pay, payRec.getCurrentPay(), 0);
			} else if (la3Name.equals(payRec.getEmployeeName())) {
				assertEquals(la3Pay, payRec.getCurrentPay(), 0);
			} else {
				fail("Unknown employee!");
			}
		}

	}

	/**
	 * Test get current used book sales.
	 *
	 * @throws LibraryException
	 *             the library exception
	 */
	@Test
	public void testGetCurrentUsedBookSales() throws LibraryException {
		assertEquals(currentLibraryUsedBookSales,
				library.getCurrentUsedBookSales(), .0);
	}

	/**
	 * Test get current used book sales.
	 *
	 * @throws LibraryException
	 *             the library exception
	 */
	@Test
	public void testGetCurrentUsedBookSales2() throws LibraryException {

		exception.expect(LibraryException.class);
		libraryNoEmployees.getCurrentUsedBookSales();

		// assertEquals(currentLibraryUsedBookSales,
		// libraryNoEmployees.getCurrentUsedBookSales(), .0);
	}

	/**
	 * Test get total commissions.
	 *
	 * @throws LibraryCommissionException
	 *             the library commission exception
	 */
	@Test
	public void testGetTotalCommissions() throws LibraryCommissionException {
		assertEquals(totalCommission, library.getTotalCommissions(), .0);
	}

	/**
	 * Test get total commissions.
	 *
	 * @throws LibraryCommissionException
	 *             the library commission exception
	 */
	@Test
	public void testGetTotalCommissionsException()
			throws LibraryCommissionException {

		exception.expect(LibraryCommissionException.class);

		LA1.setCommissionRate(1);
		LA2.setCurrentSales(1);
		LA3.setCurrentSales(1);
		Librarian.setcommissionRate(neg);

		library.getTotalCommissions();
	}

	/**
	 * Test set current sales neg.
	 */
	@Test
	public void testSetCurrentSalesNeg() {

		exception.expect(IllegalArgumentException.class);

		LA1.setCurrentSales(neg);
	}

	/**
	 * Test set current sales zero.
	 */
	@Test
	public void testSetCurrentSalesZero() {

		exception.expect(IllegalArgumentException.class);

		LA1.setCurrentSales(zero);
	}

	/**
	 * Test set hourly rate neg.
	 */
	@Test
	public void testSetHourlyRateNeg() {

		exception.expect(IllegalArgumentException.class);

		LA1.setHourlyRate(neg);
	}

	/**
	 * Test set hourly rate zero.
	 */
	@Test
	public void testSetHourlyRateZero() {

		exception.expect(IllegalArgumentException.class);

		LA1.setHourlyRate(zero);
	}

	/**
	 * Test set current hours neg.
	 */
	@Test
	public void testSetCurrentHoursNeg() {

		exception.expect(IllegalArgumentException.class);

		LA1.setCurrentHours(neg);
	}

	/**
	 * Test set current hours zero.
	 */
	@Test
	public void testSetCurrentHoursZero() {

		exception.expect(IllegalArgumentException.class);

		LA1.setCurrentHours(zero);
	}

	/**
	 * Test set commission rate neg.
	 */
	@Test
	public void testSetCommissionRateNeg() {

		exception.expect(IllegalArgumentException.class);
		LA1.setCommissionRate(neg);

	}

	/**
	 * Test set commission rate zero.
	 */
	@Test
	public void testSetCommissionRateZero() {

		exception.expect(IllegalArgumentException.class);
		LA1.setCommissionRate(zero);

	}

	/**
	 * Test set current librarian used book totals neg.
	 */
	@Test
	public void testSetCurrentLibrarianUsedBookTotalsNeg() {

		exception.expect(IllegalArgumentException.class);
		librarian.setCurrentSales(neg);

	}

	/**
	 * Test set current librarian used book totals zero.
	 */
	@Test
	public void testSetCurrentLibrarianUsedBookTotalsZero() {

		exception.expect(IllegalArgumentException.class);
		librarian.setCurrentSales(zero);

	}

	/**
	 * Test set base pay zero.
	 */
	@Test
	public void testSetBasePayZero() {

		exception.expect(IllegalArgumentException.class);
		librarian.setBasePay(zero);

	}

	/**
	 * Test set current library used book sales totals neg.
	 */
	@Test
	public void testSetCurrentLibraryUsedBookSalesTotalsNeg() {

		exception.expect(IllegalArgumentException.class);
		librarian.setCurrentLibraryTotals(neg);

	}

	/**
	 * Test set current library used book sales totals zero.
	 */
	@Test
	public void testSetCurrentLibraryUsedBookSalesTotalsZero() {

		exception.expect(IllegalArgumentException.class);
		librarian.setCurrentLibraryTotals(zero);

	}

	/**
	 * Test library zero.
	 */
	@Test
	public void testLibraryZero() {

		exception.expect(IllegalArgumentException.class);

		Library libraryNegNumber = new Library(0);
		libraryNegNumber.getLibraryNumber();
	}

	/**
	 * Test library neg.
	 */
	@Test
	public void testLibraryNeg() {

		exception.expect(IllegalArgumentException.class);

		Library libraryNegNumber = new Library(-1);
		libraryNegNumber.getLibraryNumber();
	}

}
