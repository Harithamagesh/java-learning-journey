package com.oops.inheritance;

import java.util.Scanner;

public class Student extends Course{
	
	String stdName;
	int mark;
	
	Scanner sc = new Scanner(System.in);
	
	public void detail3() {
		super.detail2();
		System.out.println("Enter the stdName:");
		stdName=sc.next();
		System.out.println("Enter the mark:");
		mark=sc.nextInt();
	}
	public void display3() {
		System.out.println("Display All Details:");
		super.display2();
		System.out.println("college name:" + collegeName);
		System.out.println("city:" + city);
		System.out.println("course id:" + courseId);
		System.out.println("course name:" + courseName);
		System.out.println("staff name:" + staffName);
		System.out.println("student name:" + stdName);
		System.out.println("mark:" + mark);
		
		 

		
		
	}
	

}
