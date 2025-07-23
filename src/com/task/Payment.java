package com.task;

import java.util.Scanner;

public class Payment {
	public void paymentOptions() {
	    Scanner scanner = new Scanner(System.in);

	    System.out.println("\n--- Payment Options ---");
	    System.out.println("GPay");
	    System.out.println("PhonePay");
	    System.out.println("NetBanking");
	    System.out.println("Pay on delivery");
	    System.out.print("Choose a payment option: ");
	    String option = scanner.next();
	    

	      switch (option) {
	            case "GPay" : 
	             Gpay gpay=new Gpay();
	             gpay.type();
	            	break;
	            case "PhonePay" : 
	            	PhonePay phonePay = new PhonePay();
	            	phonePay.type();
	            	break;
	            case "Netbanking" : 
	            	NetBanking netBanking = new NetBanking();
	            	netBanking.type();
	            	break;
	            case "Pay on delivery" : 
	            	System.out.println("You selected Pay on Delivery.");
	            	break;
	            default : 
	            	System.out.println("Invalid payment option.");
	        }

	        System.out.println("Thank you for shopping with us!");
	    }
	}


