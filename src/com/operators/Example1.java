package com.operators;

import java.util.Scanner;

public class Example1 {
	public static void main(String[] args) {
//		int a = 10;
//		System.out.println(a);
//		int b = 20;
//		System.out.println(b);
//		
//		System.out.println(a+b);
//		System.out.println("add:"+(a+b));
//		System.out.println("sub:"+(a-b));
//		System.out.println("mul:"+(a*b));
//		System.out.println("div:"+(a/b));
//		System.out.println("mod:"+(a%b));
//		
//		System.out.println(++a);
//		System.out.println(a++);
//		System.out.println(a);
//		
//		System.out.println(--b);
//		System.out.println(b--);
//		System.out.println(b);
//		
//		int a = 10;
//		int b = 20;
//		System.out.println(a);
//		System.out.println(b);
//		a=b;
//		System.out.println(a);
//		a+=b;
//		System.out.println(a);
//		a-=b;
//		System.out.println(a);
//		a*=b;
//		System.out.println(a);
//		a/=b;
//		System.out.println(a);
//		a%=b;
//		System.out.println(a);
		
		//
//		System.out.println(a<b);
//		System.out.println(a>b);
//		System.out.println(a<=b);
//		System.out.println(a>=b);
//		System.out.println(a!=b);
//		
//		int a = 5;
//		int b = 10;
//		int c = 15;
//		System.out.println(a>b && a<c);
//		System.out.println(a>b || a<c);
//		System.out.println(!(a>b || a<c));
		
//		int n = 1;
//		String number;
//		number = n >= 0 ?"positive" : "negative";
//		System.out.println(number);
		
//		int x = 7;
//		int y = 4;//0000 0100
//		System.out.println(x & y);
//		System.out.println(x | y);
//		System.out.println(x ^ y);
//		System.out.println(~y);
//		
//		System.out.println(x<<y);
//		System.out.println(x>>y);
		
		int n = 34;
		String marks;
		marks = n >= 35 ?"pass":"fail";
		System.out.println(marks);
		
		System.out.println("enter the mark");
		Scanner sc = new Scanner(System.in);
		int student = sc.nextInt();
		String mark;
		mark = student >= 35 ?"pass":"fail";
		System.out.println(mark);
		sc.close();
		
	}
	

}

