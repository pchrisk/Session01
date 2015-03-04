package edu.washington.ext;

// TODO: Auto-generated Javadoc
/**
 * The Class Librarian.
 */
public class Librarian implements Employee {
	
	/** The bonus rate. */
	private static double bonusRate = 0;
	
	/** The name. */
	private String name = null;
	
	/** The base pay. */
	private double basePay = 0;
	
	/** The current library totals. */
	private double currentLibraryTotals = 0;
	
	/** The current librarian totals. */
	private double currentLibrarianTotals = 0;
	
	
	/**
	 * Instantiates a new librarian.
	 *
	 * @param name the name
	 */
	public Librarian(final String name) {
		if (name != "") {
			this.name = name;
		} else {
			System.exit(1);
		}
	}

	/**
	 * Gets the base pay.
	 *
	 * @return the base pay
	 */
	public final double getBasePay() {
		return basePay;
	}

	/**
	 * Sets the base pay.
	 *
	 * @param basePay the new base pay
	 */
	public final void setBasePay(double basePay) {
		if (basePay > 0) {
			this.basePay = basePay;
		}		
	}

	/**
	 * Gets the bonus rate.
	 *
	 * @return the bonus rate
	 */
	public static double getBonusRate() {
		return bonusRate;
	}

	/**
	 * Sets the bonus rate.
	 *
	 * @param bonusRate the new bonus rate
	 */
	public static void setBonusRate(final double bonusRate) {
		if (bonusRate > 0) {
			Librarian.bonusRate = bonusRate;
		}		
	}

	/**
	 * Gets the current library totals.
	 *
	 * @return the current library totals
	 */
	public final double getCurrentLibraryTotals() {
		return currentLibraryTotals;
	}

	/**
	 * Sets the current library totals.
	 *
	 * @param currentLibraryTotals the new current library totals
	 */
	public final void setCurrentLibraryTotals(double currentLibraryTotals) {
		if (currentLibraryTotals >= 0) {
			this.currentLibraryTotals = currentLibraryTotals;
		}
	}

	/**
	 * Gets the current librarian totals.
	 *
	 * @return the current librarian totals
	 */
	public final double getCurrentLibrarianTotals() {
		return currentLibrarianTotals;
	}

	/**
	 * Sets the current librarian totals.
	 *
	 * @param currentLibrarianTotals the new current librarian totals
	 */
	public final void setCurrentLibrarianTotals(double currentLibrarianTotals) {
		if (currentLibraryTotals >= 0) {
			this.currentLibrarianTotals = currentLibrarianTotals;
		}		
	}

	/* (non-Javadoc)
	 * @see edu.washington.ext.Employee#getName()
	 */
	@Override
	public final String getName() {
		return this.name;
	}

	/* (non-Javadoc)
	 * @see edu.washington.ext.Employee#calculatePay()
	 */
	@Override
	public final double calculatePay() {
		return basePay + getBonusRate() * getCurrentLibraryTotals();
	}

}
