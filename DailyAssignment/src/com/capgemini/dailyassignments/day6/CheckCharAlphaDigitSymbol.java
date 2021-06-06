/**
 * Write a java program to check whether at given index is alphabet or symbol or digit?
 */
package com.capgemini.dailyassignments.day6;

/**
 * @author DIBYENDU
 *
 */
import java.util.*;
public class CheckCharAlphaDigitSymbol {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		 
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
 
        System.out.print("Enter the index (index starts from 0): ");
        int index = sc.nextInt();
        if(Character.isAlphabetic(str.charAt(index)))
        	System.out.println("The character at the specified index is an alphabet");
        else if(Character.isDigit(str.charAt(index)))
        	System.out.println("The character at the specified index is a digit");
        else
        	System.out.println("The character at the specified index is a symbol");
        
        sc.close();

	}

}
