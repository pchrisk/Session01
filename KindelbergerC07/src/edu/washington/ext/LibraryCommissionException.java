package edu.washington.ext;

/**
 * The Class LibraryCommissionException.
 */
public class LibraryCommissionException extends Exception {
	
	/**
	 * Default serial version ID.
	 */
	private static final long serialVersionUID = 1L;
	
	
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
	public LibraryCommissionException(final double commissionTotals) {
		this.setCommissionTotals(commissionTotals);
	}

	/**
	 * Instantiates a new library commission exception.
	 *
	 * @param message the message
	 */
	public LibraryCommissionException(final String message) {
		super(message);
	}

	/**
	 * Instantiates a new library commission exception.
	 *
	 * @param cause the cause
	 */
	public LibraryCommissionException(final Throwable cause) {
		super(cause);
	}

	/**
	 * Instantiates a new library commission exception.
	 *
	 * @param message the message
	 * @param cause the cause
	 */
	public LibraryCommissionException(final String message, final Throwable cause) {
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
	public LibraryCommissionException(final String message, final Throwable cause,
			final boolean enableSuppression, final boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		
	}

	/**
	 * Gets the commission totals.
	 *
	 * @return the commissionTotals
	 */
	public final double getCommissionTotals() {
		return commissionTotals;
	}

	/**
	 * Sets the commission totals.
	 *
	 * @param commissionTotals the commissionTotals to set
	 */
	public final void setCommissionTotals(final double commissionTotals) {
		this.commissionTotals = commissionTotals;
	}

}
