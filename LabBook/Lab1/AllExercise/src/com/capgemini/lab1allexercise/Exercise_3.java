/*
 * 
 * Exercise 3: The Fibonacci sequence is defined by the following rule. The first 2 values in the sequence are 1, 1. 
 * Every subsequent value is the sum of the 2 values preceding it.
 * Write a Java program that uses both recursive and non-recursive functions to print the nth value of the Fibonacci sequence.
 * 
 */
package com.capgemini.lab1allexercise;
import java.util.*;
public class Exercise_3 {
	
	static long recursiveFibonacci(long n) {
		if(n==0 || n==1) 	
			return n;
		else 				
			return (recursiveFibonacci(n-1) + recursiveFibonacci(n-2));
	}
	
	static long nonRecursiveFibonacci(long n) {
		if(n==0 || n==1) 	return n;
		else {
			long a = 0, b = 1, cnt = 1;
			while(cnt++ < n) {
				long temp = a;
				a = b;
				b = temp + a;
			}
			return b;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of n to find the nth Fibonacci Number: ");
		int num = sc.nextInt();
		System.out.println("The " + num + "th Fibonacci number by recursion is: " + recursiveFibonacci(num));
		System.out.println("The " + num + "th Fibonacci number by not using recursion is: " + nonRecursiveFibonacci(num));
		sc.close();

	}

}
