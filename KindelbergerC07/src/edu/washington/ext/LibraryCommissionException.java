package edu.washington.ext;

/**
 * The Class LibraryCommissionException.
 */
public class LibraryCommissionException extends Exception {
	
	/** The commission totals. */
	private double commissionTotals;

	/**
	 * Instantiates a new library commission exception.
	 */
	public LibraryCommissionException() {
	}
	
	/**
	 * Instantiates a new library commission exception.
	 *
	 * @param commissionTotals the commission totals
	 */
	public LibraryCommissionException(double commissionTotals) {
		this.setCommissionTotals(commissionTotals);
	}

	/**
	 * Instantiates a new library commission exception.
	 *
	 * @param message the message
	 */
	public LibraryCommissionException(String message) {
		super(message);
	}

	/**
	 * Instantiates a new library commission exception.
	 *
	 * @param cause the cause
	 */
	public LibraryCommissionException(Throwable cause) {
		super(cause);
	}

	/**
	 * Instantiates a new library commission exception.
	 *
	 * @param message the message
	 * @param cause the cause
	 */
	public LibraryCommissionException(String message, Throwable cause) {
		super(message, cause);
		
	}

	/**
	 * Instantiates a new library commission exception.
	 *
	 * @param message the message
	 * @param cause the cause
	 * @param enableSuppression the enable suppression
	 * @param writableStackTrace the writable stack trace
	 */
	public LibraryCommissionException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		
	}

	/**
	 * Gets the commission totals.
	 *
	 * @return the commissionTotals
	 */
	public double getCommissionTotals() {
		return commissionTotals;
	}

	/**
	 * Sets the commission totals.
	 *
	 * @param commissionTotals the commissionTotals to set
	 */
	public void setCommissionTotals(double commissionTotals) {
		this.commissionTotals = commissionTotals;
	}

}
