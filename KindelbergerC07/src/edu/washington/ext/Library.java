package edu.washington.ext;

import java.util.ArrayList;
import java.util.List;

import edu.washington.ext.common.AbstractEmployee;
import edu.washington.ext.common.CommissionedEmployee;


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
		if (libraryNumber >= 0) {
			this.libraryNumber = libraryNumber;
			staff = new ArrayList<AbstractEmployee>();
		} else {
			throw new IllegalArgumentException("Library number must be 0 or greater.");
		}

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
	 * @throws LibraryException 
	 */
	protected final List<PayrollRecord> processPayroll() throws LibraryException {
		List<PayrollRecord> payroll = new ArrayList<PayrollRecord>();
		double storeSales = 0;
		try {
		for (AbstractEmployee emp : staff) {
			PayrollRecord payRec;
			if ((emp instanceof LibraryAssociate) && ((LibraryAssociate)emp).getCommissionRate() > 1) {
				throw new LibraryException((CommissionedEmployee)emp);
			} else {
				payRec = new PayrollRecord(emp.getName(), emp.calculatePay());
				payroll.add(payRec);
				storeSales += emp.getCurrentSales();
			}
		}
		storeSales += librarian.getCurrentSales();
		librarian.setCurrentLibraryTotals(storeSales);
		PayrollRecord mgrPayRec;
		mgrPayRec = new PayrollRecord(librarian.getName(),
				librarian.calculatePay());
		payroll.add(mgrPayRec);
		
		return payroll;
		}
		catch(LibraryException e){
			throw new LibraryException(((AbstractEmployee)e.getEmployee()).getName() + " commission rate is greater than 100%");
		}
		catch(Exception e) {
			throw e;
		}

		
	}

	/**
	 * Gets the current used book sales.
	 *
	 * @return the current used book sales
	 * @throws LibraryException 
	 */
	protected final double getCurrentUsedBookSales() throws LibraryException {
		double storeSales = 0;
		if (!staff.isEmpty()) {
			for (AbstractEmployee emp : staff) {
				storeSales += emp.getCurrentSales();
			}
		} else {
			throw new LibraryException();
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
