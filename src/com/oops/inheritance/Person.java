package com.oops.inheritance;

import java.util.*;

public class Person {
	
	String name;
	String phoneNo;
	int age;

	
	public void personInformation() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name:");
		name = sc.next();
		System.out.println("Enter the phoneNo:");
		phoneNo = sc.next();
		System.out.println("Enter the age:");
		age = sc.nextInt();
}
	
	public void personDetail() {
		System.out.println("name:" + name);
		System.out.println("phoneNo:" + phoneNo);
		System.out.println("age:" + age);
	}

}
