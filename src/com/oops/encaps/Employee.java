package com.oops.encaps;

public class Employee {
	
	private int empId = 101;
	private String empName = "Haritha";
	private String empDept = "Data Analytics";
	private double salary = 50000;
	private int age = 17;
	
//	private void display1() {
//		System.out.println(empId);
//	}
	
	public int getId() {
		return empId;
	}
	
	public void setId(int empId) {
		this.empId = empId;
	}
	
//	private void display2() {
//		System.out.println(empName);
//	}
	
	public String getName() {
		return empName;
	}
	
	public void setName(String empName) {
		this.empName = empName;
	}
	
//	private void display3() {
//		System.out.println(empDept);
//	}
	
	public String getDept() {
		return empDept;
	}
	
	public void setDept(String empDept) {
		this.empDept = empDept;
		
	}
	
//	private void display4() {
//		System.out.println(salary);
//	}
	
	public double getsalary() {
		return salary;
		
	}
	
	public void setsalary(double salary) {
		this.salary = salary;
		
	}
	
//	private void display5() {
//		System.out.println( age);
//	}
	
	public int getage() {
		return age;
		
	}
	
	public void setage(int age) {
		this.age = age;
		
	}
	
	public static void main(String[] args) {
		Employee obj = new Employee();
//		obj.display1();
		System.out.println(obj.empId);
//		obj.display1();
		System.out.println(obj.empName);
//		obj.display2();
		System.out.println(obj.empDept);
//		obj.display3();
		System.out.println(obj.salary);
//		obj.display4();
		System.out.println(obj.age);
		
	}

}
