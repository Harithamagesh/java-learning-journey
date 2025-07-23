package com.constructor;

public class CopyConstructor {
	int course_id;
	String course_name;
	double fee;
	int duration;
	
	public CopyConstructor(int course_id,String course_name,double fee,int duration) {
		this.course_id = course_id;
		this.course_name = course_name;
		this.fee = fee;
		this.duration = duration;
	}
	
	public CopyConstructor(CopyConstructor cp) {
		System.out.println("Copyconstructor");
		System.out.println("!@#$%^&*()_&&&&&******");
		System.out.println("course_id: " + cp.course_id);
		System.out.println("course_name: " + cp.course_name);
		System.out.println("double fee: " +  cp.fee);
		System.out.println("duration: " + cp.duration);
	}
	
	public static void main(String[] args) {
		CopyConstructor cp = new CopyConstructor(11,"AI", 10000, 3);
		CopyConstructor cp1 = new CopyConstructor(cp);
		CopyConstructor cp2 = new CopyConstructor(cp);
		
		
	}

}
