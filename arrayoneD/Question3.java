//Question 3


package com.bmpl.arrayoneD;

import java.util.Scanner;

public class Question3 {
	
	public static void main(String[] args) {
		int n1,n2;
		int a[] = new int[10];
		int b[] = new int[10];
		int c[] = new int[10];
		
		System.out.println("Enter the number of elements for the first array?");
		Scanner sc = new Scanner(System.in);
		n1 = sc.nextInt();
		System.out.println("Enter "+n1+" elements in the first array?");
		for(int i=0;i<n1;i++) {
			a[i] = sc.nextInt();
		}
		
		
		System.out.println("Enter the number of elements for the second array?");
		n2 = sc.nextInt();
		System.out.println("Enter "+n2+" elements in the first array?");
		for(int i=0;i<n2;i++) {
			b[i] = sc.nextInt();
		}
		
		System.out.println("**************************************");
		
		for(int i=0;i<n1;i++) {
			
			for(int j=0;j<n2;j++) {
				
				if(a[i] == b[j]) {
					System.out.println(a[i]);
				}
			}
		}
		
	}
}
