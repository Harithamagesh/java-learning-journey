package com.task;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Frock frock = new Frock("Red", "M", 120.0);
        Jean jean = new Jean("Blue", "Free", 150.0);
        PartyWear partyWear = new PartyWear("Green", "L", 200.0);
        CottonDress cottonDress = new CottonDress("Pink", "S", 70.0);
        CasualDress casualDress = new CasualDress("Yellow", "XL", 90.0);

        Payment payment = new Payment();
        
        boolean continueShopping = true;
        
        System.out.println("\nWhich product details do you want to see?");
        System.out.println("1. Frock");
        System.out.println("2. Jean");
        System.out.println("3. PartyWear");
        System.out.println("4. CottonDress");
        System.out.println("5. CasualDress");
        System.out.print("Enter your choice (1-5):");
        int firstChoice = sc.nextInt();
        sc.nextLine();

        switch (firstChoice) {
            case 1 : 
            	frock.displayDetails(frock);
            	break;
            case 2 : 
            	jean.displayDetails(jean);
            	break;
            case 3 : 
            	partyWear.displayDetails(partyWear);
            	break;
            case 4 : 
            	cottonDress.displayDetails(cottonDress);
            	break;
            case 5 : 
            	casualDress.displayDetails(casualDress);
            	break;
            default : 
            	System.out.println("Invalid choice. Please select between 1 and 5.");
            	
        }
        
	   	


        while (true) {
            System.out.print("\nDo you want to continue? (yes/no): ");
            String answer = sc.next();

            if (answer.equals("yes")) {
                System.out.println("\nWhich product details do you want to see?");
                System.out.println("1. Frock");
                System.out.println("2. Jean");
                System.out.println("3. PartyWear");
                System.out.println("4. CottonDress");
                System.out.println("5. CasualDress");
                System.out.print("Enter your choice (1-5): ");
                int choice = sc.nextInt(); 
                
                switch (choice) {
                    case 1 : 
                    	frock.displayDetails(frock);
                    	break;
                    case 2 : 
                    	jean.displayDetails(jean);
                    	break;
                    case 3 : 
                    	partyWear.displayDetails(partyWear);
                    	break;
                    case 4 : 
                    	cottonDress.displayDetails(cottonDress);
                    	break;
                    case 5 : 
                    	casualDress.displayDetails(casualDress);
                    	break;
                    default : 
                    	System.out.println("Invalid choice! Please select between 1 and 5.");
                }
            } 
            else if (answer.equals("no")) {
                continueShopping = false;
                payment.paymentOptions();
                break;
            } 
//            
            else {
                System.out.println("Please enter only 'yes' or 'no'.");
            }
            
            
        }    
        
	} 
	
}
