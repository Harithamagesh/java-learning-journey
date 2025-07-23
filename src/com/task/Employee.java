package com.task;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Employee implements PFCalculator{

	@Override
	public double calculatePF(double salary) {
		
		return salary * 0.12;
	}
	
	public static void main(String[] args) {
        List<CollectionTask> employeeList = new ArrayList<>();
        employeeList.add(new CollectionTask(4, "Darla", 65000, "Marketing"));
        employeeList.add(new CollectionTask(1, "Akash", 50000, "HR")); 
        employeeList.add(new CollectionTask(3, "Chandru", 55000, "Finance"));
        employeeList.add(new CollectionTask(2, "Bavani", 60000, "IT"));
        

        Employee pF = new Employee();

        for (CollectionTask emp : employeeList) {
            double pf = pF.calculatePF(emp.getSalary());
            System.out.println("EmpId: " + emp.getId() +
            		           " |EmpName: " + emp.getName() +
                               " | Department: " + emp.getDepartment() +
                               " | Salary: " + emp.getSalary());
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        boolean found = false;
        for (CollectionTask emp : employeeList) {
            if (emp.getId() == id && emp.getName().equalsIgnoreCase(name)) {
                double pf = new Employee().calculatePF(emp.getSalary());
                System.out.println("PF:" + pf);
                found = true;
                break;
            }
        }
        
       
        
        
        if (!found)
            System.out.println("Employee not found.");

        sc.close();
        
       
	}
}
        
        
    


