package com.interface1;

public class Cancellation implements Delivery.Cancellation{

	@Override
	public void refund() {
		System.out.println("Amount Refunded");
		
	}
	
	public static void main(String[] args) {
		
		Cancellation cancellation = new Cancellation();
		cancellation.refund();
		
	}

}
