package com.algorithm;

public class LinearSearch {
    public static int linearSearch(String[] array, String target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i]==target)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        String[] a = {"apple", "banana", "cherry", "date", "fig", "grape"};
        String n = "cherry"; 

        int result = linearSearch(a, n);
        if (result != -1) {
            System.out.println("Found at index: " + result);
        } else {
            System.out.println("Not found");
        }
    }
}
