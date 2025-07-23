package com.oops.abstraction;

public class NetBanking implements Bank{

	@Override
	public void showTransaction() {
		System.out.println(AccountHolder + " Net banking transaction successful");
		
	}

}
