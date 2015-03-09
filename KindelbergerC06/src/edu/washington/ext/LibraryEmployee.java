package edu.washington.ext;

import edu.washington.ext.common.Employee;

public class LibraryEmployee implements Employee {
	
	private double currentHours;
	private double hourlyRate;
	private String name;
	private double currentSales;
	
	public LibraryEmployee(String name) {
		this.name = name;
	}
	
	public void setCurrentSales(double currentSales) {
		this.currentSales = currentSales;
	}
	
	public double getCurrentSales() {
		return currentSales;
	}
	
	

	public void setCurrentHours(double currentHours) {
		this.currentHours = currentHours;
	}

	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
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
