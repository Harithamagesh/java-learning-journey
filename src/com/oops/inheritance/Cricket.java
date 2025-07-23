package com.oops.inheritance;

import java.util.Scanner;

public class Cricket {
	
	String MatchName;
	int members = 11;
	
	public void CricketInfo() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Match name:");
		MatchName = scanner.next();
		
	}
	
	public void CricketDetails() {
		System.out.println("Match name:" + MatchName);
		System.out.println("members:" + members);
	}

}
