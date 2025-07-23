package com.oops.inheritance;

public class Hdfc extends Bank{

	public Hdfc(String name, String branchLocation, String customerName) {
		super(name, branchLocation, customerName);
	}
	
	public void acc() {
		super.bankName();
		super.branchLocation();
		
	}
	
	

}
