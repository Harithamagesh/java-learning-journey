package com.oops.polymorphism;

public class Child {
	
	public void run() {
		System.out.println("Child");
	}
	
	
	public static void main(String[] args) {
		Child c = new Child();
		c.run();
		
		Parent p = new Parent();
		p.run();
	}

}
