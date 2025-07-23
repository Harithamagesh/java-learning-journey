package com.oops.inheritance;

public class Main5 {
	
	public static void main(String[] args) {
		
		Employee emp = new Employee(17, "Haritha", 50000, "IT");
		Employee emp1 = new Employee(18, "swetha", 30000, "IT");
		
		Company company=new Company("zoho", emp);
		company.display();
		Company company1=new Company("tcs", emp1);
		company1.display();
		
	}

}
