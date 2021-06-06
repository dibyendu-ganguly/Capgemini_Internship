/**
 * 
 */
package com.capgemini.ex3;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

import com.capgemini.service.GetSquaresManager;

/**
 * @author DIBYENDU
 *
 */
public class GetSquaresMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();//Creating HashMap 
		Scanner sc = new Scanner(System.in);
		GetSquaresManager cm = new GetSquaresManager();
		int[] arr = null;
		char ch = 'y';
		int choice=0;
		do {
			System.out.println("------------"
					+"\nEnter choice"
					+"\n------------"
					+"\n1. To create the array of numbers"
					+"\n2. View HashMap of numbers and their squares");

			try {
				choice = sc.nextInt();
				sc.nextLine();
			}
			catch(InputMismatchException e){
				System.out.println(e+" : Enter only a integer for choice!");
				sc.nextLine();
				//e.printStackTrace();
			}
			
			switch(choice) {
			case 1:
				arr=cm.createArray();
				break;
			case 2:
				
				try {
					
					map = cm.getSquares(arr);
					System.out.println("The integer and their sqaures are:");
					System.out.format("%10s || %10s","Integer","Sqaures");
					System.out.println("\n------------------------");
					for (Map.Entry<Integer,Integer> mapElement : map.entrySet()) {
			            System.out.format("%10s || %10s\n",mapElement.getKey(),mapElement.getValue());
			        }
				}catch(RuntimeException e) {
					System.out.println(e);
				}
				
				break;
			default:
				System.out.println("Please enter a valid option");
			}
			System.out.print("\nEnter 'y' to continue:");
			ch = sc.next().charAt(0);
		}while(ch == 'y');
		System.out.println("\n---\nEnd\n---");
		sc.close();
	}
}