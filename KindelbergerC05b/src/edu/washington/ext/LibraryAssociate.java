package edu.washington.ext;

public class LibraryAssociate extends LibraryEmployee {
	
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
		return super.calculatePay() + commissionRate * getCurrentSales();
	}
	

}
