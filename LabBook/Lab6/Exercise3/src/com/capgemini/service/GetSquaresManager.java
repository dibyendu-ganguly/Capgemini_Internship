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
public class GetSquaresManager {
	Scanner sc = new Scanner(System.in);
	/**
	 * method to create a integer array with values as user input
	 * @return the integer Array
	 */
	public int[] createArray() {
		int intNum;
		do {
			try {
				System.out.println("Enter the number of elements of the array to get their squares");
				intNum = sc.nextInt();
				sc.nextLine();
			}catch(InputMismatchException e) {
				System.out.println(e + " : number of elements can only be digits");
				sc.nextLine();
				continue;
			}
			break;
		}while(true);
		
		
		System.out.println("Enter the elemnts:");
		int[] arr = new int[intNum];
		for(int i=0;i<arr.length;i++) {
			do {
				try {
					arr[i]=sc.nextInt();
				}catch(InputMismatchException e) {
					System.out.println(e + " : Enter integers only");
					sc.nextLine();
					continue;
				}
				break;
			}while(true);	
		}
		return arr;
		
	}
	/**
	 * Accepts a list of numbers and return their squares
	 * @param arr
	 * @return the HashMap object with numbers as key and their squares as value
	 */
	public HashMap<Integer, Integer> getSquares(int[] arr){
		if(arr==null)
			throw new RuntimeException("Integer Array is null");
		boolean empty = true;
		for (Object ob : arr) {
		  if (ob != null) {
		    empty = false;
		    break;
		  }
		}
		if(empty==true)
			throw new RuntimeException("Integer Array is null");
		HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
		for(int i=0;i<arr.length;i++)
			map.put(arr[i],arr[i]*arr[i]);
		return map;
		
	}
	
}