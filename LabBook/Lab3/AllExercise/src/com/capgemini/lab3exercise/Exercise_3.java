/**
 * 
 * Exercise 3: Create a method which accepts a String and 
 * replaces all the consonants in the String with the next alphabet. 
 * Note: Consonant refers to all alphabets excluding vowels
 * 
 * Method Name 			alterString 
 * Method Description 	Replace consonants 
 * Argument 			String 
 * Return Type 			String 
 * Logic 				Return the String replacing all the consonants with the next character. 
 * 						For Example :JAVA should be changed as KAWA 
 * 
 * 
 */
package com.capgemini.lab3exercise;

/**
 * @author DIBYENDU
 *
 */
import java.util.*;
public class Exercise_3 {

	/**
	 * @param args
	 */
	static String alterString(String s) {
		char[] ch=s.toCharArray();
		for(int i=0;i<s.length();i++) {
			if(ch[i] == 'z' || ch[i] == 'Z')
				ch[i]= (char)((int)ch[i]-25);
			else if(ch[i] != 'a' && ch[i] != 'e' && ch[i] != 'i' && ch[i] != 'o' && ch[i] != 'u' && ch[i] != 'A' && ch[i] != 'E' && ch[i] != 'I' && ch[i] != 'O' && ch[i] != 'U' )
				ch[i]= (char)((int)ch[i]+1);
			
		}
			
		String res = new String(ch);
		return res;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String str = sc.nextLine();
		String result = alterString(str);
		System.out.println("The result is : " + result);
		sc.close();
	}

}
