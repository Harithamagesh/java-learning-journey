package com.oops.inheritance;

import java.util.Scanner;

public class Person2 extends RCB{

	public Person2(){
		
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
	
	public void P2Details() {
		System.out.println("name:" + name);
		System.out.println("age:" + age);
	}

}
