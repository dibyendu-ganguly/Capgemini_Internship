/*
 * 
 * Exercise 5: Create a class with a method which can calculate the sum of first n natural numbers which are divisible by 3 or 5.
 * 
 * Method Name 			calculateSum 
 * Method Description 	Calculate Sum 
 * Argument 			int n 
 * Return Type 			int-sum 
 * Logic 				Calculate the sum of first n natural numbers which are divisible by 3 or 5. 

 * 
 */
package com.capgemini.lab1allexercise;
import java.util.Scanner;
public class Exercise_5 {
	static int calculateSum(int n) {
		int sum=0;
		for(int i=1;i<=n;i++) {
			if(i%3==0 || i%5==0)
				sum = sum + i;
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);		
		//Exercise_5 cl = new Exercise_5();
		System.out.print("Enter the value of number n to find the sum of first numbers which are divisible by 3 or 5: ");
		int num = sc.nextInt();
		int result = calculateSum(num);
		System.out.println("The required sum is : " + result);
		sc.close();
	}

}
