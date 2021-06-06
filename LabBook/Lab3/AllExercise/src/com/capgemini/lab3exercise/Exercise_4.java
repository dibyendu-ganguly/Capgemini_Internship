/**
 * 
 * Exercise 4: Create a method that accepts a number and modifies it such that 
 * the each of the digit in the newly formed number is equal to the difference between two consecutive digits in the original number. 
 * The digit in the units place can be left as it is. 
 * Note: Take the absolute value of the difference. Ex: 6-8 = 2
 * 
 * Method Name 			modifyNumber 
 * Method Description 	Accepts a number and modify it as per the requirement 
 * Argument 			int number1 
 * Return Type 			int 
 * Logic 				Accept a number and modify it such that the each of the digit in the newly formed number is equal to the difference between two consecutive digits in the original number. 
 * For example. 
 * Input: 45862 
 * Output:13242 
 * Algorithm: 
 * • Convert number into String 
 * • Extract each char using charAt method 
 * • Convert char to int and find the difference 
 * • Create new StringBuffer object and keep adding the difference 
 * • Finally convert StringBuffer to int 
 * 
 * 
 * 
 */
package com.capgemini.lab3exercise;

/**
 * @author DIBYENDU
 *
 */
import java.util.*;
public class Exercise_4 {

	/**
	 * @param args
	 */
	
	static int modifyNumber(int number1) {
		String s=String.valueOf(number1); //Convert number to string
		int m, n, diff;
		StringBuffer sb=new StringBuffer(""); //Create StringBuffer object
		for(int i=0;i<(s.length())-1;i++) {
			m = Character.getNumericValue(s.charAt(i)); //extract and convert each i'th char to int
			n = Character.getNumericValue(s.charAt(i+1)); //extract and convert each i+1'th char to int
			diff = Math.abs(m-n); //get the difference of two consecutive numbers
			sb.append(diff); //add difference to StringBuffer
		}
		sb.append(number1%10);//add the digit in the unit's place
		
		
		return Integer.parseInt(sb.toString());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = sc.nextInt();
		int res = modifyNumber(n);
		System.out.println("The resulting number is: "+res);
		sc.close();

	}

}
