/**
 * 
 */
package com.capgemini.ex1;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.capgemini.service.GetValuesManager;

/**
 * @author DIBYENDU
 *
 */
public class GetValuesMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		GetValuesManager fm = new GetValuesManager();
		char ch = 'y';
		int choice=0;
		do {
			System.out.println("------------"
					+"\nEnter choice"
					+"\n------------"
					+"\n1. Add an item to HashMap"
					+"\n2. View List of HashMap values in sorted order");

			try {
				choice = sc.nextInt();
			}
			catch(InputMismatchException e){
				System.out.println(e+" : Enter only a integer for choice!");
				sc.nextLine();
				//e.printStackTrace();
			}
			switch(choice) {
			case 1:
				System.out.print("Enter the value: ");
				fm.addItemToMap(fm.readValue());
				break;
			case 2:
				System.out.print("The HashMap values in sorted are:");
				System.out.println(fm.getValues(fm.getMap()));
				fm.displaySortedValues(fm.getValues(fm.getMap()));
				break;
			default:
				System.out.println("Please enter a valid option");
				break;
			}
			System.out.print("Enter 'y' to continue:");
			ch = sc.next().charAt(0);
		}while(ch == 'y');
		System.out.println("\n---\nEnd\n---");
		sc.close();
	}
}