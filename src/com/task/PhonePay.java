package com.task;

public class PhonePay implements Transaction{

	@Override
	public void type() {
		System.out.println("PhonePay amount transaction successful from " + name);
		
	}

}
