package edu.washington.ext;

import java.util.ArrayList;

public class Library {
	
	private int libraryNumber = 0;
	ArrayList<LibraryEmployee> employeeList;
	Librarian librarian;
	
	
	public Library(int librarynumber) {
		this.libraryNumber = librarynumber;
		employeeList = new ArrayList<LibraryEmployee>();		
		
	}
	
	public void processPayroll() {
		//List<PayrollRecord>
//		for each employee in employeelist and Librarian, add the name and pay (which will need to be calculated)
//		to PayrollRecord
		
		LibraryEmployee employee = null;
		
		ArrayList<PayrollRecord> payRollRecord = new ArrayList<PayrollRecord>();
		for (int i=0; i < employeeList.size(); i++) {
			employee = employeeList.get(i);
			System.out.println(employee.getName() + "\t" + employee.calculatePay());			
			payRollRecord.add(new PayrollRecord(employee.getName(), employee.calculatePay()));
			
			
			
		}
		
		payRollRecord.add(new PayrollRecord(librarian.getName(), librarian.calculatePay()));
		System.out.println(getCurrentUsedBookSales());
		librarian.setCurrentLibraryTotals(getCurrentUsedBookSales());
		System.out.println(librarian.calculatePay());
		
		
		
	}
	
	public void addEmployee(Object LibraryEmployee) {
		employeeList.add((LibraryEmployee) LibraryEmployee);
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
		this.librarian = librarian;

	}

}
