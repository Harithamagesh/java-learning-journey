package com.array;

//import java.lang.reflect.Array;
import java.util.Arrays;

import com.constructor.Main;

public class ArraySort {
	
//	public static void Sort(int[] array) {
//		int size = array.length;
//		for(int i=0;i<size-1;i++) 
//			for(int j=0;j<size-i-1;j++) 
//				if(array[j] < array[j+1]) {
//					int temp = array[j];
//					array[j] = array[j+1];
//					array[j+1] = temp;
//				}
//	}
	public static void main(String[] args) {
		int[] num = {13,7,44,39,52,63};
		for(int i=0;i<num.length;i++) {
			System.out.println(num[i]);
		}
		Arrays.sort(num);
		System.out.println("sorted");
		for(int i=0;i<num.length;i++) {
			System.out.println(num[i]);
		}
//		System.out.println("Sorted array is:");
//		System.out.println(Arrays.toString(num));
	}
	

}
