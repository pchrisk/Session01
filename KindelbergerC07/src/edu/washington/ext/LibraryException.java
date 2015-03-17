package edu.washington.ext;

import edu.washington.ext.common.CommissionedEmployee;

public class LibraryException extends Exception {
	
	private CommissionedEmployee employee;

	public LibraryException() {
		// TODO Auto-generated constructor stub
	}
	
	public LibraryException(CommissionedEmployee emp) {
		this.setEmployee(emp);
	}
	
		
	public LibraryException(String message) {
		super(message);
	}

	/**
	 * @return the employee
	 */
	public CommissionedEmployee getEmployee() {
		return employee;
	}

	/**
	 * @param employee the employee to set
	 */
	public void setEmployee(CommissionedEmployee employee) {
		this.employee = employee;
	}

}
