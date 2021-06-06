/**
 * 
 * 
 * Exercise 8: Create a method that accepts a String and checks if it is a positive string. 
 * A string is considered a positive string, if on moving from left to right each character 
 * in the String comes after the previous characters in the Alphabetical order. 
 * For Example: ANT is a positive String (Since T comes after N and N comes after A). 
 * The method should return true if the entered string is positive.
 * Note: Complete this exercise on Doselect.                     [DoSelect-Lab6_5]
 * 
 * 
 */
package com.capgemini.lab3exercise;

/**
 * @author DIBYENDU
 *
 */
import java.util.*;
public class Exercise_8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String: ");
		String str = sc.nextLine();
		str = str.toUpperCase();
		for(int i=0; i<str.length()-1;i++) {
			if((int)str.charAt(i)>(int)str.charAt(i+1)) {
				System.out.println("The string is not Positive String");
				System.exit(0);
			}
		}
		System.out.println("The string is a Positive String");
		
		sc.close();

	}

}
