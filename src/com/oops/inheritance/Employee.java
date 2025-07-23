package com.oops.inheritance;


import java.util.Scanner;

public class Employee {
	
	
	int EmpId;
	String EmpName;
	double salary;
	String EmpDept;
	
	public Employee(int EmpId, String EmpName,double salary, String EmpDept) {
		this.EmpId = EmpId;
		this.EmpName = EmpName;
		this.salary = salary;
		this.EmpDept = EmpDept;
	}
	
	

	public void EmpInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employee id:");
		EmpId = sc.nextInt();
		System.out.println("Enter employee name:");
		EmpName = sc.next();
		System.out.println("Enter the salary:");
		salary = sc.nextDouble();
		System.out.println("Enter employee department:");
		EmpDept = sc.next();
		
	}
	
	

}
