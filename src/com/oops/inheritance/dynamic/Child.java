package com.oops.inheritance.dynamic;

public class Child extends Parent{
	
	public void relation() {
		
		System.out.println("Daughter");

	}
	
	public static void main(String[] args) {
		Parent parent = new Child();
		parent.relation();
		
	}

}
