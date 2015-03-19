package edu.washington.ext;

import edu.washington.ext.common.CommissionedEmployee;

/**
 * The Class LibraryException.
 */
public class LibraryException extends Exception {
	
	/**
	 * Default serial version ID.
	 */
	private static final long serialVersionUID = 1L;
	
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
	public LibraryException(final CommissionedEmployee emp) {
		this.setEmployee(emp);
	}
	
		
	/**
	 * Instantiates a new library exception.
	 *
	 * @param message the message
	 */
	public LibraryException(final String message) {
		super(message);
	}

	/**
	 * Gets the employee.
	 *
	 * @return the employee
	 */
	public final CommissionedEmployee getEmployee() {
		return employee;
	}

	/**
	 * Sets the employee.
	 *
	 * @param employee the employee to set
	 */
	public final void setEmployee(final CommissionedEmployee employee) {
		this.employee = employee;
	}

}
