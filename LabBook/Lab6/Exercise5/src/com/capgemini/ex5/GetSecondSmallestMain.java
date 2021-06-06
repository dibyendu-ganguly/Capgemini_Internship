/**
 * 
 */
package com.capgemini.ex5;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.capgemini.service.GetSecondSmallestManager;

/**
 * @author DIBYENDU
 *
 */
public class GetSecondSmallestMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		GetSecondSmallestManager gm = new GetSecondSmallestManager();
		char ch = 'y';
		int[] arr = null;
		int result;
		int choice = 0;
		do {
			System.out.println("------------"
					+"\nEnter choice"
					+"\n------------"
					+"\n1. To create the array of numbers"
					+"\n2. To get the second smallest number of the array");
			try {
				choice = sc.nextInt();
				sc.nextLine();
			} catch(InputMismatchException e) {
				System.out.println(e + " : Enter only a integer for choice!");
				sc.nextLine();
				continue;
			}
			switch(choice) {
			case 1:
				arr = gm.createArray();
				break;
			case 2:
				try {
					result = gm.getSecondSmallest(arr);
					System.out.println("The second smallest value of the integer array: "+ result);
				}catch(RuntimeException e) {
					System.out.println(e);
					
				}
				break;
			default:
				System.out.println("Please enter a valid option");
				break;
			}
			
			
			System.out.print("\nEnter 'y' to continue:");
			ch = sc.next().charAt(0);
			
		}while(ch=='y');
		
		System.out.println("\n---\nEnd\n---");
		
		sc.close();
	}

}
