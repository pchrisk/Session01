package edu.washington.ext;

import edu.washington.ext.common.AbstractEmployee;
import edu.washington.ext.common.CommissionedEmployee;


public class LibraryAssociate extends AbstractEmployee implements CommissionedEmployee {
	
	private double commissionRate;

	protected LibraryAssociate(String name) {
		super(name);
	}

	
	/**
	 * @param commissionRate the commisionRate to set
	 */
	protected void setCommissionRate(double commissionRate) {
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
