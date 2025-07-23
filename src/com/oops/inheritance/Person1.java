package com.oops.inheritance;

import java.util.Scanner;

public class Person1 extends CSK{

	public Person1() {
		
		super();

	}
	
	String name;
	int age;
	
	public void team() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the name:");
		name = scanner.next();
		System.out.println("Enter the age:");
		age = scanner.nextInt();
		
	}
	
	public void P1Details() {
		System.out.println("name:" + name);
		System.out.println("age:" + age);
	}

}
