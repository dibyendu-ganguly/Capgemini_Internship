/*
 * 
 * Exercise 7: Create a method to check if a number is an increasing number
 * Method Name 			checkNumber 
 * Method Description 	Check if a number is an increasing number 
 * Argument 			int number 
 * Return Type 			boolean 
 * Logic 				A number is said to be an increasing number if no digit is exceeded by the digit to its left. 
 * For Example : 		134468 is an increasing number 

 * 
 */
package com.capgemini.lab1allexercise;
import java.util.Scanner;
public class Exercise_7 {
	static boolean checkNumber(int number) {
		int digitCount=0,temp=number;
		while(temp!=0) {
			temp=temp/10;
			digitCount++;
		}
		temp=number;
		int[] array = new int[digitCount];
		for(int i=0; i < digitCount; i++) {
			array[i] = temp%10;
			temp=temp/10;
		}
		for(int i=0;i<digitCount-1;i++) {
			if(array[i]<array[i+1]) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check if it is an increasing number");
		int n = sc.nextInt();
		boolean result = checkNumber(n);
		if(result) {
			System.out.println("The number "+n+" is an increasing number");
		}
		else
			System.out.println("The number "+n+" is not an increasing number");
		sc.close();

	}

}