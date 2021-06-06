/**
 * 
 */
package com.capgemini.ex2;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

import com.capgemini.service.CountCharsManager;



/**
 * @author DIBYENDU
 *
 */
public class CountCharsMain {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();//Creating HashMap 
		Scanner sc = new Scanner(System.in);
		CountCharsManager cm = new CountCharsManager();
		char[] arr = null;
		char ch = 'y';
		int choice=0;
		do {
			System.out.println("------------"
					+"\nEnter choice"
					+"\n------------"
					+"\n1. To create the character array"
					+"\n2. View HashMap of characters and their counts");

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
				arr=cm.createCharArray();
				break;
			case 2:
				
				try {
					
					map = cm.countChars(arr);
					System.out.println("The chararcter and their counts are:");
					System.out.format("%10s || %5s","Character","Count");
					System.out.println("\n-------------------");
					for (Map.Entry<Character,Integer> mapElement : map.entrySet()) {
			            System.out.format("%10s || %5s\n",mapElement.getKey(),mapElement.getValue());
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
