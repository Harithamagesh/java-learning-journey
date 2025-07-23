package com.oops.abstraction;

public class PhonePay implements Bank{

	@Override
	public void showTransaction() {
		System.out.println(AccountHolder + " phone pay transaction successful");
		
	}

}
