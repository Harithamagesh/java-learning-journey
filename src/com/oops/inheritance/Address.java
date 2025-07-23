package com.oops.inheritance;

import java.util.Scanner;

public class Address extends Person{
	
	int doorNo;
	String street;
	String city;
	int pincode;
	
	Scanner sc =new Scanner(System.in);
	
	public void addressForm() {
		super.personInformation();
		
		System.out.println("Enter the doorno:");
		doorNo = sc.nextInt();
		System.out.println("Enter the street:");
		street = sc.next();
		System.out.println("Enter the city:");
		city = sc.next();
		System.out.println("Enter the pincode:");
		pincode = sc.nextInt();
		
	}
	public void displayAddress() {
		System.out.println("display person detail");
		super.personDetail();
		
		System.out.println("doorno:" + doorNo);
		System.out.println("street:" + street);
		System.out.println("city:" + city);
		System.out.println("pincode:" + pincode);
	}
	

}
