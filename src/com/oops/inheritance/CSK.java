package com.oops.inheritance;

import java.util.Scanner;

public class CSK extends IPL{

	public CSK() {
		super();
		
	}

	String captain;
	String choice;
	
	public void yellow() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the team captain:");
		captain = sc.next();
		System.out.println("Enter the choice:");
		choice = sc.next();
		
	}
	
	public void CSKDetail() {
		System.out.println("captain:" + captain);
		System.out.println("choice:" + choice);
	}

}
