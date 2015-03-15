package edu.washington.ext;

import edu.washington.ext.common.AbstractEmployee;
import edu.washington.ext.common.CommissionedEmployee;

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
	protected Librarian(final String name) {
		super(name);
	}		

	/**
	 * Sets the commission rate.
	 *
	 * @param commissionRate the new commission rate
	 */
	protected static void setcommissionRate(final double commissionRate) {
		if (commissionRate > 0) {
			Librarian.commissionRate = commissionRate;
		} else {
			throw new IllegalArgumentException("Commission rate must be greater than 0.");
		}
	}

	/**
	 * Sets the base pay.
	 *
	 * @param basePay the new base pay
	 */
	protected final void setBasePay(final double basePay) {
		if (basePay > 0) {
			this.basePay = basePay;
		} else {
			throw new IllegalArgumentException("Base pay must be greater than 0.");
		}
	}

	/**
	 * Sets the current library totals.
	 *
	 * @param currentLibraryTotals the new current library totals
	 */
	protected final void setCurrentLibraryTotals(final double currentLibraryTotals) {
		if (currentLibraryTotals > 0) {
			this.currentLibraryTotals = currentLibraryTotals;
		} else {
			throw new IllegalArgumentException("Library totals must be greater than 0.");
		}
		
	}

	/** 
	 * Calculate Pay of Librarian based off of base pay and commission rate
	 * 
	 * @return the double
	 */
	@Override
	public final double calculatePay() {
		return basePay + calculateCommission();
	}

	/**
	 * Calculates Commission
	 * 
	 * @return the double
	 */
	@Override
	public final double calculateCommission() {
		return currentLibraryTotals * Librarian.commissionRate;
	}

	@Override
	public double getCommissionRate() {
		return Librarian.commissionRate;
	}

}
