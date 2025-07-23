package com.task;

public class PartyWear {
	
	String colour;
	String size;
	double price;
	
	
	public PartyWear(String colour, String size, double price) {
        this.colour = colour;
        this.size = size;
        this.price = price;
    }

    

	public void displayDetails(PartyWear pw) {
        System.out.println("Partywear - Colour: " + colour + ", Size: " + size + ", Price: " + price);
    }


}
