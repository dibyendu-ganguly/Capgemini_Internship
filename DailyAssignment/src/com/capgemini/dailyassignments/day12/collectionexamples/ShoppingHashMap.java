/**
 * create a hashmap to store shopping list  with id and nameofitem
 * and perform
 * create
 * read the keyset
 * read the values
 * read the entryset
 * replace
 * sort the values using treemap
 */
package com.capgemini.dailyassignments.day12.collectionexamples;

import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

/**
 * @author DIBYENDU
 *
 */
public class ShoppingHashMap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		HashMap<String,Integer>  shoppingList = new HashMap<String,Integer>();
		int ch=1,choice;
		do {
			System.out.println("Enter your choice:\n"
					  +"1 to Add New Item\n"
					  +"2 to Read key set\n"
					  +"3 to Read values\n"
					  +"4 to Read Entryset\n"
					  +"5 to Replace\n"
					  +"6 to sort");
			choice = sc.nextInt();
			String k;
			int v;
			switch(choice) {
				case 1:
					System.out.print("Enter key name: ");
					k=sc.nextLine();
					System.out.print("Enter value: ");
					v=sc.nextInt();
					shoppingList.put(k, v);
					System.out.println("To continue Press 1, else 0");
				    ch=sc.nextInt();
				    if(ch==1)
				    break;
				case 2:
					Set<String> shoppingKeySet = shoppingList.keySet();
					System.out.println("Key values of above HashMap = " + shoppingKeySet);
					System.out.println("To continue Press 1, else 0");
				    ch=sc.nextInt();
				    if(ch==1)
				    break;
				case 3:
					Collection<Integer> shoppingValueSet = shoppingList.values();
					System.out.println("Values of the above HashMap = " + shoppingValueSet);
					System.out.println("To continue Press 1, else 0");
				    ch=sc.nextInt();
				    if(ch==1)
				    break;
				case 4:
					Set<Entry<String, Integer>> shoppingEntrySet = shoppingList.entrySet();
					System.out.println("Key and Values from above HashMap = " + shoppingEntrySet);
					System.out.println("To continue Press 1, else 0");
				    ch=sc.nextInt();
				    if(ch==1)
				    break;
				
				default:
					System.out.println("Please enter a valid option");
					System.out.println("To continue Press 1, else 0");
				    ch=sc.nextInt();
				    if(ch==1)
				    break;
					
					
			}
		}while(ch==1);
		
		sc.close();
	}

}
