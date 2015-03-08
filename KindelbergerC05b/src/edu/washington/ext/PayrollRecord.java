package edu.washington.ext;

public class PayrollRecord {
	
	private String employeeName;
	private double currentPay;
	
	public PayrollRecord(String name, double currentPay) {
		this.employeeName = name;
		this.currentPay = currentPay;
		
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public double getCurrentPay() {
		return currentPay;
	}
	
	

}
