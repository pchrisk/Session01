package edu.washington.ext;

public class LibraryEmployee implements Employee {
	
	private double currentHours = 0;
	private double hourlyRate = 0;
	private String name = null;
	private double currentSales = 0;
	
	public LibraryEmployee(String name){
		if (name != "") {
			this.name = name;
		} else {
			System.exit(1);
		}
		
	}
	
	

	@Override
	public String getName() {
		return name;
	}

	public double getCurrentHours() {
		return currentHours;
	}

	public void setCurrentHours(double currentHours) {
		if (currentHours >= 0) {
			this.currentHours = currentHours;
		}
	}

	public double getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(double hourlyRate) {
		if (hourlyRate > 0) {
			this.hourlyRate = hourlyRate;
		}
		
	}

	public double getCurrentSales() {
		return currentSales;
	}

	public void setCurrentSales(double currentSales) {
		if (currentSales >= 0) {
			this.currentSales = currentSales;
		}
	}

	@Override
	public double calculatePay() {
		
		return hourlyRate * currentHours;
	}

}
