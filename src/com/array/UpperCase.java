package com.array;

import java.util.Arrays;

public class UpperCase {
	
	public static void main(String[] args) {
		String names[] = new String [3];
		names[0]="haritha";
		names[1]="magesh";
		names[2]="divya";		
//
		
//		for(int i=0;i<names.length;i++) {
//			names[i]=names[i].toUpperCase();
//		}
//		
		for(String i:names) {
			System.out.println(i);
			
		}
		
		String a=Arrays.toString(names);
		a=a.replace("[", " ").replace("]", " ").toUpperCase().replace(",", " *");
		for(int i=0;i<a.length();i++) {
 
			if(a!=null) {
				
				System.out.print(a.charAt(i));
			}
		
		}
		
//		
//		String []b=a.split(a);
//		System.out.println(b[0]);
		
	}

}
