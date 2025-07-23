package com.array;

public class ArrayExample {
	
	public static void main(String[] args) {
		int numbers [] = {1,2,3,4,5,6,7,8};
		System.out.println(numbers[0]);
		System.out.println(numbers.length);
		
		numbers[0]=2;
		numbers[2]=4;
		numbers[4]=6;
		numbers[6]=8;
		for(int i=0;i<numbers.length;i++) {
			System.out.println(numbers[i]);
		}
		
		String names [] = new String[2];
		names[0]="Magesh";
		names[1]="Haritha";
		for(int i=0;i<names.length;i++) {
			System.out.println(names[i]);
		}
		String name [] = {"Magesh","Haritha"};
		System.out.println(name.length);
		for(int i=0;i<name.length;i++) {
			System.out.println(name[i]);
		}
	}
}