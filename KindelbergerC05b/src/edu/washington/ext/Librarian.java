package edu.washington.ext;

public class Librarian implements Employee {
	
	

	private static double bonusRate;
	private String name;
	private double basePay;
	private double currentLibraryTotals;
	private double currentLibrarianTotals;
	
	public Librarian(String name) {
		super();
		this.name = name;
	}		

	public double getCurrentLibrarianTotals() {
		return currentLibrarianTotals;
	}


	public void setCurrentLibrarianTotals(double currentLibrarianTotals) {
		this.currentLibrarianTotals = currentLibrarianTotals;
	}


	public static void setBonusRate(double bonusRate) {
		Librarian.bonusRate = bonusRate;
	}


	public void setBasePay(double basePay) {
		this.basePay = basePay;
	}


	public void setCurrentLibraryTotals(double currentLibraryTotals) {
		this.currentLibraryTotals = currentLibraryTotals;
	}


	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public double calculatePay() {
		return basePay + currentLibraryTotals * bonusRate;
	}

}
