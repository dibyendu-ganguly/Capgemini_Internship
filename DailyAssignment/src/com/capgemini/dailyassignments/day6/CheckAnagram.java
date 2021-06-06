/**
 * Write a java program to check if two strings are anagram are not?
 */
package com.capgemini.dailyassignments.day6;

/**
 * @author DIBYENDU
 *
 */
import java.util.*;
public class CheckAnagram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string 1: ");
		String str1 = sc.nextLine();
		char[] ch1=str1.toCharArray(); 
		System.out.print("Enter the string 2: ");
		String str2 = sc.nextLine();
		char[] ch2=str2.toCharArray(); 
		
		int n1 = str1.length();
        int n2 = str2.length();
  
        
        if (n1 != n2)
            System.out.println("The strings are not anagrams");
  
        // Sort both strings
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        int flag = 0;
  
        // Compare sorted strings
        for (int i = 0; i < n1; i++) {
        	if (ch1[i] != ch2[i]) {
        		System.out.println("The strings are not anagrams");
        		flag = 1;
        		break;
        	}
        }
        if(flag==0) {
        	System.out.println("The strings are anagrams");
        }
  
        
		
		sc.close();
	}

}
