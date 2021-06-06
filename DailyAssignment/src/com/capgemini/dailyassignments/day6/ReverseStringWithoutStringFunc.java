/**
 *  How to reverse a String with out using string functions?
 */
package com.capgemini.dailyassignments.day6;

/**
 * @author DIBYENDU
 *
 */
import java.util.*;
public class ReverseStringWithoutStringFunc {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String str = sc.nextLine();
		System.out.print("The string after reversing: ");
		for(int i=str.length();i>0;--i)                 
			System.out.print(str.charAt(i-1));
		sc.close();
	}

}
