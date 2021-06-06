/**
 * 
 * Exercise 1: Create a method which accepts an array of integer elements and return the second smallest element in the array
 * Note: Complete this exercise on Doselect.                     [DoSelect-Lab3_1]
 * 
 * Method Name 			getSecondSmallest
 * Method Description 	Get the second smallest element in the array 
 * Argument 			int[] 
 * Return Type 			int 
 * Logic 				Sort the array and return the second smallest element in the array 

 * 
 */

/**
 * @author DIBYENDU
 *
 */
package com.capgemini.lab2allexercise;
import java.util.*;
public class Exercise_1 {
	
	static int getSecondSmallest(int arr[]) {
		List<Integer> intList = new ArrayList<Integer>(arr.length);
		for (int i : arr)
		{
		    intList.add(i);
		}
		Collections.sort(intList);
		int secondSmallest = intList.get(1);
		return secondSmallest;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements of the array: ");
		int n = sc.nextInt();
		System.out.println("Enter the "+n+" elements of the array:");
		int[] array = new int[n];
		for(int i=0;i<n;i++) {
			array[i]=sc.nextInt();
		}
		int result = getSecondSmallest(array);
		System.out.println("The smallest element of the array is: "+ result);

		sc.close();
	}

}
