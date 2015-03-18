package edu.washington.ext;

// TODO: Auto-generated Javadoc
/**
 * The Class PayrollRecord.
 */
public class PayrollRecord {
	
	/** The employee name. */
	private String employeeName;
	
	/** The current pay. */
	private double currentPay;
	
	/**
	 * Instantiates a new payroll record.
	 *
	 * @param name the name
	 * @param currentPay the current pay
	 */
	public PayrollRecord(final String name, final double currentPay) {
		this.employeeName = name;
		this.currentPay = currentPay;
		
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
	 * Gets the current pay.
	 *
	 * @return the current pay
	 */
	public final double getCurrentPay() {
		return currentPay;
	}
	
	

}
