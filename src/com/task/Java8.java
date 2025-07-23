package com.task;

import java.util.function.Consumer;
import java.util.function.Function;

public class Java8 {
	
	public static void main(String[] args) {
//		Function<Integer, Integer> sqr = s -> s*s;
//		System.out.println(sqr.apply(2));
//		
//		
//		Function<String, String> upper = u -> u.toUpperCase();
//		System.out.println(upper.apply("haritha"));
		
		
		Function<String, String> upperCase = u -> u.toUpperCase();
		Function<String, Integer> length = l -> l.length();
		System.out.println(upperCase.apply("haritha")+ " , " + length.apply("haritha"));
		
		
		
		Consumer<String> task= name -> System.out.println("Hello, "+name);
		task.accept("Haritha");
		
		
		
		Consumer<Integer> num = number -> System.out.println(number);
		Consumer<Integer> nums = n -> System.out.println(n*n);
		Consumer<Integer> ans1 = num.andThen(nums);
		ans1.accept(2);
	}
}
