package edu.washington.ext;

public class LibraryAssociate extends LibraryEmployee {
	
	private double commisionRate;

	public LibraryAssociate(String name) {
		super(name);
	}

	
	/**
	 * @param commisionRate the commisionRate to set
	 */
	public void setCommisionRate(double commisionRate) {
		this.commisionRate = commisionRate;
	}
	
	@Override
	public double calculatePay() {
		return super.calculatePay() + commisionRate * getCurrentSales();
	}
	

}
