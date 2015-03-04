package edu.washington.ext;

import java.util.ArrayList;
import java.util.List;

public class Library {
	
	private int libraryNumber = 0;
	

	ArrayList<LibraryEmployee> employeeList;
	Librarian librarian;
	
	
	public Library(int librarynumber) {
		this.libraryNumber = librarynumber;
		employeeList = new ArrayList<LibraryEmployee>();		
		
	}
	
	public int getLibraryNumber() {
		return libraryNumber;
	}
	
	public List<PayrollRecord> processPayroll() {
				
		LibraryEmployee employee = null;
		
		ArrayList<PayrollRecord> payRollRecord = new ArrayList<PayrollRecord>();
		for (int i=0; i < employeeList.size(); i++) {
			employee = employeeList.get(i);
			payRollRecord.add(new PayrollRecord(employee.getName(), employee.calculatePay()));			
			
		}
		
		payRollRecord.add(new PayrollRecord(librarian.getName(), librarian.calculatePay()));
				
		return payRollRecord;		
	}
	
	public void addEmployee(Object LibraryEmployee) {
		if (LibraryEmployee instanceof LibraryEmployee) {
			employeeList.add((LibraryEmployee) LibraryEmployee);
		}
	}
	
	public double getCurrentUsedBookSales() {
		
		LibraryEmployee employee = null;
		double total = 0;
		for (int i=0; i < employeeList.size(); i++) {
			employee = employeeList.get(i);
			total = total + employee.getCurrentSales();
		}	
		total = total + librarian.getCurrentLibrarianTotals();		
		
		return total;
	}
	
	public void setLibrarian(Librarian librarian) {
		if (librarian instanceof Librarian) {
			this.librarian = librarian;
		}

	}

}
