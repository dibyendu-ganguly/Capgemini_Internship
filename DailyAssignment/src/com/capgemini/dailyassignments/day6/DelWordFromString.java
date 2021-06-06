/**
 * Write a java program to delete a given word from the string?
 */
package com.capgemini.dailyassignments.day6;

/**
 * @author DIBYENDU
 *
 */
import java.util.*;
public class DelWordFromString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
 
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
 
        System.out.print("Enter word you want to delete from string: ");
        String word = sc.nextLine();
        // Deleting word from
        str = str.replaceAll(word, "");
        System.out.println("The string after removing "+word+" is: "+str.trim());
        sc.close();

	}

}
