package edu.washington.ext;

import java.util.ArrayList;
import java.util.List;


/**
 * The Class Library.
 */
public class Library {
	
	/** The library number. */
	private int libraryNumber = 0;
	

	/** The employee list. */
	private ArrayList<LibraryEmployee> employeeList = null;
	
	/** The librarian. */
	private Librarian librarian = null;
	
	
	/**
	 * Instantiates a new library.
	 *
	 * @param librarynumber the librarynumber
	 */
	public Library(final int librarynumber) {
		this.libraryNumber = librarynumber;
		employeeList = new ArrayList<LibraryEmployee>();		
		
	}
	
	/**
	 * Gets the library number.
	 *
	 * @return the library number
	 */
	public final int getLibraryNumber() {
		return libraryNumber;
	}
	
	/**
	 * Process payroll.
	 *
	 * @return the list
	 */
	public final List<PayrollRecord> processPayroll() {
				
		LibraryEmployee employee = null;
		
		ArrayList<PayrollRecord> payRollRecord = new ArrayList<PayrollRecord>();
		for (int i = 0; i < employeeList.size(); i++) {
			employee = employeeList.get(i);
			payRollRecord.add(new PayrollRecord(employee.getName(), employee.calculatePay()));			
			
		}
		
		librarian.setCurrentLibraryTotals(getCurrentUsedBookSales());
		
		payRollRecord.add(new PayrollRecord(librarian.getName(), librarian.calculatePay()));
				
		return payRollRecord;		
	}
	
	/**
	 * Adds the employee.
	 *
	 * @param libraryEmployee the library employee
	 */
	public final void addEmployee(Object libraryEmployee) {
		if (libraryEmployee instanceof LibraryEmployee) {
			employeeList.add((LibraryEmployee) libraryEmployee);
		}
	}
	
	/**
	 * Gets the current used book sales.
	 *
	 * @return the current used book sales
	 */
	public final double getCurrentUsedBookSales() {
		
		LibraryEmployee employee = null;
		double total = 0;
		for (int i = 0; i < employeeList.size(); i++) {
			employee = employeeList.get(i);
			total = total + employee.getCurrentSales();
		}	
		total = total + librarian.getCurrentLibrarianTotals();		
		
		return total;
	}
	
	/**
	 * Sets the librarian.
	 *
	 * @param librarian the new librarian
	 */
	public final void setLibrarian(Librarian librarian) {
		if (librarian instanceof Librarian) {
			this.librarian = librarian;
		}

	}

}
