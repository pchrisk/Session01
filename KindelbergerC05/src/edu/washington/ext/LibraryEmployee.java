package edu.washington.ext;

// TODO: Auto-generated Javadoc
/**
 * The Class LibraryEmployee.
 */
public class LibraryEmployee implements Employee {
	
	/** The current hours. */
	private double currentHours = 0;
	
	/** The hourly rate. */
	private double hourlyRate = 0;
	
	/** The name. */
	private String name = null;
	
	/** The current sales. */
	private double currentSales = 0;
	
	/**
	 * Instantiates a new library employee.
	 *
	 * @param name the name
	 */
	public LibraryEmployee(String name){
		if (name != "") {
			this.name = name;
		} else {
			System.exit(1);
		}
		
	}
	
	

	/* (non-Javadoc)
	 * @see edu.washington.ext.Employee#getName()
	 */
	@Override
	public final String getName() {
		return name;
	}

	/**
	 * Gets the current hours.
	 *
	 * @return the current hours
	 */
	public final double getCurrentHours() {
		return currentHours;
	}

	/**
	 * Sets the current hours.
	 *
	 * @param currentHours the new current hours
	 */
	public final void setCurrentHours(double currentHours) {
		if (currentHours >= 0) {
			this.currentHours = currentHours;
		}
	}

	/**
	 * Gets the hourly rate.
	 *
	 * @return the hourly rate
	 */
	public final double getHourlyRate() {
		return hourlyRate;
	}

	/**
	 * Sets the hourly rate.
	 *
	 * @param hourlyRate the new hourly rate
	 */
	public final void setHourlyRate(double hourlyRate) {
		if (hourlyRate > 0) {
			this.hourlyRate = hourlyRate;
		}
		
	}

	/**
	 * Gets the current sales.
	 *
	 * @return the current sales
	 */
	public final double getCurrentSales() {
		return currentSales;
	}

	/**
	 * Sets the current sales.
	 *
	 * @param currentSales the new current sales
	 */
	public final void setCurrentSales(double currentSales) {
		if (currentSales >= 0) {
			this.currentSales = currentSales;
		}
	}

	/** (non-Javadoc)
	 * @see edu.washington.ext.Employee#calculatePay()
	 *  
	 * @return the double
	 */
	@Override
	public double calculatePay() {
		
		return hourlyRate * currentHours;
	}

}
