package edu.washington.ext;

import edu.washington.ext.common.CommissionedEmployee;

/**
 * The Class LibraryException.
 */
public class LibraryException extends Exception {
	
	/** The employee. */
	private CommissionedEmployee employee;

	/**
	 * Instantiates a new library exception.
	 */
	public LibraryException() {
	}
	
	/**
	 * Instantiates a new library exception.
	 *
	 * @param emp the emp
	 */
	public LibraryException(CommissionedEmployee emp) {
		this.setEmployee(emp);
	}
	
		
	/**
	 * Instantiates a new library exception.
	 *
	 * @param message the message
	 */
	public LibraryException(String message) {
		super(message);
	}

	/**
	 * Gets the employee.
	 *
	 * @return the employee
	 */
	public CommissionedEmployee getEmployee() {
		return employee;
	}

	/**
	 * Sets the employee.
	 *
	 * @param employee the employee to set
	 */
	public void setEmployee(CommissionedEmployee employee) {
		this.employee = employee;
	}

}
