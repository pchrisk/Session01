package edu.washington.ext.common;

// TODO: Auto-generated Javadoc
/**
 * The Class AbstractEmployee.
 */
public abstract class AbstractEmployee implements Employee{

	/** The name. */
	protected String name;
	
	/** The current hours. */
	protected double currentHours;
	
	/** The hourly rate. */
	protected double hourlyRate;
	
	/** The current sales. */
	protected double currentSales;
	
	/**
	 * Instantiates a new abstract employee.
	 *
	 * @param name the name
	 */
	protected AbstractEmployee(String name) {
		this.name = name;
	}
	
	/**
	 * Sets the current sales.
	 *
	 * @param currentSales the new current sales
	 */
	public void setCurrentSales(double currentSales) {
		this.currentSales = currentSales;
	}
	
	/**
	 * Gets the current sales.
	 *
	 * @return the current sales
	 */
	public double getCurrentSales() {
		return currentSales;
	}	
	
	/**
	 * Sets the current hours.
	 *
	 * @param currentHours the new current hours
	 */
	public void setCurrentHours(double currentHours) {
		this.currentHours = currentHours;
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
	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
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
	public String getName() {
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
