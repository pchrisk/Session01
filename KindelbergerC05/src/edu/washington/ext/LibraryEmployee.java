package edu.washington.ext;

public class LibraryEmployee implements Employee {
	
	private double currentHours = 0;
	private double hourlyRate = 0;
	private String name = null;
	private double currentSales = 0;
	
	public LibraryEmployee(String name){
		this.name = name;
		
		
	}
	
	

	@Override
	public String getName() {
		return name;
	}

	public double getCurrentHours() {
		return currentHours;
	}

	public void setCurrentHours(double currentHours) {
		this.currentHours = currentHours;
	}

	public double getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	public double getCurrentSales() {
		return currentSales;
	}

	public void setCurrentSales(double currentSales) {
		this.currentSales = currentSales;
	}

	@Override
	public double calculatePay() {
		
		return hourlyRate * currentHours;
	}

}
