package com.oops.abstraction;

public class Gpay implements Bank{

	@Override
	public void showTransaction() {
		System.out.println(AccountHolder + " gpay transaction successful");
		
	}
	
	

}
