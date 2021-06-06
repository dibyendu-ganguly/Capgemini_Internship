/**
 * 
 * Exercise 2: Create a class containing a method to create the mirror image of a String. 
 * The method should return the two Strings separated with a pipe(|) symbol .
 * Method Name 			getImage 
 * Method Description 	Generate the mirror image of a String and add it to the existing string. 
 * Argument 			String 
 * Return Type 			String 
 * Logic 				Accepts One String 
 * 						Find the mirror image of the String 
 * 						Add the two Strings together separated by a pipe(|) symbol. 
 * For Example 
 * Input : EARTH 
 * Output : EARTH|HTRAE 
 * Hint: Use StringBuffer API (Ex: For this problem reverse method in Stringbuffer can be used) 
 * Note: Learn the other APIs in StringBuffer 

 * 
 */
package com.capgemini.lab3exercise;

/**
 * @author DIBYENDU
 *
 */
import  java.util.*;
public class Exercise_2 {

	/**
	 * @param args
	 */
	static String getImage(String s) {
		String rev = new StringBuffer(s).reverse().toString();
		String res = s + "|" + rev;
		return res;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string to find it's image: ");
		String str = sc.nextLine();
		String result = getImage(str);
		System.out.println("Image of the string \'"+str+"\' : "+result);
		
		
		sc.close();
	}

}
