package com.oops.inheritance;

import java.util.Scanner;

public class IPL extends Cricket{
	
	String TeamName;
	String location;

	
	public IPL() {
		
	}

	public void IPLInfo() {
		Scanner sc = new Scanner(System.in);
		super.CricketInfo();
		System.out.println("Enter the team name:");
		TeamName = sc.next();
		System.out.println("Enter the location:");
		location = sc.next();
	}
	
	public void IPLDetails() {
		super.CricketDetails();
		System.out.println("team name:" + TeamName);
		System.out.println("location:" + location);
		
	}
	

}
