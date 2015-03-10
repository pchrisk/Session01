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
	public PayrollRecord(String name, double currentPay) {
		this.employeeName = name;
		this.currentPay = currentPay;
		
	}

	/**
	 * Gets the employee name.
	 *
	 * @return the employee name
	 */
	public String getEmployeeName() {
		return employeeName;
	}

	/**
	 * Gets the current pay.
	 *
	 * @return the current pay
	 */
	public double getCurrentPay() {
		return currentPay;
	}
	
	

}
