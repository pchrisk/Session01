package edu.washington.ext;

import edu.washington.ext.common.*;

public class LibraryAssociate extends AbstractEmployee implements CommissionedEmployee {
	
	private double commissionRate;

	public LibraryAssociate(String name) {
		super(name);
	}

	
	/**
	 * @param commissionRate the commisionRate to set
	 */
	public void setCommissionRate(double commissionRate) {
		this.commissionRate = commissionRate;
	}
	
	@Override
	public double calculatePay() {
		return super.calculatePay() + calculateCommission();
	}


	@Override
	public double calculateCommission() {
		return commissionRate * getCurrentSales();
	}
	

}
