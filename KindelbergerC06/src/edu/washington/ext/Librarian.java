package edu.washington.ext;

import edu.washington.ext.common.AbstractEmployee;
import edu.washington.ext.common.CommissionedEmployee;

// TODO: Auto-generated Javadoc
/**
 * The Class Librarian.
 */
public class Librarian extends AbstractEmployee implements CommissionedEmployee {
	
	

	/** The commission rate. */
	private static double commissionRate;
	
	/** The base pay. */
	private double basePay;
	
	/** The current library totals. */
	private double currentLibraryTotals;
	
	/**
	 * Instantiates a new librarian.
	 *
	 * @param name the name
	 */
	protected Librarian(String name) {
		super(name);
	}		

	/**
	 * Sets the commission rate.
	 *
	 * @param commissionRate the new commission rate
	 */
	protected static void setcommissionRate(double commissionRate) {
		Librarian.commissionRate = commissionRate;
	}

	/**
	 * Sets the base pay.
	 *
	 * @param basePay the new base pay
	 */
	protected void setBasePay(double basePay) {
		this.basePay = basePay;
	}

	/**
	 * Sets the current library totals.
	 *
	 * @param currentLibraryTotals the new current library totals
	 */
	protected void setCurrentLibraryTotals(double currentLibraryTotals) {
		this.currentLibraryTotals = currentLibraryTotals;
	}

	/* (non-Javadoc)
	 * @see edu.washington.ext.common.AbstractEmployee#calculatePay()
	 */
	@Override
	public double calculatePay() {
		return basePay + calculateCommission();
	}

	/* (non-Javadoc)
	 * @see edu.washington.ext.common.CommissionedEmployee#calculateCommission()
	 */
	@Override
	public double calculateCommission() {
		return currentLibraryTotals * Librarian.commissionRate;
	}

}
