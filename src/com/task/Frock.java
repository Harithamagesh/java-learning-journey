package com.task;

public class Frock {
	
	String colour;
	String size;
	double price;
	
	public Frock(String colour, String size, double price) {
        this.colour = colour;
        this.size = size;
        this.price = price;
    }


	public void displayDetails(Frock fk) {
        System.out.println("Frock - Colour: " + colour + ", Size: " + size + ", Price: " + price);
    }
}
