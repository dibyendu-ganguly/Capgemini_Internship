/*
 * 
 * Exercise 6: Create a class with a method to find the difference between 
 * the sum of the squares and the square of the sum of the first n natural numbers.
 * Method Name 			calculateDifference 
 * Method Description 	Calculate the difference 
 * Argument 			int n 
 * Return Type 			int - Sum 
 * Logic 				Find the difference between the sum of the squares of the first n natural numbers and the square of their sum. 
 * For Example 			if n is 10,you have to find 
 * 						(1^2+2^2+3^2+….9^2+10^2)- (1+2+3+4+5…+9+10)^2 

 * 
 */
package com.capgemini.lab1allexercise;
import java.util.Scanner;
public class Exercise_6 {
	static int calculateDifference (int n) {
		int sum, sqSum=0, sumAll=0;
		for(int i=1;i<=n;i++) {
			sqSum = sqSum + i*i;
			sumAll = sumAll + i;
		}
		sum = sqSum - sumAll;
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of number n \n(for which the difference between the sum of the squares of the first n natural numbers and the square of their sum is to be found out):");
		int num = sc.nextInt();
		int result = calculateDifference(num);
		System.out.println("The required result is: "+result);
		
		sc.close();

	}

}
