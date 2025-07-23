package com.oops.inheritance;

public class Bank {
	String bankName;
	String branchLocation;
	String customerName;
	
	public Bank(String name,String branchLocation,String customerName) {
		this.bankName=name;
		this.branchLocation=branchLocation;
		this.customerName=customerName;
	}
	
	public void bankName() {
		System.out.println("BankName:" + bankName);
		
	}
	
	public void branchLocation() {
		System.out.println("BranchLocation:" + branchLocation);
	}
	
	public void customerName() {
		System.out.println("CustomerName:" + customerName);
	}
	

}
