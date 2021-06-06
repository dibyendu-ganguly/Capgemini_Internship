package com.capgemini.dailyassignments.day2;
/*
 * Write a Java Program to find sum of numbers 
 * a) even index
 * b) odd index
 * 
 */
import java.util.Scanner;
public class OddEvenIndexSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("Enter the number of elements in the array: ");
		do {
			n = sc.nextInt();
			if(n%2!=0)
				System.out.print(n+" is an odd number. Please, enter an even number: ");
		}while(n%2!=0);
		
		int[] array = new int[n];
		int oddSum=0, evenSum=0;
		for(int i=0;i<n;i++) {
			array[i]=sc.nextInt();
			if(i%2==0)
				evenSum = evenSum + array[i];
			else
				oddSum = oddSum + array[i];
		}
		System.out.println("Sum of numbers at even indices: " + evenSum);
		System.out.println("Sum of numbers at odd indices: " + oddSum);
		
		
		
		sc.close();
	}

}
