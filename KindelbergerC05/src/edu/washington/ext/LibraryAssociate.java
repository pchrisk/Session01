package edu.washington.ext;

/**
 * The Class LibraryAssociate.
 */
public class LibraryAssociate extends LibraryEmployee {
	
	/** The commission rate. */
	private double commissionRate = 0;
	

	/**
	 * Instantiates a new library associate.
	 *
	 * @param name the name
	 */
	public LibraryAssociate(final String name) {		
		super(name);		
	}
	
	/**
	 * Gets the commission rate.
	 *
	 * @return the commission rate
	 */
	public final double getCommissionRate() {
		return commissionRate;
	}

	/**
	 * Sets the commission rate.
	 *
	 * @param commissionRate the new commission rate
	 */
	public final void setCommissionRate(double commissionRate) {
		if (commissionRate > 0) {
			this.commissionRate = commissionRate;
		}
	}

	
	/** (non-Javadoc)
	 * @see edu.washington.ext.LibraryEmployee#calculatePay()
	 * 
	 * @return the double
	 */
	public double calculatePay() {
		return super.calculatePay() + this.getCommissionRate() * super.getCurrentSales();
	}

}
