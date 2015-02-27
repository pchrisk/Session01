package edu.washington.ext;

public class PayrollRecord {
	
	private String employeeName = null;
	private double currentPay = 0;
	
	public PayrollRecord(String name, double pay) {
		this.employeeName = name;
		this.currentPay = pay;
		
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getCurrentPay() {
		return currentPay;
	}

	public void setCurrentPay(double currentPay) {
		this.currentPay = currentPay;
	}
	
	

}
