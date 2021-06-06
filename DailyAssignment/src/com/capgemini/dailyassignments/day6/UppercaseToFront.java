/**
 * 
 * Write a java program to read a string and move all uppercase characters to front?
 * 
 */
package com.capgemini.dailyassignments.day6;

/**
 * @author DIBYENDU
 *
 */
import java.util.*;
public class UppercaseToFront {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String str = sc.nextLine();
		
		String res=" ";
		for (int i = 0; i < str.length(); i++) {
			if(Character.isUpperCase(str.charAt(i)))
				res = res + str.charAt(i);
		}
		for (int i = 0; i < str.length(); i++) {
			if(!Character.isUpperCase(str.charAt(i)))
				res = res + str.charAt(i);
		}
		System.out.println("The resulting string is:"+res);
		sc.close();

	}

}
