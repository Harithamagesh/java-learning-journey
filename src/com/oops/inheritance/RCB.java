package com.oops.inheritance;

import java.util.Scanner;

public class RCB extends IPL{

	public RCB() {
		super();
		
	}
	
	String captain;
	String choice;
	
	public void red() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the captain name:");
		captain = sc.next();
		System.out.println("Enter the choice:");
		choice = sc.next();
	}
	
	public void RCBDetails() {
		System.out.println("captain:" + captain);
		System.out.println("choice:" + choice);
	}
	

}
