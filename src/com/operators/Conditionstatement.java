package com.operators;

public class Conditionstatement {
	public static void main(String[] args) {
//		int a = 11;
//		if(a%2 == 0){
//			System.out.println(a+ " is a even number");
//		}
//		else{
//			System.out.println(a+ " is a odd number");
//		}
//		
//		System.out.println("Enter the marks");
//		Scanner sc = new Scanner(System.in);
//		int x = sc.nextInt();
//	
//		if(x<=500 && x>=400 ) {
//			System.out.println("A grade");
//		}
//		else if(x<400 && x>=300) {
//			System.out.println("B grade");
//		}
//		else if(x<300 && x>=200) {
//			System.out.println("C grade");
//		}
//		else if(x<200 && x>=100) {
//			System.out.println("D grade");
//		}
//		else {
//			System.out.println("Fail");
//		}
		
//		int Tamil,English,Maths,Science,Social;
//		int total,marks;
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter five subjects marks");
//		Tamil=sc.nextInt();
//		English=sc.nextInt();
//		Maths=sc.nextInt();
//		Science=sc.nextInt();
//		Social=sc.nextInt();
//		
//		total = Tamil + English + Maths + Science + Social;
//		marks = (total);
//		
//		System.out.println("Total Marks = " + total);
//		
//		
//		if(marks<=500 && marks>=400) {
//			System.out.println("A grade");
//		}
//		else if(marks<400 && marks >= 300) {
//			System.out.println("B grade");
//		}
//		else if(marks>300 &&marks >= 200) {
//			System.out.println("C grade");
//		}
//		else if(marks>200 && marks >= 100) {
//			System.out.println("D grade");
//		}
//		else if(marks>100 && marks >= 50) {
//			System.out.println("E grade");
//		}
//		else {
//			System.out.println("Fail");
//		}
		
//		System.out.println("Enter the age");
//		Scanner sc = new Scanner(System.in);
//
//		int age =sc.nextInt();
//		if(age>=0 && age<=10) {
//			System.out.println("Baby");
//			System.out.println("Enter the group");
//			Scanner a = new Scanner(System.in);
//			int groups = a.nextInt() ;
//			if(groups>=0 && groups<=4) {
//				System.out.println("Play school");
//			}
//			else if(groups>4 && groups<=5) {
//				System.out.println("Nursery");
//			}
//			else {
//				System.out.println("Primary");
//			}
//			a.close();
//		}
//		else if(age>10 && age<=17) {
//			System.out.println("Young teenagers");
//			System.out.println("Enter the group");
//			Scanner b = new Scanner(System.in);
//			int groups = b.nextInt();
//			if(groups>=11 && groups<=13) {
//				System.out.println("Middle school");
//			}
//			else if(groups>13 && groups<=15) {
//				System.out.println("Lower secondary");
//			}
//			else {
//				System.out.println("Higher secondary");
//			}
//			b.close();
//		}
//		else if(age>17 && age<=24) {
//			System.out.println("Teenager");
//			System.out.println("Enter the group");
//			Scanner c = new Scanner(System.in);
//			int groups = c.nextInt();
//			if(groups>=18 && groups<=20) {
//				System.out.println("Under graduate");
//			}
//			else {
//				System.out.println("Post graduate");
//			}
//			c.close();
//		}
//		else if(age>24 && age<=39) {
//			System.out.println("Adult");
//		}
//		else {
//			System.out.println("Old adult");
//		}
//		sc.close();
		
//		int number = 20;
//		switch(number) {
//		case 10: System.out.println("1");
//		break;
//		case 20: System.out.println("2");
//		break;
//		case 30: System.out.println("3");
//		break;
//		default:System.out.println("Not in 10,20 or 30");
//		}
		
		for(int i=1;i<=5;i++) {
		for(int j=1;j<=i;j++) {
			System.out.print("*");
		}
		System.out.println();
		}
		
	}

}
