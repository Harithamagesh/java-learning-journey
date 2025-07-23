package com.task;

public class NetBanking implements Transaction{

	@Override
	public void type() {
		System.out.println("NetBanking amount transaction successful from " + name);
		
	}

}
