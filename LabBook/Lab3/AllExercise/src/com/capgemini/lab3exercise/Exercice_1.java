/**
 * Exercise 1: Write a Java program that reads a line of integers 
 * and then displays each integer and the sum of all integers. 
 * (Use String Tokenizer class)?
 */
package com.capgemini.lab3exercise;
import java.util.*;

/**
 * @author DIBYENDU
 *
 */
public class Exercice_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the line of integers: ");
		String strOfInt = sc.nextLine();
		int sum=0,i;
		StringTokenizer st = new StringTokenizer(strOfInt," "); 
		//System.out.println(strOfInt); //To display the integers as String objects
		System.out.println("The integers are: ");
		while (st.hasMoreTokens()) {
			String s = st.nextToken();
	        i=Integer.parseInt(s);
	        System.out.print(i+" "); 		//To display the integers as int data types
	        sum=sum+i;
	     }
		System.out.println("\nSum of the integers is: "+sum);
		
		
		
		sc.close();

	}

}
