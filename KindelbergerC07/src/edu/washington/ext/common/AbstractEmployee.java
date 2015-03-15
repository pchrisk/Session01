package edu.washington.ext.common;

import org.hamcrest.core.IsNull;

/**
 * The Class AbstractEmployee.
 */
public abstract class AbstractEmployee implements Employee {

	/** The name. */
	private String name;
	
	/** The current hours. */
	private double currentHours;
	
	/** The hourly rate. */
	private double hourlyRate;
	
	/** The current sales. */
	private double currentSales;
	
	/**
	 * Instantiates a new abstract employee.
	 *
	 * @param name the name
	 */
	protected AbstractEmployee(final String name) {
		if ((name != "") || (name != null)) {
			this.name = name;
		} else {
			throw new IllegalArgumentException("Please pass a name!");
		}
		
	}
	
	/**
	 * Sets the current sales.
	 *
	 * @param currentSales the new current sales
	 */
	public final void setCurrentSales(final double currentSales) {
		if (currentSales > 0) {
			this.currentSales = currentSales;
		} else {
			throw new IllegalArgumentException("Current Sales must be more than 0.");
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
	 * Sets the current hours.
	 *
	 * @param currentHours the new current hours
	 */
	public final void setCurrentHours(final double currentHours) {
		if (currentHours > 0) {
			this.currentHours = currentHours;
		} else {
			throw new IllegalArgumentException("Current hours must be greater than 0.");
		}
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
	 * Sets the hourly rate.
	 *
	 * @param hourlyRate the new hourly rate
	 */
	public final void setHourlyRate(final double hourlyRate) {
		if (hourlyRate > 0) {
			this.hourlyRate = hourlyRate;
		} else {
			throw new IllegalArgumentException("Hourly rate must be greater than 0.");
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
	
	/* (non-Javadoc)
	 * @see edu.washington.ext.common.Employee#getName()
	 */
	@Override
	public final String getName() {
		return this.name;
	}

	/* (non-Javadoc)
	 * @see edu.washington.ext.common.Employee#calculatePay()
	 */
	@Override
	public double calculatePay() {
		return hourlyRate * currentHours;
	}

	

}
