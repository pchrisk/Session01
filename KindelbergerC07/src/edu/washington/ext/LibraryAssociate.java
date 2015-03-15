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
		this.commissionRate = commissionRate;
	}
	
	/* (non-Javadoc)
	 * @see edu.washington.ext.common.AbstractEmployee#calculatePay()
	 */
	@Override
	public final double calculatePay() {
		return super.calculatePay() + calculateCommission();
	}


	/* (non-Javadoc)
	 * @see edu.washington.ext.common.CommissionedEmployee#calculateCommission()
	 */
	@Override
	public final double calculateCommission() {
		return commissionRate * getCurrentSales();
	}
	

}
