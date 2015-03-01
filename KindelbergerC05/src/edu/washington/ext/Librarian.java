package edu.washington.ext;

public class Librarian implements Employee {
	
	private static double bonusRate = 0;
	private String name = null;
	private double basePay = 0;
	private double currentLibraryTotals = 0;
	private double currentLibrarianTotals = 0;
	
	
	public Librarian(String name) {
		
	}

	public static double getBonusRate() {
		return bonusRate;
	}

	public static void setBonusRate(double bonusRate) {
		Librarian.bonusRate = bonusRate;
	}

	public double getCurrentLibraryTotals() {
		return currentLibraryTotals;
	}

	public void setCurrentLibraryTotals(double currentLibraryTotals) {
		this.currentLibraryTotals = currentLibraryTotals;
	}

	public double getCurrentLibrarianTotals() {
		return currentLibrarianTotals;
	}

	public void setCurrentLibrarianTotals(double currentLibrarianTotals) {
		this.currentLibrarianTotals = currentLibrarianTotals;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double calculatePay() {
		// TODO Auto-generated method stub
		return 0;
	}

}
