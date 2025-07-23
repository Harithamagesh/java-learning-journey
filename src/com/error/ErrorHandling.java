package com.error;

public class ErrorHandling {
	
	public static void main(String[] args) {
		try {
			System.out.println(10/0);
		}
		catch(Exception e){
			System.out.println(e.getMessage());
			System.out.println("Cannot be divided by zero");
		}
		
		try {
			String name = null;
			System.out.println(name.length());
		}
		catch(Exception e) {
			System.out.println("Null value");
		}
		
		try {
			int[] number = new int[3];
			number[0]=1;
			number[1]=2;
			number[2]=3;
			number[3]=4;
			for(int i:number) {
				System.out.println(i);
			}
			
		}
		catch(Exception e){
			System.out.println("Check length");
		}
		finally {
			System.out.println("final check");
		}
//		try {
//			String name = "Haritha";
//			System.out.println(name.length());
//			System.out.println(10/0);
//		}
//		catch(ArithmeticException e) {
//			System.out.println(e.getMessage());
//		}
//		catch(NullPointerException e) {
//			System.out.println(e.getMessage());
//		}
//		try {
//			String name = "Haritha";
//			System.out.println(name.length());
//			System.out.println(10/0);
//		}
//		catch(ArithmeticException | NullPointerException e) {
//			System.out.println(e.getMessage());
//		}
	}

}
