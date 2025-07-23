package com.interface1;

public class Order implements Delivery{

	@Override
	public void transaction() {
		System.out.println("Order delivery");
		
	}
	
	public static void main(String[] args) {
		
		Order order = new Order();
		order.transaction();
	
		
	}

}


