package com.task;

public class CasualDress {
	
	String colour;
	String size;
	double price;
	
	public  CasualDress(String colour, String size, double price) {
        this.colour = colour;
        this.size = size;
        this.price = price;
    }

    public void displayDetails(CasualDress cd) {
        System.out.println("Casual dress - Colour: " + colour + ", Size: " + size + ", Price: " + price);
    }

}
