package edu.washington.ext;

import edu.washington.ext.common.AbstractEmployee;
import edu.washington.ext.common.CommissionedEmployee;


// TODO: Auto-generated Javadoc
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
	protected LibraryAssociate(String name) {
		super(name);
	}

	
	/**
	 * Sets the commission rate.
	 *
	 * @param commissionRate the commisionRate to set
	 */
	protected void setCommissionRate(double commissionRate) {
		this.commissionRate = commissionRate;
	}
	
	/* (non-Javadoc)
	 * @see edu.washington.ext.common.AbstractEmployee#calculatePay()
	 */
	@Override
	public double calculatePay() {
		return super.calculatePay() + calculateCommission();
	}


	/* (non-Javadoc)
	 * @see edu.washington.ext.common.CommissionedEmployee#calculateCommission()
	 */
	@Override
	public double calculateCommission() {
		return commissionRate * getCurrentSales();
	}
	

}
