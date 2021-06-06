/**
 * 
 */
package com.capgemini.ex7;

import java.util.Scanner;

import com.capgemini.service.GetSortedManager;

/**
 * @author DIBYENDU
 *
 */
public class GetSortedMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GetSortedManager gs = new GetSortedManager();

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
		int[] result = gs.getSorted(array);

		System.out.println("\nArray after operation:");
		for (Integer i : result) {
			System.out.print(i+" ");
		}
		sc.close();
	}

}


