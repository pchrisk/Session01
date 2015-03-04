package edu.washington.ext;

// TODO: Auto-generated Javadoc
/**
 * The Class PayrollRecord.
 */
public class PayrollRecord {
	
	/** The employee name. */
	private String employeeName = null;
	
	/** The current pay. */
	private double currentPay = 0;
	
	/**
	 * Instantiates a new payroll record.
	 *
	 * @param name the name
	 * @param pay the pay
	 */
	public PayrollRecord(final String name, double pay) {
		this.employeeName = name;
		this.currentPay = pay;
		
	}

	/**
	 * Gets the employee name.
	 *
	 * @return the employee name
	 */
	public final String getEmployeeName() {
		return employeeName;
	}

	/**
	 * Sets the employee name.
	 *
	 * @param employeeName the new employee name
	 */
	public final void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	/**
	 * Gets the current pay.
	 *
	 * @return the current pay
	 */
	public final double getCurrentPay() {
		return currentPay;
	}

	/**
	 * Sets the current pay.
	 *
	 * @param currentPay the new current pay
	 */
	public final void setCurrentPay(double currentPay) {
		this.currentPay = currentPay;
	}
	
	

}
