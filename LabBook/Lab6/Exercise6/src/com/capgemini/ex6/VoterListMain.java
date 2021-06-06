/**
 * 
 */
package com.capgemini.ex6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.capgemini.service.VoterListManager;

/**
 * @author DIBYENDU
 *
 */
public class VoterListMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		List<String> list = new ArrayList<String>();
		
		VoterListManager vl = new VoterListManager();
		char ch = 'y';
		int choice = 0;
		do {
			System.out.println("------------"
					+"\nEnter choice"
					+"\n------------"
					+"\n1. Add an item to HashMap"
					+"\n2. View List of HashMap values in sorted order");
			try {
				choice = sc.nextInt();
				sc.nextLine();
			}
			catch(InputMismatchException e){
				System.out.println(e+" : Enter only a integer for choice!");
				sc.nextLine();
				//e.printStackTrace();
				continue;
			}
			switch(choice) {
			case 1:
				map = vl.createVoterList();
				break;
			case 2:
				try {
					list = vl.voterList(map);
					if (list.isEmpty() || list == null)
						throw new RuntimeException("No voters is eligible for voting");
					System.out.println("The list of Id of eligible voters");
					System.out.println("=================================");
					System.out.println("Id\n--");
					for(int i=0;i<list.size();i++) {
						System.out.println(list.get(i));
					}
				} catch (RuntimeException e) {
					System.out.println(e);
				}
				break;
			default:
				System.out.println("Please enter a valid option");
				break;

			}
			
			System.out.print("Enter 'y' to continue:");
			ch = sc.next().charAt(0);
		}while(ch=='y');
		System.out.println("\n---\nEnd\n---");
		sc.close();
	}

}
