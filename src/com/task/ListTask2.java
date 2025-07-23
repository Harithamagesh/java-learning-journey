package com.task;

public class ListTask2 {
		
		String name;
		int age;
		String bloodGroup;
		
		public ListTask2(String name, int age, String bloodGroup) {
			this.name = name;
			this.age = age;
			this.bloodGroup = bloodGroup;
			
		}
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getBloodGroup() {
			return bloodGroup;
		}
		public void setBloodGroup(String bloodGroup) {
			this.bloodGroup = bloodGroup;
		}
		
		public void display() {
			System.out.println("Name:" + name);
			System.out.println("Age:" + age);
			System.out.println("Bloodgroup:" + bloodGroup);
		}
		
	      public  String toString() {
			return "[name:" + name + ", age:" + age + ", Bloodgroup:" + bloodGroup +"]";
	    	
	      }
	

}
