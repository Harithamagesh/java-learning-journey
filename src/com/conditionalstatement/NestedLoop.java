package com.conditionalstatement;


public class NestedLoop {
	public static void main(String[] args) {
//		int i =5;
//		while(i>=1) {
//			System.out.println("");
//			int j =1;
//			while(j<=i) {
//				System.out.print("*");
//				j++;
//			}
//			i--;
//		}
//		
//		int num = 1;
//		for(int i=1;i<=5;i++) {
//			System.out.println("");
//			for(int j=1;j<=i;j++) {
//				if(j%2 == 0) {
//					System.out.print("@");
//				}
//				else {
//					System.out.print("$");
//				}
//			}
//		}
		
//		
//		for(int i=1;i<=5;i++) {
//			int num = i;
//			for(int j=1;j<=i;j++) {
//				if(i%2 == 0) {
//					if(j%2 == 0) 
//					System.out.print(num + " ");
//				    else 
//					System.out.print("*");
//				}
//				else {
//					if(j%2 == 0) 
//						System.out.print("*");
//				    else 
//				    	System.out.print(num + " ");
//					}
//				num++;
//			}
//			System.out.println("");
//		}
		
////		
//		for(int i=5;i>=1;i--) {
//			int num = i;
//			for(int j=1 ;j<=5;j++) {
//				if(i%2 == 0) {
//					if(j%2 == 0)
//						System.out.print(num + " ");
//					else
//						System.out.print("*");
//			    }
//				else {
//					if(j%2 == 0)
//						System.out.print("*");
//					else
//						System.out.print(num + " ");
//						
//				}
//				num++;
//			}
//			System.out.println("");
//			
//		}
		
		
		
//		int n = 5;
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=n-i;j++) {
//				System.out.print(" ");
//			}
//			for(int k=1;k<=2*i-1;k++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		int num = 5;
		for(int i=1;i<=num;i+=2) {
			for(int j=num;j>=i;j-=2) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<=num;i+=2) {
			for(int j=1;j<=i;j+=2) {
				System.out.print(" ");
			}
			for(int k=num;k>=i;k--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}
}

