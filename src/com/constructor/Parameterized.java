package com.constructor;

import java.lang.reflect.Parameter;

public class Parameterized {
//	int c;
//	public Parameterized(int a,int b) {
//		System.out.println("Parameterized");
//		System.out.println(a);
//		System.out.println(b);
//		
//	}
//	public Parameterized(int c) {
//		this.c=c;
//		System.out.println(c);
//	}
//	public static void main(String[] args) {
//		Parameterized obj = new Parameterized(5, 10);
//		Parameterized obj1 =new Parameterized(13);
//		System.out.println(obj1.c);
//	}
	int age;
	String name;
	String lastname;
	int number;
	public Parameterized(int age,int number,String name,String lastname) {
		this.age=age;
		this.number=number;
		this.name=name;
		this.lastname=lastname;
		System.out.println("age:" + age);
		System.out.println("number:" + number);
		System.out.println("name:" + name);
		System.out.println("lastname:" + lastname);
	}
	public static void main(String[] args) {
		Parameterized pm = new Parameterized(21, 12345, "Haritha", "Magesh");
		Parameterized pm1 = new Parameterized(23, 13579, "Nivetha", "Annadurai");
		Parameterized pm2 = new Parameterized(24, 24680, "Pavish", "Magesh");
		Parameterized pm3 = new Parameterized(25, 12457, "Nivesh", "Annadurai");
		Parameterized pm4 = new Parameterized(26, 34679, "Samiksha", "Dilip");
		Parameterized pm5 = new Parameterized(27, 45780, "Rithvik", "Dilip");
		System.out.println(pm);
	}

}
