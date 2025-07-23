package com.task;

public class TwoNumSwap {
	
	public static void main(String[] args) {
		int a=10;
		int b=20;
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swap: a=" +a+ ",b=" +b);
	}

}
//classcastException
