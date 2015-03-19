package edu.washington.ext;

import edu.washington.ext.common.AbstractEmployee;
import edu.washington.ext.common.CommissionedEmployee;


/**
 * The Class LibraryAssociate.
 */
public class LibraryAssociate extends AbstractEmployee implements CommissionedEmployee {
	
	/** The commission rate. */
	private double commissionRate;

	/**
	 * Instantiates a new library associate.
	 *
	 * @param name the name
	 */
	protected LibraryAssociate(final String name) {
		super(name);
	}

	
	/**
	 * Sets the commission rate.
	 *
	 * @param commissionRate the commisionRate to set
	 */
	protected final void setCommissionRate(final double commissionRate) {
		if (commissionRate > 0) {
			this.commissionRate = commissionRate;
		} else {
			throw new IllegalArgumentException("Commission rate must be greater than 0.");
		}
		
	}
	
	/**
	 *  
	 * Calculate Pay of based off of hourly pay and commission rate.
	 *
	 * @return the double
	 */
	@Override
	public final double calculatePay() {
		return super.calculatePay() + calculateCommission();
	}


	/**
	 * Calculates Commission.
	 *
	 * @return the double
	 */
	@Override
	public final double calculateCommission() {
		return commissionRate * getCurrentSales();
	}


	/**
	 * Gets the Commission Rate.
	 * 
	 * @return the double
	 */
	@Override
	public final double getCommissionRate() {
		return this.commissionRate;
	}
	

}
