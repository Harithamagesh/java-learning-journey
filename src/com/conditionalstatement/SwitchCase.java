package com.conditionalstatement;

import java.util.Scanner;

public class SwitchCase {
	public static void main(String[] args) {
//		System.out.println("enter the day");
//		Scanner sc = new Scanner(System.in);
//		int days = sc.nextInt();
//		switch(days) {
//		case 1 : 
//			System.out.println("Monday");
//		    break;
//		case 2 : 
//			System.out.println("Tuesday");
//		    break;
//		case 3 : 
//			System.out.println("Wednesday");
//		    break;
//		case 4 : 
//			System.out.println("Thursday");
//		    break;
//		case 5 : 
//			System.out.println("Friday");
//		    break;
//		default: 
//			System.out.println("Weekend");
//		}
//		
//		char subCode = 'N';
//		int year = 2;
//		switch(year) {
//		case 1:
//			System.out.println("Physics,Chemistry,Maths");
//			break;
//		case 2:
//			switch(subCode) {
//			case 'H':
//				System.out.println("Data Science");
//				break;
//			case 'N':
//				System.out.println("Matrices and calculus");
//				break;
//			case 'M':
//				System.out.println("Engineering Graphics");
//				break;
//			}
//			break;
//		case 3:
//			switch(subCode) {
//			case 'H':
//				System.out.println("Data Structures");
//				break;
//			case 'N':
//				System.out.println("Artificial Intelligence");
//				break;
//			case 'M':
//				System.out.println("Big data");
//				break;
//			}
//			break;
//		case 4:
//			switch(subCode) {
//			case 'H':
//				System.out.println("Machine learning");
//				break;
//			case 'N':
//				System.out.println("Deep learning");
//				break;
//			case 'M':
//				System.out.println("Cloud computing");
//				break;
//			}
//			break;
//		}
		
		
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the cutoff mark");
//		int cutoff = sc.nextInt();
//		String college = "";
//		switch(cutoff / 10) {
//		case 19:
//			college = "Sri Krishna (Cutoff: 200-190)";
//			break;
//		case 18:
//			college = "NGP ITech (Cutoff: 189-180)";
//			break;
//		case 17:
//			college = "KGISL (Cutoff: 179-170)";
//			break;
//		default:
//			college = "Hindustan (Cutoff: below 170)";
//			break;
//		}
//		System.out.println("Based on the cutoff, eligible for: " + college);
//		sc.close();
		
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number");
		int days = scanner.nextInt();
		if(days>=1 && days<=5) {
			switch(days) {
			case 1:
				System.out.println("Monday");
				break;
			case 2:
				System.out.println("Tuesday");
				break;
			case 3:
				System.out.println("Wednesday");
				break;
			case 4:
				System.out.println("Thursday");
				break;
			case 5:
				System.out.println("Friday");
				break;
			default:
				System.out.println("Weekend");
			}
		}
		else {
			System.out.println("Does not exist");
			}
		scanner.close();
	    }
	
	}

		




