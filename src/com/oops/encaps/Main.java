package com.oops.encaps;

public class Main {
	
	public static void main(String[] args) {
		Employee obj = new Employee();
//		System.out.println(obj.getId());
		obj.setId(102);
//      System.out.println(obj.getId());
//		System.out.println(obj.getName());
		obj.setName("Magesh");
//		System.out.println(obj.getName());
//		System.out.println(obj.getDept());
		obj.setDept("Sales");
//		System.out.println(obj.getDept());
//		System.out.println(obj.getsalary());
		obj.setsalary(30000);
//		System.out.println(obj.getsalary());
//		System.out.println(obj.getage());
		obj.setage(54);
//		System.out.println(obj.getage());
		
		System.out.println(obj.getId() + "\n" + obj.getName() + "\n" + obj.getDept() + "\n" + obj.getsalary() + "\n" + obj.getage());
		
	}

}
