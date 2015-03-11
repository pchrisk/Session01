package edu.washington.ext;

import java.util.ArrayList;
import java.util.List;

import edu.washington.ext.common.AbstractEmployee;

/**
 * The Class Library.
 */
public class Library {

	/** The library number. */
	private int libraryNumber;
	
	/** The staff. */
	private List<AbstractEmployee> staff;
	
	/** The librarian. */
	private Librarian librarian;

	/**
	 * Instantiates a new library.
	 *
	 * @param libraryNumber the library number
	 */
	protected Library(final int libraryNumber) {
		this.libraryNumber = libraryNumber;
		staff = new ArrayList<AbstractEmployee>();

	}

	/**
	 * Gets the library number.
	 *
	 * @return the library number
	 */
	protected final int getLibraryNumber() {
		return libraryNumber;
	}

	/**
	 * Process payroll.
	 *
	 * @return the list
	 */
	protected final List<PayrollRecord> processPayroll() {
		List<PayrollRecord> payroll = new ArrayList<PayrollRecord>();
		double storeSales = 0;
		for (AbstractEmployee emp : staff) {
			PayrollRecord payRec;
			payRec = new PayrollRecord(emp.getName(), emp.calculatePay());
			payroll.add(payRec);
			storeSales += emp.getCurrentSales();
		}
		storeSales += librarian.getCurrentSales();
		librarian.setCurrentLibraryTotals(storeSales);
		PayrollRecord mgrPayRec;
		mgrPayRec = new PayrollRecord(librarian.getName(),
				librarian.calculatePay());
		payroll.add(mgrPayRec);

		return payroll;
	}

	/**
	 * Gets the current used book sales.
	 *
	 * @return the current used book sales
	 */
	protected final double getCurrentUsedBookSales() {
		double storeSales = 0;
		for (AbstractEmployee emp : staff) {
			storeSales += emp.getCurrentSales();
		}
		storeSales += librarian.getCurrentSales();
		return storeSales;
	}

	/**
	 * Gets the total commissions.
	 *
	 * @return the total commissions
	 */
	protected final double getTotalCommissions() {
		double totalCommission = 0;
		double storeSales = 0;
		for (AbstractEmployee emp : staff) {
			if (emp instanceof LibraryAssociate) {
				storeSales += emp.getCurrentSales();
				totalCommission += ((LibraryAssociate) emp)
						.calculateCommission();
			} else if (emp instanceof LibraryEmployee) {
				storeSales += emp.getCurrentSales();
			}
		}
		storeSales += librarian.getCurrentSales();
		librarian.setCurrentLibraryTotals(storeSales);
		totalCommission += librarian.calculateCommission();
		return totalCommission;
	}

	/**
	 * Adds the employee.
	 *
	 * @param employee the employee
	 */
	protected final void addEmployee(final AbstractEmployee employee) {
		staff.add(employee);
	}

	/**
	 * Sets the librarian.
	 *
	 * @param librarian the new librarian
	 */
	protected final void setLibrarian(final Librarian librarian) {
		this.librarian = librarian;
	}

}
