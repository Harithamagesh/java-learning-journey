package com.oops.inheritance;

import java.util.Scanner;

public class Course extends College{
	
	int courseId;
	String courseName;
	String staffName;
	
	
	Scanner sc = new Scanner(System.in);
	
	public void detail2() {
		super.details();
		System.out.println("Enter the courseId:");
		courseId=sc.nextInt();
		System.out.println("Enter the courseName:");
		courseName=sc.next();
		System.out.println("Enter the staffName:");
		staffName=sc.next();
		
	}
	public void display2() {
		System.out.println("course id:" + courseId);
		System.out.println("course name:" + courseName);
		System.out.println("staff name:" + staffName);
	}

}
