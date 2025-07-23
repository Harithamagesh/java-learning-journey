package com.task;

import java.util.Scanner;

public class Products {
	
	public void continueShopping() {
		
		Scanner sc = new Scanner(System.in);
        
        Frock frock = new Frock("Red", "M", 120.0);
        Jean jean = new Jean("Blue", "Free", 150.0);
        PartyWear partyWear = new PartyWear("Green", "L", 200.0);
        CottonDress cottonDress = new CottonDress("Pink", "S", 70.0);
        CasualDress casualDress = new CasualDress("Yellow", "XL", 90.0);

        System.out.println("Product Details:");
        
        System.out.println("Which product details do you want to see?");
        System.out.println("1. Frock");
        System.out.println("2. Jean");
        System.out.println("3. PartyWear");
        System.out.println("4. CottonDress");
        System.out.println("5. CasualDress");
        System.out.print("Enter your choice (1-5): ");
        
        int choice = sc.nextInt();
        System.out.println();
        Payment payment = new Payment();
        boolean continueShopping = true;
        switch (choice) {
            case 1 -> frock.displayDetails(frock);
            case 2 -> jean.displayDetails(jean);
            case 3 -> partyWear.displayDetails(partyWear);
            case 4 -> cottonDress.displayDetails(cottonDress);
            case 5 -> casualDress.displayDetails(casualDress);
            default -> System.out.println("Invalid choice! Please select between 1 and 5.");
        }
	}    
}
