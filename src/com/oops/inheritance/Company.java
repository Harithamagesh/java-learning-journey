package com.oops.inheritance;

public class Company {
	
	   String CompanyName;
	   
	   Employee employee;
	   
	    public Company(String CompanyName, Employee employee) {
	    	this.CompanyName=CompanyName;
	    	this.employee=employee;
			
		}
	    
	    //aggregation - has-a relationship
	    //inherit- is - a relationship 
	    public void display() {
	    	System.out.println("company details");
	    	System.out.println(CompanyName);
	    	System.out.println(employee.EmpId);
	    	System.out.println(employee.EmpName);
	    	System.out.println(employee.salary);
	    	System.out.println(employee.EmpDept);
			
		}
	    
	   

}
