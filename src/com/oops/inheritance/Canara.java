package com.oops.inheritance;

public class Canara extends Bank{

	public Canara(String name, String branchLocation, String customerName) {
		super(name, branchLocation, customerName);
		
	}
	public void acc() {
		System.out.println("Details");
		super.bankName();
		super.customerName();
		
	}

}
