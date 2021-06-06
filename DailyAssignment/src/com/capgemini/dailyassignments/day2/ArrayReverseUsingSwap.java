package com.capgemini.dailyassignments.day2;
/*
 * 
 * Write a program to print array elements in the reverse order using swapping method?
 * Hint: take even number array
 * input: 20 30 40 50 60 70
 * output: 70 60 50 40 30 20
 * 
 */
import java.util.Scanner;
public class ArrayReverseUsingSwap {

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
		System.out.println("Enter the array elements:");
		int[] array = new int[n];
		//System.out.println("n:"+n);
		for(int i=0;i<n;i++) {
			array[i]=sc.nextInt();
		}
		
		System.out.println("\nArray before reversing:");
		for(int i=0;i<n;i++)
			System.out.print(array[i] + " ");
		
		int temp;
		for(int i=0;i<n/2;i++) {
			temp = array[i];
			array[i]=array[n-i-1];
			array[n-i-1]=temp;
		}
		
		System.out.println("\nArray after reversing:");
		for(int i=0;i<n;i++)
			System.out.print(array[i] + " ");
		
		
		sc.close();
	}

}
