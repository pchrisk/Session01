package edu.washington.ext.common;

public abstract class AbstractEmployee implements Employee{

	protected String name;
	protected double currentHours;
	protected double hourlyRate;
	protected double currentSales;
	
	protected AbstractEmployee(String name) {
		this.name = name;
	}
	
	protected void setCurrentSales(double currentSales) {
		this.currentSales = currentSales;
	}
	
	public double getCurrentSales() {
		return currentSales;
	}	
	
	public void setCurrentHours(double currentHours) {
		this.currentHours = currentHours;
	}
	
	public final double getCurrentHours() {
		return currentHours;
	}
	
	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}
	
	public final double getHourlyRate() {
		return hourlyRate;
	}
	
	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public double calculatePay() {
		return hourlyRate * currentHours;
	}

	

}
