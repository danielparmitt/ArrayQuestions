//Question 2


package com.bmpl.arrayoneD;

import java.util.Scanner;

public class Question2 {
	
	public static void main(String[] args) {
		int n;
		int a[]= new int[10];
		System.out.println("Enter the number of elements you want to enter?");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		System.out.println("Enter "+n+" elements of the array?");
		for(int i=0;i<n;i++) {
			a[i]= sc.nextInt();
		}
		
		int unique = 0;
		
		for(int i=0;i<n;i++) {
			int j;
			for(j=0;j<n;j++) {
				
				if(i!=j && a[i]==a[j]) {
					unique = a[i];
				}	
			}
			
		}
		System.out.println("The unique element is "+unique);
	}
}
