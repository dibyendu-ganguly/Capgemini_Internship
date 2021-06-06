/**
 * 
 */
package com.capgemini.service;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author DIBYENDU
 *
 */
public class CountCharsManager {
	private HashMap<Character,Integer> map=new HashMap<Character,Integer>();//Creating HashMap 
	Scanner sc = new Scanner(System.in);
	/**
	 * Takes user input for number of characters
	 *  
	 * @return a character array 
	 */
	public char[] createCharArray() {
		int charNum=0;
		System.out.print("Enter the number of characters to add in the character array:");
		do {
			try {
				charNum = sc.nextInt();
				sc.nextLine();
			}catch(InputMismatchException e) {
				System.out.println(e + "\nEnter only a digit to specify the number of characters:");
				sc.nextLine();
				continue;
			}
			break;
		}while(true);
		
		
		char[] charArr = new char[charNum];
		System.out.println("Enter the characters: ");
		for(int i=0;i<charNum;i++)
			charArr[i]=sc.nextLine().charAt(0);
		return charArr;	
	}
	
	/**
	 * method that accepts a character array and count the number of times each character is present in the array.
	 * @param arr -> character array  (char[] arr)
	 * @return map -> Map<Character, Integer>
	 */
	public HashMap<Character, Integer> countChars(char[] arr) {
		if(arr==null)
			throw new RuntimeException("Character Array is null");
		boolean empty = true;
		for (Object ob : arr) {
		  if (ob != null) {
		    empty = false;
		    break;
		  }
		}
		
		if(empty==true)
			throw new RuntimeException("Character Array is null");
		for(int j=0;j<arr.length;j++) {
			Integer count=0;
			for(int i = 0; i < arr.length; i++)
	        {
	            if(arr[i] == arr[j])
	            {
	                count++;
	            }
	        }
			map.put(arr[j], count);
		}
		return map;
	}
	
	
}

