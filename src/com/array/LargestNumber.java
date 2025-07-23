package com.array;

public class LargestNumber {
	
	public static void main(String[] args) {
		int number[]= {13,7,24,18,17};
		int max = number[0];
		
		for(int i=0; i<number.length; i++) {
			if(number[i]>max) {
				max=number[i];
			}
		}
		System.out.println("Largest number:" +max);
		
	}

}
