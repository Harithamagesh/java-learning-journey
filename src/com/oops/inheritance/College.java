package com.oops.inheritance;

import java.util.Scanner;

public class College {
	
	String collegeName;
	String city;
	Scanner sc = new Scanner(System.in);
	public void details() {
		
		System.out.println("Enter the collegeName:");
		collegeName=sc.next();
		System.out.println("Enter the city:");
		city=sc.next();
		
	}
	public void display() {
		System.out.println("college name:" + collegeName);
		System.out.println("city:" + city);
	}

}
