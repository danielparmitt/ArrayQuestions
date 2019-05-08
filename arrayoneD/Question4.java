//Question 4


package com.bmpl.arrayoneD;

import java.util.Scanner;

public class Question4 {
	
	public static void main(String[] args) {
		
		int a[] = new int[10];
		int b[] = new int[10];
		int sum,n1,n2 ;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number which we will get after the sum?");
		sum = sc.nextInt();
		
		System.out.println("Enter the number of elements for first array");
		n1 = sc.nextInt();
		
		System.out.println("Enter "+n1+" elements in the first array");
		for(int i=0;i<n1;i++) {
			a[i] = sc.nextInt();
		}
		
		
		System.out.println("Enter the number of elements for second array");
		n2 = sc.nextInt();
		
		System.out.println("Enter "+n2+" elements in the second array");
		for(int i=0;i<n2;i++) {
			b[i] = sc.nextInt();
		}
		
		for(int i=0;i<n1;i++) {
			for(int j=0;j<n2;j++) {
				
				if(a[i]+b[j] == sum) {
					if(a[i]<b[j]) {
						System.out.println("The elements are "+a[i]+" ,"+b[j]);
					}
					else {
						System.out.println("The elements are "+b[j]+" ,"+a[i]);
					}
				}
			}
		}
		
	}
}
