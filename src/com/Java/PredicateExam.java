package com.Java;

import java.util.function.Predicate;

public class PredicateExam {
	
	public static void main(String[] args) {
		Predicate<Integer> isPrime = (n)->{
			if (n <= 1) return false;
		    for (int i = 2; i < n; i++) {
		        if (n % i == 0) return false;
		    }
		    return true;
		};
		
		boolean res = isPrime.test(7);
		
		if(res==true) {
			System.out.println("it's a prime number");
		}
		else {
			System.out.println("not a prime number");
		}
		
		
	}

}
