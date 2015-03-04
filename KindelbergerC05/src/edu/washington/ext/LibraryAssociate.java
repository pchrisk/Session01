package edu.washington.ext;

public class LibraryAssociate extends LibraryEmployee {
	
	private double commisionRate = 0;
	

	public LibraryAssociate(String name) {		
		super(name);		
	}
	
	public double getCommisionRate() {
		return commisionRate;
	}

	public void setCommisionRate(double commisionRate) {
		if (commisionRate > 0) {
			this.commisionRate = commisionRate;
		}
	}

	public double calculatePay() {
		return super.calculatePay() + commisionRate * super.getCurrentSales();
	}

}
