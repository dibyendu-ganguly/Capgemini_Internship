/**
 * 
 * how to remove  a given character from a string
 * 
 */
package com.capgemini.dailyassignments.day6;

import java.util.Scanner;

/**
 * @author DIBYENDU
 *
 */
public class RemoveCharFromString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first string: ");
        String str = sc.nextLine();
        //String strR = str.toLowerCase();
 
        System.out.print("Enter the character: ");
        char ch = sc.next().charAt(0);
        //char chR = Character.toLowerCase(ch);  
        
       str = str.replace(ch+"", "");
        
        System.out.println("The string after removing character "+ch+" from "+str+": "+str.trim());
		
		sc.close();

	}

}
