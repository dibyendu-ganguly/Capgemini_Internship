/*
 * 
 * Exercise 8: Create a method to check if a number is a power of two or not
 * Method Name 			checkNumber 
 * Method Description 	Checks if the entered number is a power of two or not 
 * Argument 			int n 
 * Return Type 			boolean 
 * Logic 				Check if the input is a power of two. 
 * Ex:					8 is a power of 2 
 * 
 * 
 */
package com.capgemini.lab1allexercise;
import java.util.Scanner;
public class Exercise_8 {
	static boolean checkNumber(int n) {
		int temp=n;
		while(temp!=1) {
			if(temp%2!=0) 
				return false;
			temp = temp/2;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to check if it is a power of two or not: ");
		int num = sc.nextInt();
		boolean result = checkNumber(num);
		if(result)
			System.out.println(num+" is power of two");
		else
			System.out.println(num+" is not a power of two");
		sc.close();
	}

}
