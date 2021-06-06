/**
 * 
 */
package com.capgemini.dailyassignments.day11.flowercollection;

/**
 * @author DIBYENDU
 *
 */
import java.util.*;
public class MainFlower {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		HashSet<Flower> flowers = new HashSet<>();
		
		int ch=1;
		int id=0;
		int choice;
		do {
			System.out.println("Enter your choice: ");
			System.out.println("1 for Create");
			System.out.println("2 for Display All");
			System.out.println("3 for Remove");
		
			choice = sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter the name of the flower: ");
				sc.nextLine();
				String name = sc.nextLine();
				System.out.println("Enter the Price per Kg: ");
				double price = sc.nextDouble();
				System.out.println("Enter the Quantity: ");
				float qty = sc.nextFloat();
				
				flowers.add(new Flower(++id,name,price,qty));
				
				System.out.println("\nTo continue Press 1, else 0");
			    ch=sc.nextInt();
			    if(ch==1)
			    break;
			case 2:
				System.out.println("The details of the flowers are: ");
				Iterator<Flower> flItr = flowers.iterator();
				System.out.println("Id\t||\tName\t||\tPrice per Kg\t||\tQuantity ");
				System.out.println("====================================================================");
				while(flItr.hasNext()) {
					Flower fl = flItr.next();
					System.out.println(fl.getId()+"\t||\t"+fl.getFname()+"\t||\t"+fl.getPricePerKg()+"\t\t||\t"+fl.getQty());
					System.out.println("--------------------------------------------------------------------");
				}
				System.out.println("\nTo continue Press 1, else 0");
			    ch=sc.nextInt();
			    if(ch==1)
			    break;
			case 3:
				System.out.println("Enter the Flower Id to remove:");
				int idRemove = sc.nextInt();
				Iterator<Flower> flRItr = flowers.iterator();
				while(flRItr.hasNext()) {
					Flower fl = flRItr.next();
					if(fl.getId()==idRemove) {
						flRItr.remove();
					}
				}
				System.out.println("\nTo continue Press 1, else 0");
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
