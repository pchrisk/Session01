package edu.washington.ext;

import edu.washington.ext.common.AbstractEmployee;
import edu.washington.ext.common.CommissionedEmployee;

public class Librarian extends AbstractEmployee implements CommissionedEmployee {
	
	

	private static double commissionRate;
	private double basePay;
	private double currentLibraryTotals;
	
	protected Librarian(String name) {
		super(name);
	}		

	protected static void setcommissionRate(double commissionRate) {
		Librarian.commissionRate = commissionRate;
	}

	protected void setBasePay(double basePay) {
		this.basePay = basePay;
	}

	protected void setCurrentLibraryTotals(double currentLibraryTotals) {
		this.currentLibraryTotals = currentLibraryTotals;
	}

	@Override
	public double calculatePay() {
		return basePay + calculateCommission();
	}

	@Override
	public double calculateCommission() {
		return currentLibraryTotals * Librarian.commissionRate;
	}

}
