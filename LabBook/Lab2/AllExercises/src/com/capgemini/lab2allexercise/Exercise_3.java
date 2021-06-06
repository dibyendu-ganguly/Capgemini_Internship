/**
 * 
 * Exercise 3: Create a method which accepts an integer array, reverse the numbers in the array and returns the resulting array in sorted order
 * Note: Complete this exercise on Doselect.                     [DoSelect-Lab3_3]
 * 
 * Method Name 			getSorted 
 * Method Description 	Return the resulting array after reversing the numbers and sorting it 
 * Argument 			int [] 
 * Return Type 			int 
 * Logic 				Accept and integer array, reverse the numbers in the array, sort it and return the resulting array. 
 * Hint 				Convert the numbers to String to reverse it 


 * 
 */

/**
 * @author DIBYENDU
 *
 */
package com.capgemini.lab2allexercise;
import java.util.*;
//import java.io.*;
//import java.lang.*;

public class Exercise_3 {
	static int[] getSorted(int array[]) {
		String[] stringArray = new String[array.length];
		int[] intArray= new int[array.length];
		List<Integer> intList = new ArrayList<Integer>(array.length);
		System.out.println();
		for(int i=0;i<array.length;i++) {
			stringArray[i]=String.valueOf(array[i]);
			//System.out.println(stringArray[i]);
		}
		for(int i=0;i<array.length;i++) {
			 String reverse = new StringBuffer(stringArray[i]).reverse().toString();
			 //System.out.print(reverse+" ");
		     stringArray[i]=reverse;
		     //System.out.print(stringArray[i]+" ");
			 //System.out.println(stringArray[i].getClass());
		}
		
		for(int i=0;i<array.length;i++) {
			intArray[i]=Integer.parseInt(stringArray[i]);
		     //System.out.print(intArray[i]+" ");
		     //System.out.println(((Object)intArray[i]).getClass().getSimpleName());
		}
		
		for (int i : intArray)
		{
		    intList.add(i);
		}
		Collections.sort(intList);
		//Collections.reverse(intList);
		
		final int[] res = new int[intList.size()];
		int index = 0;
		for (final Integer value: intList) {
		   res[index++] = value;
		}
		
		
		return res;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements of the array: ");
		int n = sc.nextInt();
		System.out.println("Enter the " + n + " elements of the array:");
		int[] array = new int[n];
		for(int i=0;i<n;i++) {
			array[i]=sc.nextInt();
		}
		
		System.out.println("\nArray before operation:");
		for (Integer i : array) {
	         System.out.print(i+" ");
	    }
		int[] result = getSorted(array);
		
		System.out.println("\nArray after operation:");
		for (Integer i : result) {
	         System.out.print(i+" ");
	      }
		sc.close();
		
	}

}
