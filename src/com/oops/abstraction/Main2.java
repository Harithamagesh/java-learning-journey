package com.oops.abstraction;

import java.util.Scanner;

public class Main2 {
	
	
	public static void main(String[] args) {
		
//		Gpay gpay = new Gpay();
//		gpay.showTransaction();
		
//		PhonePay pay = new PhonePay();
//		pay.showTransaction();
		
//		NetBanking netBanking = new NetBanking();
//		netBanking.showTransaction();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Choose payment method:");
		System.out.println(" 1. Gpay ");
		System.out.println(" 2. Phone pay ");
		System.out.println(" 3. NetBanking ");
		System.out.println("Enter your choice:");
		
		int choice = sc.nextInt();
		Bank PaymentMethod;
		
		switch(choice) {
		case 1:
			PaymentMethod = new Gpay();
			Gpay gpay = new Gpay();
			gpay.showTransaction();
			break;
		case 2:
			PaymentMethod = new PhonePay();
			PhonePay pay = new PhonePay();
			pay.showTransaction();
			break;
		case 3:
			PaymentMethod = new NetBanking();
			NetBanking netBanking = new NetBanking();
			netBanking.showTransaction();
			break;
		default:
			System.out.println("Invalid choice");
			break;
		}
				
	}

}
