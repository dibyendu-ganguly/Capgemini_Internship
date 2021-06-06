/**
 * Write a Java program to remove characters from the first string which are present in the second string?
 */
package com.capgemini.dailyassignments.day6;

/**
 * @author DIBYENDU
 *
 */
import java.util.*;
public class RemoveString2FromString1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first string: ");
        String str1 = sc.nextLine();
 
        System.out.print("Enter the second string: ");
        String str2 = sc.nextLine();
       
        String s;
        s = str1;
        for(int i=0;i<str2.length();i++) {
        	str1 = str1.replace(str2.charAt(i)+"", "");
        }
        	
        
        
        System.out.println("The string after removing character of"+str2+" from "+s+": "+str1.trim());
		
		sc.close();
	}

}
