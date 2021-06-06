/**
 * 
 */
package com.capgemini.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 * @author DIBYENDU
 *
 */
public class GetSecondSmallestManager {
	Scanner sc = new Scanner(System.in);
	int n =0;
	int[] array;
	public int[] createArray() {
		do {
			try {
				System.out.print("Enter the number of elements of the array: ");
				n = sc.nextInt();
				sc.nextLine();
				array = new int[n];
			} catch(InputMismatchException e) {
				System.out.println(e + " Number of elements of the array cannot be anything other than digits");
				sc.nextLine();
				continue;
			}
			break;
		}while(true);
		System.out.println("Enter the "+n+" elements of the array:");
		
		for(int i=0;i<n;i++) {
			do {
				try {
					array[i]=sc.nextInt();
					sc.nextLine();
				} catch(InputMismatchException e) {
					System.out.println(e + "Array element cannot be anything but digits. Enter a digit:");
					sc.nextLine();
					continue;
				}
				break;
			}while(true);	
		}
		return array;	
	}
	/**
	 * Get the second smallest element in the array 
	 * @param arr int[] -> integer array
	 * @return int ->second smallest 
	 */
	public int getSecondSmallest(int arr[]) {
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
		
		if(arr.length<=1)
			throw new RuntimeException("Array size is less than 1; Cannot get second smallest value");
			
		List<Integer> intList = new ArrayList<Integer>(arr.length);
		for (int i : arr)
		{
		    intList.add(i);
		}
		Collections.sort(intList);
		int secondSmallest = intList.get(1);
		return secondSmallest;
	}
}
