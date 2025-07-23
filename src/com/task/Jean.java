package com.task;

public class Jean {
	
	String colour;
	String size;
	double price;
	
	public Jean(String colour, String size, double price) {
        this.colour = colour;
        this.size = size;
        this.price = price;
    }

    public void displayDetails(Jean jn) {
        System.out.println("Jean - Colour: " + colour + ", Size: " + size + ", Price: " + price);
    }

}
