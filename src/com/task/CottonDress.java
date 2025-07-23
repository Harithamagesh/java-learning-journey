package com.task;

public class CottonDress {
	
	String colour;
	String size;
	double price;
	
	public CottonDress(String colour, String size, double price) {
        this.colour = colour;
        this.size = size;
        this.price = price;
    }

    public void displayDetails(CottonDress css) {
        System.out.println("Cotton dress - Colour: " + colour + ", Size: " + size + ", Price: " + price);
    }


}
