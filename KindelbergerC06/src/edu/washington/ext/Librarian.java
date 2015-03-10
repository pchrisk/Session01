package edu.washington.ext;

import edu.washington.ext.common.AbstractEmployee;
import edu.washington.ext.common.CommissionedEmployee;

public class Librarian extends AbstractEmployee implements CommissionedEmployee {
	
	

	private static double commissionRate;
	private double basePay;
	private double currentLibraryTotals;
//	private double currentLibrarianTotals;
	
	public Librarian(String name) {
		super(name);
	}		

//	public double getCurrentLibrarianTotals() {
//		return currentLibrarianTotals;
//	}
//
//
//	public void setCurrentLibrarianTotals(double currentLibrarianTotals) {
//		this.currentLibrarianTotals = currentLibrarianTotals;
//	}


	public static void setBonusRate(double commissionRate) {
		Librarian.commissionRate = commissionRate;
	}


	public void setBasePay(double basePay) {
		this.basePay = basePay;
	}


	public void setCurrentLibraryTotals(double currentLibraryTotals) {
		this.currentLibraryTotals = currentLibraryTotals;
	}


//	@Override
//	public String getName() {
//		return this.name;
//	}

	@Override
	public double calculatePay() {
		return basePay + calculateCommission();
	}

	@Override
	public double calculateCommission() {
		return currentLibraryTotals * commissionRate;
	}

}
